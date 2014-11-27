<%@ page import="clienteWeb.ControladorWeb"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Validar Pedidos Pendientes de una Sucursal</title>
</head>

<script type="text/javascript">
function validarPedidos(){
	
	if(document.getElementById("comboSucursal").value == ""){
		alert('Debe seleccionar una Sucursal.');
		return false;
	}
	document.getElementById("formulario").submit();
	
}

</script>



<body>

	<form name="validarPedidosSucursal" action="validarPedidosSucursal" id="formulario" method="GET">
		<blockquote>
			<p>
				Sucursal: <select name="cbSucursal" id="comboSucursal"
					size="1">
					<%
						for (String suc : ControladorWeb.getInstancia().getSucursales()) {
					%>
					<option value="<%=suc%>">
						<%=suc%>
					</option>
					<%
						}
					%>
				</select>
			</p>
		</blockquote>
		<input
			type="button" name="validarPedidosSucursal" value="Validar Pedidos a Vencer"
			onclick="validarPedidos()"> 
	</form>

	<a href='index.jsp'>Volver</a>

</body>
</html>