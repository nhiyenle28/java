package filter;

import java.io.IOException;
import javax.servlet.*;

public class InputFilter implements Filter {
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
            throws IOException, ServletException {
        String username = request.getParameter("username");
        if (username == null || username.trim().isEmpty()) {
            request.setAttribute("error", "Tên người dùng không được để trống.");
            RequestDispatcher dispatcher = request.getRequestDispatcher("login.jsp");
            dispatcher.forward(request, response);
        } else {
            chain.doFilter(request, response);
        }
    }

    public void init(FilterConfig config) {}
    public void destroy() {}
}
