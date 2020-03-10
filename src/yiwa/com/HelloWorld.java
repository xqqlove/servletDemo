package yiwa.com;

import javax.servlet.http.HttpServlet;
import java.io.IOException;
import java.io.PrintWriter;

public class HelloWorld extends HttpServlet {

    private String message;

    public HelloWorld(){
        System.out.println("servlet contructor....");
        this.message="qiangqiang";
    }



    protected void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
    }

    protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        response.setContentType("text.html");
        PrintWriter out = response.getWriter();
        out.write("<h1>" + message + "</h1>");
    }
}
