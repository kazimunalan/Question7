 <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
 <c:choose>
 <c:when test="${mode == 'MODE_HOME'}"><!-- UserController dan gelen mappinglere gore yonlendirme yapilmistir. -->
 	<div class="container invisivle-at-first" id="homeDiv">
	  <div class="jumbotron text-center">
	  	<h3>Welcome Spring Boot</h3>
	  </div>
	</div>
 </c:when>
 	<c:when test="${mode == 'MODE_USER'}">
 		<div class="container text-center invisible-at-first" id="taskDiv">
 	<h3>My Taks</h3>
				<hr>
	  	<div class="table-responsive">
	  		<table class="table table-striped table-bordered text-left">
	  			<thead>
	  				<tr>
	  				 	<!-- <th>Id</th> -->
	  				 	<th>Name</th>
	  				 	<th>Surname</th>
	  				 	<th>Address</th>
	  				</tr>
	  			</thead>
	  			<tbody>
	  				<c:forEach var="task" items="${tasks}">
	  					<tr>
	  						<!--<td>${task.id}</td> -->
	  						<td>${task.name}</td>
	  						<td>${task.surname}</td>
	  						<td>${task.address}</td>
	  						<td><a href="update-user?id=${task.id}"><span class="glyphicon glyphicon-pencil"></span></a></td>
	  						<td><a href="delete-user?id=${task.id}"><span class="glyphicon glyphicon-trash"></span></a></td>
	  						
	  					</tr>
	  				</c:forEach>
	  			</tbody>
	  		</table>
	  	</div>
</div> 
 	</c:when>
 	<c:when test="${mode == 'MODE_NEW' || mode == 'MODE_UPDATE'}">
 		<div class="container text-center">
	<h3>Manage Task</h3>
	<hr>
	<form class="form-horizontal" method="POST" action="save-user">
					<input type="hidden" name="id" value="${task.id}"/>
					<div class="form-group">
						<label class="control-label col-md-3">Name</label>
						<div class="col-md-7">
							<input type="text" class="form-control" name="name" value="${task.name}"/>
						</div>				
					</div>
					
					<div class="form-group">
						<label class="control-label col-md-3">Surname</label>
						<div class="col-md-7">
							<input type="text" class="form-control" name="surname" value="${task.surname}"/>
						</div>				
					</div>
					
					<div class="form-group">
						<label class="control-label col-md-3">Address</label>
						<div class="col-md-7">
							<input type="text" class="form-control" name="address" value="${task.address}"/>
						</div>				
					</div>	
					<div class="form-group">
						<input type="submit" class="btn btn-primary" value="Save"/>
					</div>
				</form>
			</div>
		</c:when>		
	</c:choose>