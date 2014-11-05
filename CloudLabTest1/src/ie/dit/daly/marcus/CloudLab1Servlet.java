package ie.dit.daly.marcus;

import java.io.IOException;
import javax.servlet.http.*;

@SuppressWarnings("serial")
public class CloudLab1Servlet extends HttpServlet {
	public void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws IOException {
		resp.setContentType("text/plain");
		resp.getWriter().println("Wrong servlet Mark");
	}
}
