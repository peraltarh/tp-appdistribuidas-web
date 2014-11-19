<%@ page import="clienteWeb.ControladorWeb"%>
<%@page import="beans.PedidoBean"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Seleccionar Pedido</title>

<script type="text/javascript">
	function validarForm(){
		if(document.getElementById("comboPedidos").value == ""){
			alert('Debe ingresar una Pedido.');
			return false;
		}
		document.getElementById("formulario").submit();
	}
</script>

</head>
<body>

	<div>
		<h2>Seleccionar Pedido</h2>
	</div>
	<form name="frmmostrarEstadoPedidos" id="formulario" method="GET"
		action="mostrarEstadoPedidos">
		<blockquote>
			<p>
				Pedido: <select name="cbPedidos" id="comboPedidos" size="1">
					<% for (PedidoBean p : ControladorWeb.getInstancia().getPedidos()) { %>
					<option value="<%=p.getIdPedido() %>">
						<%=p.getIdPedido() %>
					</option>
					<% } %>
				</select> <input name="btnSelPedido" type="button" value="Seleccionar"	onClick="validarForm();">
			</p>
		</blockquote>
	</form>
	</br>
	<a href='index.jsp'>Volver</a>

</body>
</html>