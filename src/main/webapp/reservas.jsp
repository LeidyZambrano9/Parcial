<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.util.List"%>
<%@page import="modelo.Reserva"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Lista de Reservas</title>

<link rel="stylesheet" href="css/estilos.css">

</head>

<body>

<h2>Lista de Reservas</h2>

<table>

<tr>
<th>Usuario</th>
<th>Fecha</th>
<th>Espacio</th>
<th>Duración</th>
<th>Eliminar</th>
</tr>

<%
List<Reserva> reservas = (List<Reserva>) request.getAttribute("reservas");

for(int i=0;i<reservas.size();i++){

Reserva r = reservas.get(i);
%>

<tr>

<td><%= r.getNombre() %></td>
<td><%= r.getFecha() %></td>
<td><%= r.getEspacio() %></td>
<td><%= r.getDuracion() %> horas</td>

<td>
<a class="eliminar" href="EliminarReservaServlet?id=<%=i%>">Eliminar</a>
</td>

</tr>

<%
}
%>

</table>

<br>

<div style="text-align:center">
<a href="index.html">Nueva Reserva</a>
</div>

</body>
</html>