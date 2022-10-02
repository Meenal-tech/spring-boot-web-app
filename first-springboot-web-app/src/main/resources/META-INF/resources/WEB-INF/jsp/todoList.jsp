<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
	<head>
		<link href="webjars/bootstrap/5.1.3/css/bootstrap.min.css" rel="stylesheet" >
	</head>
	
	<body>
		<div class="container">
			<h1>Your Todos</h1>
			<hr>
			<table class="table">
				<thead>
					<tr>
						<th>id</th>
						<th>Description</th>
						<th>Target Date</th>
						<th>Is Done?</th>
						<th>Delete</th>
						<th>Update</th>
					</tr>
				</thead>
				<tbody>	
				<!-- applying for loop for inflating the data into the table-->	
					<c:forEach items="${todos}" var="todo">
						<tr>
							<td>${todo.id}</td>
							<td>${todo.description}</td>
							<td>${todo.targetDate}</td>
							<td>${todo.done}</td>
							<td> <a href="delete-todo?id=${todo.id}" class="btn btn-warning">DELETE</a> <a href="update-todo?id=${todo.id}" class="btn btn-success">UPDATE</a> </td>
						<!-- passing id as query param with the url -->
						</tr>
					</c:forEach>
				</tbody>
			</table>
				<form action="post">
					<a href="add-todo" class="btn btn-success">Add Todo</a>
				</form>
		</div>
		<script src="webjars/bootstrap/5.1.3/js/bootstrap.min.js"></script>
		<script src="webjars/jquery/3.6.0/jquery.min.js"></script>
	</body>
</html>