
import javax.servlet.*;
import javax.servlet.http.*;
import java.io.IOException;

public class InputFilter implements Filter {
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
            throws IOException, ServletException {

        String username = request.getParameter("username");

        if (username == null || username.trim().isEmpty()) {
            request.setAttribute("message", "Tên người dùng không được để trống.");
            RequestDispatcher dispatcher = request.getRequestDispatcher("login.jsp");
            dispatcher.forward(request, response);
        } else {
            chain.doFilter(request, response);
        }
    }
}
