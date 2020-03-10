package yiwa.com;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.io.PrintWriter;

public class LoginServlet implements Servlet {
    @Override
    public void init(ServletConfig servletConfig) throws ServletException {

    }

    @Override
    public ServletConfig getServletConfig() {
        return null;
    }

    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        System.out.println("请求来了。。。。。");
        String user=servletRequest.getParameter("user");
        String password=servletRequest.getParameter("password");
        System.out.println(user+"  "+password);

        String[] interesting=servletRequest.getParameterValues("interesting");
        for (String item:interesting){
            System.out.println(item);
        }
        System.out.println(interesting.toString());
        HttpServletRequest httpServletRequest=(HttpServletRequest)servletRequest;
        String url=httpServletRequest.getRequestURI();
        System.out.println(url);
        String method=httpServletRequest.getMethod();
        System.out.println(method);
        servletResponse.setContentType("application/msword");
        PrintWriter printWriter=servletResponse.getWriter();
        printWriter.print("hello i give u");
    }

    @Override
    public String getServletInfo() {
        return null;
    }

    @Override
    public void destroy() {

    }
}
