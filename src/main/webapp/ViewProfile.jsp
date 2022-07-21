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
	<div class="content-body" style="min-height: 812px;">
		<div class="container-fluid">
			<!-- Add Project -->
			<div class="modal fade" id="addProjectSidebar">
				<div class="modal-dialog" role="document">
					<div class="modal-content">
						<div class="modal-header">
							<h5 class="modal-title">Create Project</h5>
							<button type="button" class="close" data-dismiss="modal">
								<span>×</span>
							</button>
						</div>
						<div class="modal-body">
							<form>
								<div class="form-group">
									<label class="text-black font-w500">Project Name</label> <input
										type="text" class="form-control">
								</div>
								<div class="form-group">
									<label class="text-black font-w500">Deadline</label> <input
										type="date" class="form-control">
								</div>
								<div class="form-group">
									<label class="text-black font-w500">Client Name</label> <input
										type="text" class="form-control">
								</div>
								<div class="form-group">
									<button type="button" class="btn btn-primary">CREATE</button>
								</div>
							</form>
						</div>
					</div>
				</div>
			</div>
			<div class="row page-titles mx-0">
				<div class="col-sm-6 p-md-0">
					<div class="welcome-text">
						<h4>Hi, welcome back!</h4>
						<p class="mb-0">Validation</p>
					</div>
				</div>
				<div
					class="col-sm-6 p-md-0 justify-content-sm-end mt-2 mt-sm-0 d-flex">
					<ol class="breadcrumb">
						<li class="breadcrumb-item"><a href="javascript:void(0)">Form</a></li>
						<li class="breadcrumb-item active"><a
							href="javascript:void(0)">Validation</a></li>
					</ol>
				</div>
			</div>
			<!-- row -->
			<div class="row">
				<div class="col-lg-12">
					<div class="card">
						<div class="card-header">
							<h4 class="card-title">Form Validation</h4>
						</div>
						<div class="card-body">
							<div class="form-validation">
								<form class="form-valide" action="UpdateProfileController" method="post"
									novalidate="novalidate">
									<div class="row">
										<div class="col-xl-6">
											<div class="form-group row">
												<label class="col-lg-4 col-form-label" for="val-username">FirstName
													<span class="text-danger">*</span>
												</label>
												<div class="col-lg-6">
													<input type="text" class="form-control" id="val-username"
														name="firstName" 
														value="${userBean.firstName }">
												</div>
											</div>

											<div class="form-group row">
												<label class="col-lg-4 col-form-label" for="val-username">LastName
													<span class="text-danger">*</span>
												</label>
												<div class="col-lg-6">
													<input type="text" class="form-control" id="val-username"
														name="lastName"
														value="${userBean.lastName }">
												</div>
											</div>

											<div class="form-group row">
												<label class="col-lg-4 col-form-label" for="val-username">Contact
													Number <span class="text-danger">*</span>
												</label>
												<div class="col-lg-6">
													<input type="text" class="form-control" id="val-username"
														name="number" 
														value="${userBean.number }">
												</div>
											</div>

											<label class="mb-1"><strong>Gender</strong></label>
											<div class="form-group mb-0">
												<label class="radio-inline mr-3"><input type="radio"
													name="gender" value="male"> Male</label> <label
													class="radio-inline mr-3"><input type="radio"
													name="gender" value="female"> Female</label>
											</div>

											<div class="form-group row">
												<label class="col-lg-4 col-form-label" for="val-username">Email
													<span class="text-danger">*</span>
												</label>
												<div class="col-lg-6">
													<input type="text" class="form-control" id="val-username"
														name="email" 
														value="${userBean.email }">
												</div>
											</div>
										<div class="form-group row">
                                                    <div class="col-lg-8 ml-auto">
                                                        <button type="submit" class="btn btn-primary">Submit</button>
                                                    </div>
                                                </div>
										</div>
									</div>
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