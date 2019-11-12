import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "displayDiscountServlet", urlPatterns = "/display-discount")
public class displayDiscountServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String description = request.getParameter("Description");
        float price = Float.parseFloat(request.getParameter("Price"));
        float percent = Float.parseFloat(request.getParameter("Percent"));
        float discountAmount = price * percent/100;
        float discountPrice = price - discountAmount;
        PrintWriter writer = response.getWriter();
        writer.println("<html>");
        writer.println(description + "<br/>Discount Amount: " + discountAmount + " <br/> Discount Price: " + discountPrice);
        writer.println("</html>");
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
