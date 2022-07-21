<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
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
								<form action="AddInstructionController" method="post">

									<div class="form-row">
										<div class="form-group">
											<label class="mb-1"><strong>Name</strong></label> <input
												type="text" class="form-control" name="name">
										</div>

										<div class="form-group">
											<label class="mb-1"><strong>type</strong></label> <input
												type="text" class="form-control" name="type">
										</div>

										<div class="form-group">
											<label class="mb-1"><strong>Description </strong></label> <input
												type="text" class="form-control" name="description">
										</div>


										<div class="form-group">
											<label class="mb-1"><strong>Time</strong></label> <input
												type="time" class="form-control" name="time">
										</div>

										
										<div	class="dropdown bootstrap-select style-1 btn-secondary default-select">
										<label class="mb-1"><strong>Select House:</strong></label>
											<select class="style-1 btn-secondary default-select"
												tabindex="-98" name="houseId">
												<c:forEach items="${houselist }" var="it">
													<option value="${it.houseId }">${it.houseBlock }</option>
												</c:forEach>
											</select>

											<div class="dropdown-menu" role="combobox"
												x-placement="bottom-start"
												style="max-height: 250.031px; overflow: hidden; min-height: 0px; position: absolute; will-change: transform; top: 0px; left: 0px; transform: translate3d(0px, 40px, 0px);">
												<div class="inner show" role="listbox" aria-expanded="false"
													tabindex="-1"
													style="max-height: 232.031px; overflow-y: auto; min-height: 0px;">
													<ul class="dropdown-menu inner show">
														<li class="selected active"><a role="option"
															class="dropdown-item selected active"
															aria-disabled="false" tabindex="0" aria-selected="true"><span
																class="text">Weekly (2021)</span></a></li>
														<li><a role="option" class="dropdown-item"
															aria-disabled="false" tabindex="0" aria-selected="false"><span
																class="text">Daily (2021)</span></a></li>
														<li><a role="option" class="dropdown-item"
															aria-disabled="false" tabindex="0" aria-selected="false"><span
																class="text">Yearly (2021)</span></a></li>
													</ul>
												</div>
											</div>
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