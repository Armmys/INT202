package controller;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;
import model.QuizSession;

import java.io.IOException;

@WebServlet(name = "ResetQuizServlet", value = "/ResetQuizServlet")
public class ResetQuizServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession session = request.getSession();
        QuizSession quizSession = (QuizSession)session.getAttribute("quizSession");
        quizSession.resetQuiz();
        response.sendRedirect("index.jsp");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
