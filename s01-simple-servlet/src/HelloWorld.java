import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by yinweiluo on 2020/11/4
 */
@WebServlet("/hello")
public class HelloWorld extends HttpServlet {

  private String message;

  @Override
  public void init() throws ServletException {
    message = "Hello world, this message is from servlet!";
  }

  @Override
  protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    resp.setContentType("text/html");//设置响应的内容类型
    PrintWriter out = resp.getWriter();
    say();
    out.println("<h1>" + message + "</h1>");
  }

  @Override
  public void destroy() {
    super.destroy();
  }

  public void say(){
    System.out.println("1");
  }
}
