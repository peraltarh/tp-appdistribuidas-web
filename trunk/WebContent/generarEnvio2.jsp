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
<title>Alta Pedido</title>
</head>

<%
	ClienteBean cb=(ClienteBean)request.getAttribute("clienteValidado");
	if(cb instanceof EmpresaBean)
	{	
		cb=(EmpresaBean)cb;
	}
	
	else if(cb instanceof ParticularBean)
		{
		cb=(ParticularBean)cb;
		}
	String tipoId=cb.getTipoCliente();
	String nro=cb.getIdentificacion();
%>

<script type="text/javascript">
	function validarPedido() {
		document.getElementById("formulario").submit();
	}
</script>



<body BACKGROUND="fondo.jpg">

	<form name="generarEnvio2" action="generarEnvio2" id="formulario"
		method="POST">

		<table width="75%">
			<!-- 		style="display: none" -->
			<tr>

				<td width="20%">Fecha Entrega Maxima (AAAA-MM-DD))</td>
				<td width="40%"><input type="text" name="fechaMax"
					id="fechaMax" /></td>
			</tr>

			<tr>
				<td width="20%">Horario Entrega Desde (HH:MM)</td>
				<td width="40%"><input type="text" name="horarioDeEntregaDesde"
					id="horarioDeEntregaDesde" /></td>
			</tr>
			<tr>
				<td width="20%">Horario Entrega Hasta (HH:mm)</td>
				<td width="40%"><input type="text" name="horarioDeEntregaHasta"
					id="horarioDeEntregaHasta" /></td>
			</tr>
			<tr>
				<td width="20%">Condiciones Especiales</td>
				<td width="40%"><input type="text" name="condEspeciales"
					id="condEspeciales" /></td>
			</tr>
			<tr>
				<td width="20%">Manifiesto</td>
				<td width="40%"><input type="text" name="manifiesto"
					id="manifiesto" /></td>
			</tr>




			<tr></tr>
			<tr></tr>
			<tr></tr>
		</table>

		<blockquote>
			<p>
				Sucursal: <select name="cbSucursalOrigen" id="comboSucursalesOrigen"
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

		<blockquote>
			<p>
				Sucursal: <select name="cbSucursalDestino"
					id="comboSucursalesOrigen" size="1">
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



		<blockquote>
			<%if (cb instanceof EmpresaBean){%>

			<p>
				Direcciones Validas (SOLO EMPRESA): <select
					name="cbDireccionesValidas" id="comboDireccionesValidas" size="1">
					<%
							for (EmpresaDirValidasBean dir : ((EmpresaBean) cb)
										.getDireccionesValidas()) {
						%>
					<option value="<%=dir.getDireccion()%>">
						<%=dir.getDireccion()%>
					</option>
					<%
							}
						%>
				</select>
			</p>
		</blockquote>
		<%} %>
		<input type="hidden" name="tipoId" id="tipoId" value="<%=tipoId%>" />

		<input type="hidden" name="nro" id="nro" value="<%=nro%>" /> <input
			type="button" name="crearPedido" value="Crear Pedido"
			onclick="validarPedido()"> <input type="reset"
			name="LimpiarCampos" value="Limpiar Campos" />

	</form>


	<a href='GenerarEnvio.jsp'>Volver</a>

</body>
</html>