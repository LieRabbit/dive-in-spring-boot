package lierabbit.diveinspringboot.web.servlet;
//
//import javax.servlet.AsyncContext;
//import javax.servlet.ServletException;
//import javax.servlet.annotation.WebServlet;
//import javax.servlet.http.HttpServlet;
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//import java.io.IOException;
//
///**
// * 异步servlet
// *
// * @author xyy
// * @since 2018-11-16 18:27
// */
//@WebServlet(value = "/my/servlet/async", asyncSupported = true)
//public class MyServletAsync extends HttpServlet {
//
//    @Override
//    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        // 获取异步上下文
//        AsyncContext asyncContext = req.startAsync();
//        asyncContext.start(() -> {
//            try {
//                resp.getWriter().println("hello world in async");
//            } catch (IOException e) {
//                e.printStackTrace();
//            }
//            // 触发完成
//            asyncContext.complete();
//        });
//    }
//}
