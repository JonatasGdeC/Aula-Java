

import jakarta.servlet.ServletException;
import java.time.temporal.ChronoUnit;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDate;
/**
 * Servlet implementation class CalcularIdadeDias
 */
public class CalcularIdadeDias extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CalcularIdadeDias() {
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
		//doGet(request, response);
		
		Integer dia = Integer.parseInt(request.getParameter("dia"));
		Integer mes = Integer.parseInt(request.getParameter("mes"));
		Integer ano = Integer.parseInt(request.getParameter("ano"));
		
		LocalDate dataUsuario = LocalDate.of(ano, mes, dia);
		LocalDate primeiroJaneiro = LocalDate.of(ano, 1, 1);
		long diasPassados = ChronoUnit.DAYS.between(primeiroJaneiro, dataUsuario);
		
		PrintWriter saida = response.getWriter();
		saida.print("<html lang=\"pt-br\"><meta charset=\"UTF-8\"<body><h1>Você nasceu " + diasPassados +  " dias depois de 1° de Janeiro de " + ano + "</h1></body>");
		
	}

}
