package main.java.app.servlets;

import main.java.app.cart.Cart;
import main.java.app.cart.CartDetail;
import main.java.app.cart.CartRepo;
import main.java.app.service.Service;
import main.java.app.service.ServiceRepo;
import main.java.app.user.User;
import main.java.app.user.UserRepo;
import main.java.app.utils.ProjectHelper;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Optional;

@WebServlet(name = "CreateCartServlet", urlPatterns="/addToCart")
public class CreateCartServlet extends HttpServlet {

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        PrintWriter writer = response.getWriter();
        User user = UserRepo.getUserCookie(request.getCookies());

        Long serviceId = ProjectHelper.parseStringToLong(request.getParameter("serviceId"));


        if (serviceId > 0 && user != null) {
            Optional<Cart> byUserId = CartRepo.findByUserId(user.getId());
            if (byUserId.isPresent()) {
                Cart cart = byUserId.get();
                Optional<CartDetail> serviceInCart = cart.getCartDetailSet().stream()
                        .filter(cd -> cd.getService().getId().equals(serviceId))
                        .findFirst();
                if (serviceInCart.isPresent()) {
                    //produkt jest juz w koszyku
                    serviceInCart.get();
                    CartRepo.saveCart(cart);
                } else {
                    boolean result = createNewCartDetail(serviceId, cart);
                    if (result) {
                        CartRepo.saveCart(cart);
                        writer.write("Chosen service successfully added to cart!");
                    }
                }
            } else {
                Cart cart = new Cart();
                cart.setUser(user);
                cart.setCartDetailSet(new HashSet<>());
                boolean result = createNewCartDetail(serviceId, cart);
                if (result) {
                    CartRepo.saveCart(cart);
                    writer.write("Chosen service successfully added to cart!");
                } else {
                    writer.write("There's no such a service");
                }
            }
        }else {
            if (serviceId == 0) {
                writer.write("There's no such a service");
            }

            if (user == null) {
                writer.write("Please log in!");
            }
        }
        request.getRequestDispatcher("/cart.jsp").forward(request, response);
    }

    private boolean createNewCartDetail(Long serviceId, Cart cart) {
        Optional<Service> byId = ServiceRepo.findOneById(serviceId);
        if(byId.isPresent()){
            CartDetail cd = new CartDetail();
            cd.setService(byId.get());
            cd.setPrice(byId.get().getPrice());
            cart.addCartDetail(cd);
            return true;
        }return false;
    }}
