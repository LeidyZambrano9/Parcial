<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Error</title>

<link rel="stylesheet" href="css/estilos.css">

</head>

<body>

<div class="container">

<h2>Error</h2>

<p><%= request.getAttribute("error") %></p>

<br>

<a href="index.html">Volver</a>

</div>

</body>
</html>