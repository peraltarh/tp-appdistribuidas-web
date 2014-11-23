<%@page import="javax.print.attribute.IntegerSyntax"%>
<%@ page import="clienteWeb.ControladorWeb"%>
<%@ page import="beans.MercaderiaBean"%>
<%@ page import="beans.PedidoBean"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Agregar Mercaderia a Pedido</title>
</head>

<%
PedidoBean pb=(PedidoBean)request.getAttribute("nuevoPedido");
%>

<script type="text/javascript">
	function validarPedido() {
		document.getElementById("formulario").submit();
	}
</script>



<body>
	<div>
		<h2>Pedido Seleccionado: <%=pb.getIdPedido()%></h2>
	</div>
	<form name="agregarMercaderia" action="agregarMercaderia" id="formulario"
		method="POST">

		<table width="75%">
			
			<tr></tr>
			<tr></tr>
			<tr></tr>
		</table>

		<input
			type="button" name="crearPedido" value="Crear Pedido"
			onclick="validarPedido()"> <input type="reset"
			name="LimpiarCampos" value="Limpiar Campos" />

	</form>


	<a href='GenerarEnvio.jsp'>Volver</a>

</body>
</html>