<%@ page import="clienteWeb.ControladorWeb"%>
<%@page import="beans.PedidoBean"%>
<%@page import="beans.MercaderiaBean"%>
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
		<form name="frmGenerarTraslado" id="formulario" method="GET"
			action="GenerarTraslado">
			<blockquote>
				<p>
					Mercaderia: <select name="cbMercaderia" id="comboMercaderias" size="1">
						<%
							for (MercaderiaBean m : pb.getMercaderias()) {
						%>
						<option value="<%=m.getIdMercaderia()%>">
							<%=m.getIdMercaderia()%>
						</option>
						<%
							}
						%>
					</select> <input name="btnSelMercaderia" type="button" value="Mercaderia">
				</p>
			</blockquote>
		</form>
	</div>

	<div>
		<table border="1">
			<tr>
				<th>Numero</th>
				<th>Id Mercaderia</th>
				<th>Deposito Actual</th>
				<th>Fecha Maxima Entrega</th>
			</tr>
			<%
				for (int i = 0; i < pb.getMercaderias().size(); i++) {
			%>
			<tr>
				<th><%=i + 1%></th>
				<th><%=pb.getMercaderias().get(i).getIdMercaderia()%></th>
				<th><%=pb.getMercaderias().get(i).getDeposito().getIdDeposito()%></th>
				<th><%=pb.getDirDestino()%></th>
			</tr>
			<%
				}
			%>

		</table>

	</div>
	<a href='generarTraslado.jsp'>Volver</a>

</body>
</html>