package ie.dit.daly.marcus;

import java.io.IOException;
import javax.servlet.http.*;

@SuppressWarnings("serial")
public class DifferencesProduct extends HttpServlet {
	public void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws IOException {
		resp.setContentType("text/plain");
		resp.getWriter().println("The equation for this excersise is (A-B)*(C-D)\nTo use, enter '?A= &B= &C= &D= 'in the url, replacing the white space with numbers");
		
		/*Declare values*/
		String AString ;
		String BString ;
		String CString ;
		String DString ;
		float A;
		float B;
		float C;
		float D;
		float math1;
		float math2;
		float result;
		
		/*Get values*/
		AString = req.getParameter("A");
		BString = req.getParameter("B");
		CString = req.getParameter("C");
		DString = req.getParameter("D");
		
		/*float b = Float.parseFloat(BString);*/
		/*if any value is null*/
		if(AString == null){
			AString = "1";
		}
		if(BString == null){
			BString = "1";
		}
		if(CString == null){
			CString = "1";
		}
		if(DString == null){
			DString = "1";
		}
		
		/*Parse numbers, check if any aren't numbers*/
		/*if invalid set number to 1*/
		try {
			   A = Float.parseFloat((AString.trim()));
			} 
		catch (NumberFormatException e) {
				resp.getWriter().println("A is not a number, the value of "+ AString + " is 1");
				A = 1;
			}
		try {
			   B = Float.parseFloat((BString.trim()));
			} 
		catch (NumberFormatException e) {
				resp.getWriter().println("B is not a number, the value of "+ BString + " is 1");
				B = 1;
			}
		try {
			   C = Float.parseFloat((CString.trim()));
			}
		catch (NumberFormatException e) {
				resp.getWriter().println("C is not a number, the value of "+ CString + " is 1");
				C = 1;
			}
		try {
			   D = Float.parseFloat((DString.trim()));
			}
		catch (NumberFormatException e) {
				resp.getWriter().println("D is not a number, the value of "+ DString + " is 1");
				D = 1;
			}
		
		
		/*resp.getWriter().println(""+b);*/
		/*first bracket, (A-B)*/
		math1 = A - B;
		
		/*Second bracket, (C-D)*/
		math2 = C - D;
		
		result = math1 * math2;
		resp.getWriter().println("("+ AString + "-" + BString + ")" + "*(" + CString + "-" + DString + ")" + " = "  +result);
	}
}