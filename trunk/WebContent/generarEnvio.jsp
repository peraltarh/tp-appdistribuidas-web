<%@ page import="clienteWeb.ControladorWeb"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Generar Traslado</title>
</head>
<body>

	<form action="generarEnvio.jsp" method="POST">
		<table width="75%">
			<tr>
				<td width="20%">Tipo Identificacion</td>
				<td width="20%">
				<select size="1" name="category">
					<option value="1">DNI</option>
					<option value="2">CUIT</option>
				</select>
				</td>
				<td width="20%">Numero</td>
				<td width="52%"><input type="text" name="numero" /></td>
			</tr>
		</table>
		<p>
			<input type="submit" name="validarUsuario" value="Validar Usuario" /> <input
				type="reset" name="LimpiarCampos" value="Limpiar Campos" />
		</p>
	</form>

	<a href='index.jsp'>Volver</a>

</body>
</html>