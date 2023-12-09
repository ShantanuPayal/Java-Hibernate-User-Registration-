

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.websocket.Session;
import mypack.Register;

import java.io.IOException;
import java.io.PrintWriter;

import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 * Servlet implementation class RegisterServ
 */
@WebServlet("/RegisterServ")
public class RegisterServ extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		try {
			
			Configuration cfg=new Configuration();
			cfg.configure("hibernate.cfg.xml");
			SessionFactory factory=cfg.buildSessionFactory();
			org.hibernate.Session session=factory.openSession();
			Transaction tr=session.beginTransaction();
			
			
			response.setContentType("text/html");
			PrintWriter out=response.getWriter();

			String name=request.getParameter("name");
			String address=request.getParameter("address");
			String email=request.getParameter("email");
			String login=request.getParameter("login");
			String password=request.getParameter("password");
			
			
			Register r1=new Register();
			r1.setName(name);
			r1.setAddress(address);
			r1.setEmail(email);
			r1.setLogin(login);
			r1.setPassword(password);
			
			session.persist(r1);
			tr.commit();
			session.close();
			out.println("Succesfully Registered");
			
			//request.getRequestDispatcher("ViewServ").forward(request, response);
			
		}catch(Exception ee)
		{
			ee.printStackTrace();
		}
	}

}
