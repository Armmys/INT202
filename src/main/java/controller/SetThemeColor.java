package controller;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import java.io.IOException;

@WebServlet(name = "SetThemeColor", value = "/SetThemeColor")
public class SetThemeColor extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getRequestDispatcher("/settheme.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String bgColor = request.getParameter("bg");
        Cookie ck = new Cookie("bgColorCookie",bgColor);
        ck.setMaxAge(3*60*60*24);
        response.addCookie(ck);
        response.sendRedirect("index.jsp");
    }
}
