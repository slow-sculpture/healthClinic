package main.java.app.servlets;

import main.java.app.user.User;
import main.java.app.user.UserRepo;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Optional;

@WebServlet(name = "RegisterServlet", urlPatterns = "/register")
public class RegisterServlet extends HttpServlet {
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String firstName = request.getParameter("firstName");
        String lastName = request.getParameter("lastName");
        String email = request.getParameter("email");
        String pass = request.getParameter("pass");
        String confirmPass = request.getParameter("confirmPass");

        //validation of provided data
        boolean isValid = true;
        //1. equality of passwords
        if (!pass.equals(confirmPass)) {
            System.out.println("Passwords mismatch");
            isValid = false;
        }
        //2. Blank fields
        if (firstName.isEmpty() || lastName.isEmpty() || email.isEmpty()
                || pass.isEmpty() || confirmPass.isEmpty()) {
            System.out.println("Pleas fill in all fields");
            isValid = false;
        }
        //3. User already exists
        Optional<User> byEmail = UserRepo.findByEmail(email);
        if (byEmail.isPresent()) {
            isValid = false;
            System.out.println("User with this email address already exists");
        }

        //validation 1-3 successful
        if (isValid) {
            User user = new User();
            user.setFirstName(firstName);
            user.setLastName(lastName);
            user.setEmail(email);
            user.setPassword(pass);

            UserRepo.save(user);
        }
        //redirect to login page
        //request.getRequestDispatcher("/login.jsp").forward(request,response);
    }


}
