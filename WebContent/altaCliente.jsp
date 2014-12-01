<%@page import="beans.EmpresaBean"%>
<%@page import="beans.ParticularBean"%>
<%@page import="javax.print.attribute.IntegerSyntax"%>
<%@ page import="beans.ClienteBean"%>


<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Alta Pedido</title>
</head>

<script type="text/javascript">
	function validarPedido() {
		document.getElementById("formulario").submit();
	}
</script>



<body BACKGROUND="fondo.jpg">

	<div>
		<h2>Alta Cliente</h2>
	</div>

	<form name="altaCliente" action="altaCliente" id="formulario"
		method="POST">

		<table width="75%">
			<!-- 		style="display: none" -->
			<tr>

				<td width="20%">Tipo Identificacion</td>
				<td width="20%"><select size="1" name="tipo" id="tipo">
						<option value="0">Elegir Tipo...</option>
						<option value="DNI">DNI</option>
						<option value="CUIT">CUIT</option>
				</select></td>
			</tr>
			<tr>
				<td width="20%">Numero</td>
				<td width="40%"><input type="text" name="numero" id="numero" /></td>
			</tr>
			<tr>
				<td width="20%">Nombre</td>
				<td width="40%"><input type="text" name="nombre" id="nombre" /></td>
			</tr>

			<tr>
				<td width="20%">Apellido</td>
				<td width="40%"><input type="text" name="apellido"
					id="apellido" /></td>
			</tr>
			<BR>

			<tr>
				<td width="20%">Direccion</td>
				<td width="40%"><input type="text" name="direccion"
					id="direccion" /></td>
			</tr>
			<BR>
			<tr>
				<td width="20%">Telefono</td>
				<td width="40%"><input type="text" name="telefono"
					id="telefono" /></td>
			</tr>

		</table>
		
		<BR>
		<BR>
		
		<input type="button" name="crearCliente" value="Crear Cliente"
			onclick="validarPedido()"> <input type="reset"
			name="LimpiarCampos" value="Limpiar Campos" />

	</form>

	<BR>
	<a href='index.jsp'>Volver</a>

</body>
</html>