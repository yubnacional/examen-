<%-- 
    Document   : VistaEmpleado
    Created on : 23-jun-2018, 16:29:44
    Author     : usuario
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
        <form action="NuevoEmpleado" method="post" name="FrmEmpleado" id="Frm_Empleado">
		<table>
			<tr>
				<td><label>IdEmpleado:</label></td>
				<td><input type="number" name="txtIdEmpleado" id="txtIdEmpleado"></td>
			</tr>
			<tr>
				<td><label>numeroDocumento:</label></td>
				<td><input type="number" name="txtnumeroDocumento" id="txtnumeroDocumento"></td>
			</tr>
			<tr>
				<td><label>tipoDocumento:</label></td>
				<td><input type="text" name="txttipoDocumento" id="txttipoDocumento"></td>
			</tr>
			<tr>
				<td><label>nombre:</label></td>
				<td><input type="text" name="txtnombre" id="txtnombre"></td>
			</tr>
			<tr>
				<td><label>sueldoAsignado:</label></td>
				<td><input type="number" name="txtsueldoAsignado" id="txtsueldoAsignado"></td>
			</tr>
			<tr>
				<td><label>descuento:</label></td>
				<td><input type="number" name="txtdescuento" id="txtdescuento"></td>
			</tr>
			<tr>
				<td><label>sueldoFinal:</label></td>
				<td><input type="number" name="txtsueldoFinal" id="txtsueldoFinal"></td>
			</tr>

		</table>
                <input type="submit" value="Registrar Empleado" name="btnIngresar" id="btnIngresar">
		<input type="submit" value="Calcular" name="btnCalcular" id="btnCalcular">
	</form>
    </body>
</html>
