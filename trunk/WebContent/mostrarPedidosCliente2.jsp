<%@page import="beans.EmpresaBean"%>
<%@page import="beans.ParticularBean"%>
<%@page import="beans.SucursalBean"%>
<%@page import="javax.print.attribute.IntegerSyntax"%>
<%@ page import="clienteWeb.ControladorWeb"%>
<%@ page import="beans.ClienteBean"%>
<%@ page import="beans.PedidoBean"%>
<%@ page import="beans.EmpresaDirValidasBean"%>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Seleccionar Pedido</title>
</head>

<%
	ClienteBean cb=(ClienteBean)request.getAttribute("clienteValidado");
int idCliente=cb.getIdCliente();
%>

<script type="text/javascript">
	function validarForm() {
		document.getElementById("formulario").submit();
	}
</script>



<body BACKGROUND="fondo.jpg">
	<div>
		<h2>Mostrar Pedidos</h2>
	</div>
	<form name="mostrarPedidosCliente2" action="mostrarPedidosCliente2" id="formulario"
		method="POST">

		<blockquote>
			<p>
				Pedido: <select name="cbPedidos" id="comboPedidos" size="1">
					<%
						for (PedidoBean pb : ControladorWeb.getInstancia()
								.getPedidosCliente(idCliente)) {
					%>
					<option value="<%=pb.getIdPedido()%>">
						<%=pb.getIdPedido()%>
					</option>
					<%
						}
					%>
				</select> <input name="btnSelPedido" type="button" value="Seleccionar pedido"
					onClick="validarForm();">
			</p>
		</blockquote>

	</form>


	<a href='index.jsp'>Volver</a>

</body>
</html>