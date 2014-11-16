<%@ page import="clienteWeb.ControladorWeb"%>
<%@ page import="beans.PedidoBean"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Generar Envio</title>
</head>
<body>

 <div>
		<h2>Generar Traslado</h2>
    </div>
    <form name="frmGenerarTraslado" id="formulario" method="GET" action="GenerarTraslado">
        <blockquote>
          	<p>
            	Pedido: 
                <select name="cbPedidos" id="comboPedidos" size="1" >
            		<% for (Pedidos m : ControladorWeb.getInstancia().getPedidosPorEstado ("proceso")) { %>
			            <option value="<%=m.getNumero() %>">
			            	<%=m.getNumero() %>			            
			            </option>
					<% } %>
            	</select>
       	        <input name="btnSelMozo" type="button" value="Cerrar" onClick="validarForm();"> 
       	  </p>
      </blockquote>
</form>
</br>
<a href='index.jsp'>Volver</a>

</body>
</html>