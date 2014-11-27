<%@ page import="clienteWeb.ControladorWeb"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Validar Pedidos Pendientes de una Sucursal</title>
</head>




<body BACKGROUND="fondo.jpg">
	<div>
		<h2>Respuesta Velidar Pedidos Sucursal</h2>
	</div>
	<br>
	<form name="respuestaValidarPedidosSucursal" id="formulario">

				<%String result = (String)request.getAttribute("respuesta");%>
				<textarea name="resultado" cols="60" rows="8"><%=result %></textarea>

	</form>

	<a href='index.jsp'>Volver</a>

</body>
</html>