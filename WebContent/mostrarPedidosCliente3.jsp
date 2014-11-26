<%@ page import="clienteWeb.ControladorWeb"%>
<%@page import="beans.PedidoBean"%>
<%@page import="beans.MercaderiaBean"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Detalle Mercaderias</title>

<%
	PedidoBean pb = (PedidoBean) request.getAttribute("nuevoPedido");
%>

<script type="text/javascript">
	function validarForm(){
		if(document.getElementById("comboMercaderias").value == ""){
			alert('Debe seleccionar una Mercaderia.');
			return false;
		}
		document.getElementById("formulario").submit();
	}
</script>

</head>
<body>

	<div>
		<h2>Pedido Seleccionado : <%=pb.getIdPedido() %></h2>
	</div>

	<div>
		<table border="1">
			<tr>
				<th>Numero</th>
				<th>Id Mercaderia</th>
				<th>Sucursal Actual</th>
				<th>Fecha Maxima Entrega</th>
				<th>Estado Actual</th>
			</tr>
			<%
				for (int i = 0; i < pb.getMercaderias().size(); i++) {
			%>
			<tr>
				<th><%=i + 1%></th>
				<th><%=pb.getMercaderias().get(i).getIdMercaderia()%></th>
				<th><%=pb.getSucursal().getNombre()%></th>
				<th><%=pb.getFechaEnregaMaxima()%></th>
				<th><%=pb.getEstado()%></th>
			</tr>
			<%
				}
			%>

		</table>

	</div>
	<a href='index.jsp'>Volver</a>

</body>
</html>