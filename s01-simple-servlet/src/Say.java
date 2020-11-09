import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by yinweiluo on 2020/11/4
 */
@WebServlet("/say")
public class Say extends HttpServlet {
  @Override
  protected void doGet(HttpServletRequest req, HttpServletResponse resp){
    System.out.println(2);
  }
}
