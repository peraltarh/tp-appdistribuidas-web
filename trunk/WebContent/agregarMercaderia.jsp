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
	PedidoBean pb = (PedidoBean) request.getAttribute("nuevoPedido");
	String nro = Integer.toString(pb.getIdPedido());
%>

<script type="text/javascript">
	function addMercaderia() {
		if(document.formulario.pedidoValido.checked==true)
			{
		document.getElementById("formulario").submit();
	}
		else{
			alert("Su pedido fue rechazado por no cumplir con las politicas de envio");
		}
	}

// 	function concluirCarga() {
<%-- <%ControladorWeb.getInstancia().cerrarPedido(pb);%> --%>
// 	window.location = "http://localhost:8080/TP-AD_Web/index.jsp";
// 	}
</script>



<body BACKGROUND="fondo.jpg">
	
	<div>
		<h2>Alta Pedido - Agregar Mercaderias</h2>
	</div>
	<div>
		<h2>
			Pedido Seleccionado:
			<%=pb.getIdPedido()%></h2>
	</div>
	<form name="agregarMercaderia" action="agregarMercaderia"
		id="formulario" method="GET">

		<input TYPE=checkbox name=ultimaMercaderia VALUE=ultimaMercaderia>
		Es Ultima Mercaderia <BR>

		<table width="75%">
			<tr>
				<td width="20%">Tipo Mercaderia</td>
				<td width="20%"><select size="1" name="tipo" id="tipo">
						<option value="0">Elegir Tipo...</option>
						<option value="porPeso">Peso</option>
						<option value="porVolumen">Volumen</option>
				</select></td>
			</tr>
			<tr>
				<td width="20%">Alto</td>
				<td width="40%"><input type="text" name="alto" id="alto" /></td>
			<tr>
			<tr>
				<td width="20%">Ancho</td>
				<td width="40%"><input type="text" name="ancho" id="ancho" /></td>
			</tr>
			<tr>
				<td width="20%">Profundidad</td>
				<td width="40%"><input type="text" name="profundidad"
					id="profundidad" /></td>
			</tr>
			<tr>
				<td width="20%">Fragilidad</td>
				<td width="40%"><input type="text" name="fragilidad"
					id="fragilidad" /></td>
			</tr>
			<tr>
				<td width="20%">Cantidad Apilable</td>
				<td width="40%"><input type="text" name="cantApilable"
					id="cantApilable" /></td>
			</tr>
			<tr>
				<td width="20%">Condicion de Viaje</td>
				<td width="40%"><input type="text" name="condViaje"
					id="condViaje" /></td>
			</tr>
			<tr>
				<td width="20%">Indicaciones Manipulacion</td>
				<td width="40%"><input type="text"
					name="indicacionesManipulacion" id="indicacionesManipulacion" /></td>
			</tr>
			<tr>
				<td width="20%">Direccion Destino</td>
				<td width="40%"><input type="text" name="direDestino"
					id="direDestino" /></td>
			</tr>
			<tr>
				<td width="20%">Volumen/Peso</td>
				<td width="40%"><input type="text" name="volPeso" id="volPeso" /></td>

			</tr>
			<!-- 			<tr> -->
			<!-- 				<div> -->
			<!-- 					<h2>Datos Alta Remito</h2> -->
			<!-- 				</div> -->


			<!-- 			</tr> -->
			<tr></tr>
			<tr></tr>
			<tr></tr>
		</table>

		<input TYPE=checkbox name=pedidoValido id=pedidoValido VALUE=pedidoValido> El
		Pedido no contiene Armas ni Quimicos explosivos <BR> <input
			type="hidden" name="nro" id="nro" value="<%=nro%>" /> <input
			type="button" name="agregarMercaderia" value="Agregar Mercaderia"
			onclick="addMercaderia()" />

	</form>

	<a href='index.jsp'>Finalizar</a>
</body>
</html>