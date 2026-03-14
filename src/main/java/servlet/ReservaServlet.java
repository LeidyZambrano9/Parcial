package servlet;

import modelo.Reserva;
import datos.ReservaMemoria;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import javax.servlet.*;
import java.io.IOException;
import java.time.LocalDate;

// Definición del Servlet y su ruta de acceso desde el navegador o formularios
@WebServlet("/ReservaServlet") 
public class ReservaServlet extends HttpServlet {

    // El método doPost gestiona el envío de información de forma segura desde el cliente
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        // Capturamos los valores enviados en el cuerpo de la petición 
        String nombre = request.getParameter("nombre");
        String fecha = request.getParameter("fecha");
        String espacio = request.getParameter("espacio");
        String duracionStr = request.getParameter("duracion");

        // Validación lógica: confirmamos que el usuario no haya dejado campos en blanco
        if(nombre.isEmpty() || fecha.isEmpty() || espacio.isEmpty() || duracionStr.isEmpty()){

            // Si hay error, enviamos un mensaje a la vista 'error.jsp' mediante un atributo
            request.setAttribute("error", "Todos los campos son obligatorios");
            RequestDispatcher dispatcher = request.getRequestDispatcher("error.jsp");
            dispatcher.forward(request, response);
            return; // Detenemos la ejecución del método
        }

        // Manejo de fechas: convertimos el texto recibido a un objeto LocalDate para compararlo
        LocalDate fechaReserva = LocalDate.parse(fecha);
        LocalDate hoy = LocalDate.now();

        // Regla de negocio: validamos que la reserva no sea para un día anterior al actual
        if(fechaReserva.isBefore(hoy)){
            request.setAttribute("error", "No puedes reservar en una fecha que ya pasó");
            RequestDispatcher dispatcher = request.getRequestDispatcher("error.jsp");
            dispatcher.forward(request, response);
            return;
        }

        // Parseo de datos: pasamos la duración de String a int para procesarla como número
        int duracion = Integer.parseInt(duracionStr);

        // Instanciamos un objeto de la clase Reserva aplicando POO con los datos validados
        Reserva reserva = new Reserva(nombre, fecha, espacio, duracion);

        // Almacenamiento: guardamos el objeto en una lista estática (persistencia en memoria)
        ReservaMemoria.reservas.add(reserva);

        // Pasamos el objeto 'reserva' a la siguiente vista para mostrar el resumen al usuario
        request.setAttribute("reserva", reserva);

        // Redireccionamos el flujo de la aplicación hacia la página de confirmación
        RequestDispatcher dispatcher = request.getRequestDispatcher("confirmacion.jsp");
        dispatcher.forward(request, response);
    }
}