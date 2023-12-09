
import mypack.Register;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 * Servlet implementation class ViewServ
 */
public class ViewServ extends HttpServlet {
	

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		 try {
	            Configuration cfg = new Configuration();
	            cfg.configure("hibernate.cfg.xml");
	            SessionFactory factory = cfg.buildSessionFactory();
	            Session session = factory.openSession();

	            Transaction tr = session.beginTransaction();

	           
	            List<Register> registerList = session.createQuery("FROM Register").list();

	            tr.commit();
	            session.close();

	            request.setAttribute("registerList", registerList);
	            request.getRequestDispatcher("view.jsp").forward(request, response);

	        } catch (Exception e) {
	            e.printStackTrace();
	            response.sendError(HttpServletResponse.SC_INTERNAL_SERVER_ERROR, "Error retrieving data");
	        }
	}



}
