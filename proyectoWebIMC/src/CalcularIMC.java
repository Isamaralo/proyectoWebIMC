

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class CalcularIMC
 */
@WebServlet("/CalcularIMC")
public class CalcularIMC extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CalcularIMC() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		String peso = request.getParameter("peso");
		String altura = request.getParameter("altura");
		double d_peso = Double.parseDouble(peso);
		double d_altura = Double.parseDouble(altura);
		
		Persona persona = new Persona(d_peso, d_altura);
		
		CalcularIMCService cimcs = new CalcularIMCService();
		double imc = cimcs.calcula(persona);
		
		TipoIMCService timcs = TipoIMCService.traduceIMC(imc);
		persona.setImc(timcs);
		PrintWriter pw = response.getWriter().append(persona.toString());
		System.out.println("<strong>Resultado de su índice de masa corporal (IMC) </strong>= "+pw);	
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
