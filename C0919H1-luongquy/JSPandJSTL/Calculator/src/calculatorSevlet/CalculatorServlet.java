package calculatorSevlet;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "calculatorSevlet.CalculatorServlet")
public class CalculatorServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        float firstNumber = Float.parseFloat(request.getParameter("firstnum"));
        float secondNumber = Float.parseFloat(request.getParameter("secondnum"));
        String operator = request.getParameter("operator");
        try {
        float result = Calculator.calculator(operator, firstNumber, secondNumber);
            request.setAttribute("result",result);
        } catch (Exception e) {
            String loi = e.getMessage();
            request.setAttribute("loi", loi);
        }
//        float result = Calculator.calculator(operator, firstNumber, secondNumber);
//        PrintWriter printWriter = response.getWriter();
//        printWriter.println(result);
        request.setAttribute("operator",operator);
        request.setAttribute("firstNumber",firstNumber);
        request.setAttribute("secondNumber",secondNumber);
//        request.setAttribute("result",Calculator.calculator(operator, firstNumber, secondNumber));
        RequestDispatcher requestDispatcher = request.getRequestDispatcher("index.jsp");
        requestDispatcher.forward(request, response);
    }
}
