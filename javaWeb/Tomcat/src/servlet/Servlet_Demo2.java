package servlet;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;



//
// 1. urlpartten:Servlet访问路径
//        1. 一个Servlet可以定义多个访问路径 ： @WebServlet({"/d4","/dd4","/ddd4"})
//        2. 路径定义规则：
//        1. /xxx：路径匹配
//            2. /xxx/xxx:多层路径，目录结构
//            3. *.do：扩展名匹配
@WebServlet("/demo1")//访问demo1路径时，使用的这个类
public class Servlet_Demo2 implements Servlet {
    @Override
    public void init(ServletConfig servletConfig) throws ServletException {

    }

    @Override
    public ServletConfig getServletConfig() {
        return null;
    }

    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        System.out.println("service..........");
    }

    @Override
    public String getServletInfo() {
        return null;
    }

    @Override
    public void destroy() {

    }
}
