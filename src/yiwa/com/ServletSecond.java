package yiwa.com;

import javax.servlet.*;
import java.io.IOException;
import java.io.InputStream;
import java.util.Enumeration;

public class ServletSecond implements Servlet {
    @Override
    public void init(ServletConfig servletConfig) throws ServletException {
        System.out.println("second servlet init...");
        String user=servletConfig.getInitParameter("user");
        System.out.println("user:"+user);
        Enumeration<String> names=servletConfig.getInitParameterNames();
        while (names.hasMoreElements()){
            String name=names.nextElement();
            System.out.println("name:"+name);
        }
        System.out.println("参数名："+servletConfig.getInitParameterNames());
        System.out.println("servlet名"+servletConfig.getServletName());
        ServletContext servletContext=servletConfig.getServletContext();
        String realPath=servletContext.getRealPath("/note.txt");
        System.out.println(realPath);

        ClassLoader classLoader=getClass().getClassLoader();
        InputStream is=classLoader.getResourceAsStream("jdbc.properties");
        System.out.println(is);
    }

    @Override
    public ServletConfig getServletConfig() {
        return null;
    }

    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {

    }

    @Override
    public String getServletInfo() {
        return null;
    }

    @Override
    public void destroy() {

    }
}
