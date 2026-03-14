<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="modelo.Reserva"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Reserva Confirmada</title>

<link rel="stylesheet" href="css/estilos.css">

</head>
<body>

<%
Reserva r = (Reserva) request.getAttribute("reserva");
%>

<div class="container">

<h2>Reserva realizada correctamente</h2>

<p><strong>Usuario:</strong> <%= r.getNombre() %></p>
<p><strong>Fecha:</strong> <%= r.getFecha() %></p>
<p><strong>Espacio:</strong> <%= r.getEspacio() %></p>
<p><strong>Duración:</strong> <%= r.getDuracion() %> horas</p>

<br>

<a href="ListaReservasServlet">Ver reservas</a>
<br><br>
<a href="index.html">Nueva reserva</a>

</div>

</body>
</html>