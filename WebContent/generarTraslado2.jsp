<%@ page import="clienteWeb.ControladorWeb"%>
<%@page import="beans.PedidoBean"%>
<%@page import="beans.MercaderiaBean"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Generar Traslado - Mercaderia</title>

<%
	PedidoBean pb = (PedidoBean) request.getAttribute("nuevoPedido");
%>

<script type="text/javascript">
	function validarForm() {
		if (document.getElementById("comboMercaderias").value == "") {
			alert('Debe seleccionar una Mercaderia.');
			return false;
		}
		document.getElementById("formulario").submit();
	}
</script>

</head>
<body BACKGROUND="fondo.jpg">

	<div>
		<h2>Generar Traslado</h2>
	</div>

	<div>
		<form name="frmGenerarTraslado" id="formulario" method="GET"
			action="generarTraslado2">
			<blockquote>
				<p>
					Mercaderia: <select name="cbMercaderia" id="comboMercaderias"
						size="1">
						<%
							for (MercaderiaBean m : pb.getMercaderias()) {
						%>
						<option value="<%=m.getIdMercaderia()%>">
							<%=m.getIdMercaderia()%>
						</option>					
						<%
							}
						%>
					</select> 
				</p>
			</blockquote>

			<blockquote>
				<p>
					Sucursal de Arrivo: <select name="cbSucursalActual"
						id="comboSucursalesActual" size="1">
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

		Condicion de Arrivo: <select size="1" name="estado" id="estado">
				<option value="0">Elegir Estado...</option>
				<option value="OK">OK</option>
				<option value="GOLPEADO">GOLPEADO</option>
				<option value="ABIERTO">ABIERTO</option>
			</select>

<input name="btnSelMercaderia" type="button"
						value="Seleccionar Mercaderia" onClick="validarForm();">
						
								<input type="hidden" name="sucFinal" id="sucFinal"
			value="<%=pb.getDirDestino()%>" /> <input type="hidden"
			name="estadoAct" id="estadoAct" value="<%=pb.getEstado()%>" />
			<input type="hidden" name="idPedido" id="idPedido" value="<%=pb.getIdPedido()%>" />
		</form>
	</div>
	<br>
	<br>
	<br>
	<div>
		<table border="1">
			<tr>
				<th>Numero</th>
				<th>Id Mercaderia</th>
				<th>Deposito Actual</th>
				<th>Direccion Destino</th>
				<th>Sucursal Actual</th>
			</tr>
			<%
				for (int i = 0; i < pb.getMercaderias().size(); i++) {
					String lugar = null;
					if(!pb.getMercaderias().get(i).getMovimientos().isEmpty())
					lugar = pb.getMercaderias().get(i).getMovimientos().get(pb.getMercaderias().get(i).getMovimientos().size()-1).getDestino();
					if(lugar==null)lugar="EN SUCURSAL ORIGEN";
					
			%>
			<tr>
				<th><%=i + 1%></th>
				<th><%=pb.getMercaderias().get(i).getIdMercaderia()%></th>
				<th><%=pb.getMercaderias().get(i).getDeposito()
						.getIdDeposito()%> </th>
				<th><%=pb.getDirDestino()%> </th>
				<th><%=lugar%> </th>
			</tr>
			<%
				}
			%>

		</table>


			
			
			
	</div>
	<br>
	<br>
	<a href='generarTraslado.jsp'>Volver</a>

</body>
</html>