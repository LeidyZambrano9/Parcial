package servlet;

import datos.ReservaMemoria;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import javax.servlet.*;
import java.io.IOException;

// Ruta del servlet para la funcionalidad de eliminar registros
@WebServlet("/EliminarReservaServlet")
public class EliminarReservaServlet extends HttpServlet {

    // Se usa doGet porque el ID suele enviarse como un parámetro en la URL 
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        // Capturamos el índice del elemento a eliminar y lo convertimos a entero 
        int id = Integer.parseInt(request.getParameter("id"));

        /* Validación de seguridad: Verificamos que el índice sea positivo 
           y que se encuentre dentro del rango actual de nuestra lista 
           para evitar una excepción.
        */
        if(id >= 0 && id < ReservaMemoria.reservas.size()){
            // Removemos el objeto de la lista en memoria usando su posición
            ReservaMemoria.reservas.remove(id);
        }

        /* Esto limpia la petición y solicita al navegador que cargue de nuevo 
           el servlet de la lista para refrescar la tabla de registros.
        */
        response.sendRedirect("ListaReservasServlet");
    }
}