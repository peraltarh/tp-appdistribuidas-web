<%@ page import="clienteWeb.ControladorWeb"%>
<%@page import="beans.PedidoBean"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Generar Pedid 22222</title>

<%
	PedidoBean pb = (PedidoBean) request.getAttribute("nuevoPedido");
%>

</head>
<body>

	<div>
		<h2>Generar Traslado</h2>
	</div>

	<div>
		<table border="1">
			<tr>
				<th>Nro Item</th>
				<th>Repuesto</th>
				<th>Cantidad</th>
			</tr>
			<%
				for (int i = 0; i < pb.getMercaderias().size(); i++) {
			%>
			<tr>
				<th><%=i + 1%></th>
				<th><%=pb.getMercaderias().get(i).getIdMercaderia()%></th>
				<th></th>
				<buton name="entregar" action="entrevar()"></buton>
			</tr>
			<%
				}
			%>

		</table>

	</div>

	<!-- 	<form name="frmGenerarTraslado" id="formulario" method="GET" -->
	<!-- 		action="GenerarTraslado"> -->
	<!-- 		<blockquote> -->
	<!-- 			<p> -->
	<!-- 				Pedido: <select name="cbPedidos" id="comboPedidos" size="1"> -->
	<%-- 					<option value="<%=pb.getIdPedido() %>"></option> --%>
	<!-- 				</select> <input name="btnSelPedido" type="button" value="Pedido"	onClick="validarForm();"> -->
	<!-- 			</p> -->
	<!-- 		</blockquote> -->
	<!-- 	</form> -->
	</br>
	<a href='index.jsp'>Volver</a>

</body>
</html>