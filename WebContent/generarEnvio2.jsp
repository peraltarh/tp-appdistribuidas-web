<%@ page import="clienteWeb.ControladorWeb"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Alta Pedido</title>
</head>

<script type="text/javascript">
	function validarUser() {
		document.getElementById("formulario").submit();
	}
</script>



<body>

	<form name="generarEnvio2" action="generarEnvio2" id="formulario"
		method="GET">
		<table width="75%">
			<!-- 		style="display: none" -->
			<tr>

				<td width="20%">Fecha Entrega Maxima</td>
				<td width="40%"><input type="text" name="fechaMax"
					id="fechaMax" /></td>

				<td width="20%">Direccion Destino</td>
				<td width="40%"><input type="text" name="dirDestino"
					id="dirDestino" /></td>

				<td width="20%">Fecha Entrega Maxima</td>
				<td width="40%"><input type="text" name="fechaMax"
					id="fechaMax" /></td>

				<td width="20%">Horario Entrega Desde</td>
				<td width="40%"><input type="text" name="horarioDeEntregaDesde"
					id="horarioDeEntregaDesde" /></td>

				<td width="20%">Horario Entrega Hasta</td>
				<td width="40%"><input type="text" name="horarioDeEntregaHasta"
					id="horarioDeEntregaHasta" /></td>

				<td width="20%">Condiciones Especiales</td>
				<td width="40%"><input type="text" name="condEspeciales"
					id="condEspeciales" /></td>

				<td width="20%">Manifiesto</td>
				<td width="40%"><input type="text" name="manifiesto"
					id="manifiesto" /></td>

				<td width="20%">Direccion de Retiro (Solo Empresa)</td>
				<td width="40%"><input type="text"
					name="dirDeRetiroSoloEmpresa" id="dirDeRetiroSoloEmpresa" /></td>

			</tr>
		</table>
		<input type="button" name="validarUsuario" value="Validar Usuario"
			onclick=""> <input type="reset" name="LimpiarCampos"
			value="Limpiar Campos" />
	</form>

	<a href='index.jsp'>Volver</a>

</body>
</html>