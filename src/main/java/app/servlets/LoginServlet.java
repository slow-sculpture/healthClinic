package main.java.app.servlets;

import main.java.app.user.User;
import main.java.app.user.UserRepo;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Optional;

@WebServlet(name = "LoginServlet", urlPatterns = "/login")
public class LoginServlet extends HttpServlet {
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String email = request.getParameter("email");
        String pass = request.getParameter("pass");

        Optional<User> byEmailAndPassword = UserRepo.findByEmailAndPassword(email, pass);
        byEmailAndPassword.ifPresent(x-> System.out.println(x.getId()));
        byEmailAndPassword.ifPresent(x-> System.out.println(x.getId()));

        if(byEmailAndPassword.isPresent()){
            response.addCookie((new Cookie("email", byEmailAndPassword.get().getEmail())));
        }
        //redirect to main page
        request.getRequestDispatcher("/index.jsp").forward(request,response);
    }

}
