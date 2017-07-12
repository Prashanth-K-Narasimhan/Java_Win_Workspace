

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LoginCheck
 */
@WebServlet("/LoginCheck")
public class LoginCheck extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private String line;

	File file = new File("G:\\CustomerWebDataBase.txt");
	public FileWriter fw = null;
	public BufferedWriter bw = null;
	
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		  
		PrintWriter out = response.getWriter();
		String userid = request.getParameter("userid");
		  String user = request.getParameter("user");
		  String gender = request.getParameter("gender");
		  String age = request.getParameter("age");
		  String country = request.getParameter("country");
		  String city = request.getParameter("city");
		  String PIN = request.getParameter("PIN");
		  String Phone = request.getParameter("Phone");
		  String AOI = request.getParameter("Area Of Interest");
		  String date = request.getParameter("date");
		  
	//	  Data(userid, user, gender, age, country, city, PIN, Phone, AOI, date);
		  
		  line = userid+"\t"+user+"\t"+gender+"\t"+age+"\t"+country+"\t"+city+"\t"+PIN+"\t"+Phone+"\t"+AOI+"\t"+date;
	 		
		  try 
			{
			  fw = new FileWriter(file,true);
	          bw = new BufferedWriter(fw);
			} 
			catch (IOException e) 
			{
				System.out.println(" IOException occurs...");
			}
		  
		   bw.write(line);
           bw.newLine();
           bw.close();
           fw.close();
           out.println("Data Successfully Written to file .....");
			
		  }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
class Data
{
	public String ID;
	public String Name;
	public String Gender;
	public int Age;
	public String Address;
	public String City;
	public String Country;
	public String PIN;
	public String Phone;
	public String AOI;
	public Date Date;
	
	public Data(String userid, String user, String gender, String age, String country, String city, String PIN, String Phone, String AOI, String date)
	{
		this.ID = ID;
		this.Name = Name;
		this.Gender = Gender;
		this.Age =  Age;
		this.Address = Address;
		this.City = City;
		this.Country = Country;
		this.PIN = PIN;
		this.Phone = Phone;
		this.AOI = AOI;
		this.Date = Date;
		
	}
}
