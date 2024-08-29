

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet implementation class CalcularNumeroInteiro
 */
public class CalcularNumeroInteiro extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CalcularNumeroInteiro() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		// doGet(request, response);
		Integer number = Integer.parseInt(request.getParameter("numero"));
		Integer somatorio = 0;
		
		for(int i = 1; i<= number; i++) {
			somatorio = somatorio + i;
		}
		
		PrintWriter saida = response.getWriter();
		saida.print("<html lang=\"pt-br\"><meta charset=\"UTF-8\"<body><h1>O valor da somátoria entre os números 1 e " + number + " é: " + somatorio + "</h1></body>");
	}

}
