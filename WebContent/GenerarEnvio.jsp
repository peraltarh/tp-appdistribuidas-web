<%@ page import="clienteWeb.ControladorWeb"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Validar Cliente</title>
</head>

<script type="text/javascript">
	function validarUser() {
		document.getElementById("formulario").submit();
	}
</script>



<body BACKGROUND="fondo.jpg">

	<form name="GenerarEnvio" action="GenerarEnvio" id="formulario"
		method="GET">
		<table width="75%">
			<!-- 		style="display: none" -->
			<tr>
				<td width="20%">Tipo Identificacion</td>
				<td width="20%"><select size="1" name="tipo" id="tipo">
						<option value="0">Elegir Tipo...</option>
						<option value="DNI">DNI</option>
						<option value="CUIT">CUIT</option>
				</select></td>
				<td width="20%">Numero</td>
				<td width="40%"><input type="text" name="numero" id="numero" /></td>
			</tr>
		</table>
		<input type="button" name="validarUsuario" value="Validar Usuario"
			onclick="validarUser();"> <input type="reset"
			name="LimpiarCampos" value="Limpiar Campos" />
			
			
	</form>
	<BR>
<a href='altaCliente.jsp'>Alta Cliente</a>
<BR>
	<a href='index.jsp'>Volver</a>

</body>
</html>