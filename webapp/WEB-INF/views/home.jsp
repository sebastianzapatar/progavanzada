<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Lista de estudiantes</title>

<!--Termina jQuery DataTable-->
<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js" integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1" crossorigin="anonymous"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js" integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM" crossorigin="anonymous"></script>
<!-- jQuery DataTable -->
<link rel="stylesheet" type="text/css" href="https://cdn.datatables.net/v/dt/dt-1.10.20/r-2.2.3/datatables.min.css"/>
 
<script type="text/javascript" src="https://cdn.datatables.net/v/dt/dt-1.10.20/r-2.2.3/datatables.min.js"></script>

 <link rel="canonical" href="https://getbootstrap.com/docs/4.0/examples/navbars/">

  <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css"
    integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">

<script>
<!--Función para darle formato a la Tabla-->
$(document).ready( function () {
    $('#myTable').DataTable();
	responsive=True;
} );
</script>
</head>
<body>

<jsp:include page="plantillas/menu.jsp"></jsp:include>
Seguimos en el fin del mundo</h1>
	<table border="1" id="myTable">
	<thead>
	<tr>
	<th>Id</th>
	<th>Nombre</th>
	<th>Apellido</th>
	<th>Telefono</th>
	</tr>
	</thead>
	<tbody>
	<c:forEach items="${estudiantes }" var="estudiante">
		<tr>
		<td>${estudiante.id}</td>
		<td>${estudiante.nombre }</td>
		<td>${estudiante.apellido}</td>
		<td>${estudiante.telefono}</td>
		</tr>
	</c:forEach>
	</tbody>
	</table>
	
<jsp:include page="plantillas/footer.jsp"></jsp:include>

</body>
</html>