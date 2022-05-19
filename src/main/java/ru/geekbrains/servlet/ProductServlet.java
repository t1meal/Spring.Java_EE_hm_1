package ru.geekbrains.servlet;


import resurses.ProductGenerator;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "product_servlet", urlPatterns = "/products")
public class ProductServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        resp.getWriter().println(new ProductGenerator().generate(3, "bread"));
        resp.getWriter().println(new ProductGenerator().generate(3, "milk"));
        resp.getWriter().println(new ProductGenerator().generate(4, "beer"));
    }
}

