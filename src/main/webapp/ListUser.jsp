<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<jsp:include page="Css.jsp"></jsp:include>
</head>
<body>
	<jsp:include page="AdminHeader.jsp"></jsp:include>
	<jsp:include page="AdminSidebar.jsp"></jsp:include>
	<div class="content-body">
		<div class="container-fluid">
			<!-- Add Project -->
			<div class="modal fade" id="addProjectSidebar">
				<div class="modal-dialog" role="document">
					<div class="modal-content">
						<div class="modal-header">
							<h5 class="modal-title">Create Project</h5>
							<button type="button" class="close" data-dismiss="modal">
								<span>&times;</span>
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
						<span>Datatable</span>
					</div>
				</div>
				<div
					class="col-sm-6 p-md-0 justify-content-sm-end mt-2 mt-sm-0 d-flex">
					<ol class="breadcrumb">
						<li class="breadcrumb-item"><a href="javascript:void(0)">Table</a></li>
						<li class="breadcrumb-item active"><a
							href="javascript:void(0)">Datatable</a></li>
					</ol>
				</div>
			</div>


			<div class="row">
				<div class="col-12">
					<div class="card">
						<div class="card-header">
							<h4 class="card-title">Pending Aprroval People</h4>
						</div>
						<div class="card-body">
							<div class="table-responsive">
								<div id="example_wrapper" class="dataTables_wrapper">
									<div class="dataTables_length" id="example_length">
										<label>Show
											<div class="dropdown bootstrap-select">
												<select name="example_length" aria-controls="example"
													class="" tabindex="-98"><option value="10">10</option>
													<option value="25">25</option>
													<option value="50">50</option>
													<option value="100">100</option></select>
												<button type="button" class="btn dropdown-toggle btn-light"
													data-toggle="dropdown" role="button" title="10">
													<div class="filter-option">
														<div class="filter-option-inner">
															<div class="filter-option-inner-inner">10</div>
														</div>
													</div>
												</button>
												<div class="dropdown-menu " role="combobox">
													<div class="inner show" role="listbox"
														aria-expanded="false" tabindex="-1">
														<ul class="dropdown-menu inner show"></ul>
													</div>
												</div>
											</div> entries
										</label>
									</div>
									<div id="example_filter" class="dataTables_filter">
										<label>Search:<input type="search" class=""
											placeholder="" aria-controls="example"></label>
									</div>
									<table id="example" class="display dataTable"
										style="min-width: 845px" role="grid"
										aria-describedby="example_info">
										<thead>
											<tr role="row">
												<th class="sorting" tabindex="0" aria-controls="example"
													rowspan="1" colspan="1"
													aria-label="Age: activate to sort column ascending"
													style="width: 40.8281px;">User Id</th>
												<th class="sorting" tabindex="0" aria-controls="example"
													rowspan="1" colspan="1"
													aria-label="Age: activate to sort column ascending"
													style="width: 40.8281px;">First Name</th>
												<th class="sorting" tabindex="0" aria-controls="example"
													rowspan="1" colspan="1"
													aria-label="Age: activate to sort column ascending"
													style="width: 40.8281px;">Last Name</th>
												<th class="sorting" tabindex="0" aria-controls="example"
													rowspan="1" colspan="1"
													aria-label="Start date: activate to sort column ascending"
													style="width: 85.7188px;">Email</th>
												<th class="sorting" tabindex="0" aria-controls="example"
													rowspan="1" colspan="1"
													aria-label="Salary: activate to sort column ascending"
													style="width: 83.5078px;">Gender</th>
												<th class="sorting" tabindex="0" aria-controls="example"
													rowspan="1" colspan="1"
													aria-label="Salary: activate to sort column ascending"
													style="width: 83.5078px;">Number</th>
												<th class="sorting" tabindex="0" aria-controls="example"
													rowspan="1" colspan="1"
													aria-label="Salary: activate to sort column ascending"
													style="width: 83.5078px;">Action</th>
											</tr>
										</thead>
										<tbody>
											<c:forEach items="${listUser}" var="it">
												<c:if test="${it.approvel == 'pending' }">
													<tr class="odd" role="row">
														<td class="sorting_1">${it.userId }</td>
														<td>${it.firstName }</td>
														<td>${it.lastName }</td>
														<td>${it.email }</td>
														<td>${it.gender }</td>
														<td>${it.number }</td>
														<td><span class="badge light badge-success"><a
																href="ApproveDoneController?userId=${it.userId }">Approve</a></span>
															<span class="badge light badge-danger"> <a href="DeleteUserController?userId=${it.userId }"> Delete </a></span></td>
												</c:if>
												</tr>
											</c:forEach>
										</tbody>
										<tfoot>
											<tr>
												<th rowspan="1" colspan="1">Name</th>
												<th rowspan="1" colspan="1">Position</th>
												<th rowspan="1" colspan="1">Office</th>
												<th rowspan="1" colspan="1">Age</th>
												<th rowspan="1" colspan="1">Start date</th>
												<th rowspan="1" colspan="1">Salary</th>
											</tr>
										</tfoot>
									</table>
									<div class="dataTables_info" id="example_info" role="status"
										aria-live="polite">Showing 1 to 10 of 57 entries</div>
									<div class="dataTables_paginate paging_simple_numbers"
										id="example_paginate">
										<a class="paginate_button previous disabled"
											aria-controls="example" data-dt-idx="0" tabindex="0"
											id="example_previous"><i class="fa fa-angle-double-left"
											aria-hidden="true"></i></a><span><a
											class="paginate_button current" aria-controls="example"
											data-dt-idx="1" tabindex="0">1</a><a class="paginate_button "
											aria-controls="example" data-dt-idx="2" tabindex="0">2</a><a
											class="paginate_button " aria-controls="example"
											data-dt-idx="3" tabindex="0">3</a><a class="paginate_button "
											aria-controls="example" data-dt-idx="4" tabindex="0">4</a><a
											class="paginate_button " aria-controls="example"
											data-dt-idx="5" tabindex="0">5</a><a class="paginate_button "
											aria-controls="example" data-dt-idx="6" tabindex="0">6</a></span><a
											class="paginate_button next" aria-controls="example"
											data-dt-idx="7" tabindex="0" id="example_next"><i
											class="fa fa-angle-double-right" aria-hidden="true"></i></a>
									</div>
								</div>
							</div>
							<div class="card-header">
							<h4 class="card-title">Aprrove People</h4>
						</div>
							<table id="example" class="display dataTable"
								style="min-width: 845px" role="grid"
								aria-describedby="example_info">
								<thead>
									<tr role="row">
										<th class="sorting" tabindex="0" aria-controls="example"
											rowspan="1" colspan="1"
											aria-label="Age: activate to sort column ascending"
											style="width: 40.8281px;">User Id</th>
										<th class="sorting" tabindex="0" aria-controls="example"
											rowspan="1" colspan="1"
											aria-label="Age: activate to sort column ascending"
											style="width: 40.8281px;">First Name</th>
										<th class="sorting" tabindex="0" aria-controls="example"
											rowspan="1" colspan="1"
											aria-label="Age: activate to sort column ascending"
											style="width: 40.8281px;">Last Name</th>
										<th class="sorting" tabindex="0" aria-controls="example"
											rowspan="1" colspan="1"
											aria-label="Start date: activate to sort column ascending"
											style="width: 85.7188px;">Email</th>
										<th class="sorting" tabindex="0" aria-controls="example"
											rowspan="1" colspan="1"
											aria-label="Salary: activate to sort column ascending"
											style="width: 83.5078px;">Gender</th>
										<th class="sorting" tabindex="0" aria-controls="example"
											rowspan="1" colspan="1"
											aria-label="Salary: activate to sort column ascending"
											style="width: 83.5078px;">Number</th>
										<th class="sorting" tabindex="0" aria-controls="example"
											rowspan="1" colspan="1"
											aria-label="Salary: activate to sort column ascending"
											style="width: 83.5078px;">Action</th>

									</tr>
								</thead>
								<tbody>
									<c:forEach items="${listUser}" var="it">
										<c:if test="${it.approvel == 'done' }">
											<tr class="odd" role="row">
												<td class="sorting_1">${it.userId }</td>
												<td>${it.firstName }</td>
												<td>${it.lastName }</td>
												<td>${it.email }</td>
												<td>${it.gender }</td>
												<td>${it.number }</td>
												<td></td>


											</tr>
										</c:if>
									</c:forEach>
								</tbody>
								<tfoot>
									<tr>
										<th rowspan="1" colspan="1">Name</th>
										<th rowspan="1" colspan="1">Position</th>
										<th rowspan="1" colspan="1">Office</th>
										<th rowspan="1" colspan="1">Age</th>
										<th rowspan="1" colspan="1">Start date</th>
										<th rowspan="1" colspan="1">Salary</th>
									</tr>
								</tfoot>
							</table>
						</div>
					</div>
				</div>

			</div>
		</div>
	</div>

	<jsp:include page="Js.jsp"></jsp:include>

</body>
</html>