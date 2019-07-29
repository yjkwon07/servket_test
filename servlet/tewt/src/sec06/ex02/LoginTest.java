package sec06.ex02;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


/**
 * Servlet implementation class LoginTest
 */
@WebServlet("/loginsessions")
public class LoginTest extends HttpServlet {
	private static final long serialVersionUID = 1L;

	ServletContext context = null;
	List<String> user_list = new ArrayList<String>();
	String ischange = "istrue";
	List<User> user_check = new ArrayList<User>();

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html;charset=utf-8");

		context = getServletContext();
		PrintWriter out = response.getWriter();
		HttpSession session = request.getSession();
		String user_id = request.getParameter("user_id");
		String user_pw = request.getParameter("user_pw");
		LoginImpl loginUser = new LoginImpl(user_id, user_pw);

		if (session.isNew()) {
			session.setAttribute("loginUser", loginUser);
			user_list.add(user_id);
			ischange += "true";
			user_check.add(new User(loginUser));
			context.setAttribute("user_check", user_check);
			context.setAttribute("user_list", user_list);
			context.setAttribute("ischange", ischange);
		}

		out.println("<html><body>");
		out.println("���̵�� " + loginUser.user_id + "<br>");
		out.println("�� �����ڼ���" + LoginImpl.total_user + "<br><br>");
		out.println("���� ���̵�:<br>");

		List<String> list = (ArrayList<String>)context.getAttribute("user_list");
		for (int i = 0; i < list.size(); i++) {
			out.println(list.get(i) + "<br>");
		}

		List<User> checks = (ArrayList)context.getAttribute("user_check");
		for (User lists : checks) {
			out.println(lists._getuser() + "<br>");
		}

		// Servlet�� init�� �ִ� �����̴� 
		// �� ���� �����ؼ� ���� �ϴ°�!!
		out.println("list size :" + list.size());
		out.println("user_list size :" + user_list.size());
		out.print(ischange);
		out.println("<a href='seeslogout?user_id=" + user_id + "'>�α׾ƿ� </a>");
		out.println("</body></html>");
	}
}