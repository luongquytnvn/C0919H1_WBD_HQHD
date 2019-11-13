package servlet;

import models.Customers;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet(name = "CustomerServlet")
public class CustomerServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        List<Customers> customers = new ArrayList<>();
        customers.add(new Customers("Chi Pu",1994,"Hà Nội","https://encrypted-tbn0.gstatic.com/images?q=tbn%3AANd9GcRXF5wP00mYRB0bAGuKSz5FfOUwe5YcUltcgyO4X5PeZecDqa8u"));
        customers.add(new Customers("Ông giáo",1995,"Hà Nội","https://i.ytimg.com/vi/vkq_d59ljPI/maxresdefault.jpg"));

        req.setAttribute("customers", customers);
        RequestDispatcher requestDispatcher = req.getRequestDispatcher("customer.jsp");
        requestDispatcher.forward(req,resp);
    }

}
