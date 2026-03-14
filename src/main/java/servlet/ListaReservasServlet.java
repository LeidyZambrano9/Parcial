package servlet;

import datos.ReservaMemoria;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import javax.servlet.*;
import java.io.IOException;

// Definición de la ruta para acceder a la lista de reservas
@WebServlet("/ListaReservasServlet")
public class ListaReservasServlet extends HttpServlet {

    // Método doGet: se activa cuando el usuario solicita ver la página 
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        /* Accedemos a la lista estática en ReservaMemoria y la enviamos 
           como un atributo de la petición bajo el nombre "reservas".
           Esto permite que el JSP pueda iterar sobre los datos.
        */
        request.setAttribute("reservas", ReservaMemoria.reservas);

        // Definimos hacia qué recurso (JSP) vamos a enviar la información
        RequestDispatcher dispatcher = request.getRequestDispatcher("reservas.jsp");
        
        // Ejecutamos el envío de la petición y la respuesta al JSP de destino
        dispatcher.forward(request, response);
    }
}