<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<jsp:include page="Css.jsp"></jsp:include>
</head>
<body>
	<jsp:include page="Header.jsp"></jsp:include>
	<jsp:include page="Sidebar.jsp"></jsp:include>

	<div class="content-body">
		<div class="container-fluid">
			<!-- Add Project -->


			<!-- row -->
			<div class="row">



				<div class="col-xl-12 col-lg-12">
					<div class="card">
						
						<div class="card-header">
							<h4 class="card-title">Add Your House number</h4>
						</div>
						<div class="card-header">
							<span class="badge badge-rounded badge-danger">${notHouse }</span>
						</div>
						<div class="card-body">
							<div class="basic-form">
								<form action="AddHouseController" method="post">

									<div class="form-row">
										<div class="form-group col-md-6">
											<label>House Block</label> <input type="text"
												class="form-control" name="houseBlock">
										</div>
										<div class="form-group col-md-6">
											<label>House Number</label> <input type="number"
												class="form-control" name="houseNumber">
										</div>

									</div>

							<button type="submit" class="btn btn-primary">Submit</button>
							</form>
							</div>
						</div>
					</div>
				</div>
			</div>
		</div>
		</div>
		<jsp:include page="Js.jsp"></jsp:include>
</body>
</html>