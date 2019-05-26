package servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.po.Users;

/**
 * Servlet implementation class ServletLogin
 */
@WebServlet("/ServletLogin")
public class ServletLogin extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServletLogin() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doPost(request,response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		Users u =new Users();
		String username=request.getParameter("username");
		String password=request.getParameter("password");
        u.setUsername(username);
        u.setPassword(password);
        //判断用户名，密码是否为admin
	   
        if(u.getUsername().equals("admin")&&u.getPassword().equals("admin"))
        {
        	//内部跳转
        	request.getRequestDispatcher("/login_success.jsp").forward(request,response);
        }
        else
        {
        	//重定向跳转
        	response.sendRedirect(request.getContextPath()+"/login_failure.jsp");
        }
	}
	
	

}
