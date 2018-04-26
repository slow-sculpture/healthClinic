package main.java.app.servlets;

import main.java.app.cart.Cart;
import main.java.app.cart.CartDetail;
import main.java.app.cart.CartRepo;
import main.java.app.order.*;
import main.java.app.user.User;
import main.java.app.user.UserRepo;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.time.LocalDateTime;
import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

@WebServlet(name = "CreateOrderServlet", urlPatterns = "/createOrder")
public class CreateOrderServlet extends HttpServlet {


    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        User userFromCookie = UserRepo.getUserCookie(request.getCookies());
        if (userFromCookie != null) {
            Optional<Cart> byUserId = CartRepo.findByUserId(userFromCookie.getId());

            byUserId.ifPresent(x -> createOrder(x));
            request.getRequestDispatcher("/orderHistory.jsp").forward(request,response);
        }
    }

    private void createOrder(Cart cart) {
        Order order = new Order();
        order.setPrice(cart.getTotalPrice());
        order.setUser(cart.getUser());

        OrderHistory oh = new OrderHistory();
        oh.setOrderStatus(OrderStatus.NEW);
        oh.setStatusDate(LocalDateTime.now());

        Set<OrderHistory> orderHistorySet = new HashSet<>();
        order.setOrderHistorySet(orderHistorySet);
        order.addOrderHistory(oh);

        order.setOrderDetailSet(new HashSet<>());

        for(CartDetail cd: cart.getCartDetailSet()){
            OrderDetail orderDetail = new OrderDetail();
            orderDetail.setOrder(order);
            orderDetail.setPrice(cd.getPrice());
            orderDetail.setService(cd.getService());
            order.addOrderDetail(orderDetail);
        }
        OrderRepo.saveOrder(order);
        CartRepo.removeCart(cart);
    }
}
