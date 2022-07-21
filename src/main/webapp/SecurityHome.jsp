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
	<div class="header">
		<div class="header-content">
			<nav class="navbar navbar-expand">
				<div class="collapse navbar-collapse justify-content-between">
					<div class="header-left"></div>
					<ul class="navbar-nav header-right main-notification">
						<li class="nav-item dropdown notification_dropdown"><a
							class="nav-link bell dz-theme-mode" href="#"> <i
								id="icon-light" class="fa fa-sun-o"></i> <i id="icon-dark"
								class="fa fa-moon-o"></i>
						</a></li>
						<li class="nav-item dropdown notification_dropdown"><a
							class="nav-link bell dz-fullscreen" href="#"> <svg
									id="icon-full" viewBox="0 0 24 24" width="20" height="20"
									stroke="currentColor" stroke-width="2" fill="none"
									stroke-linecap="round" stroke-linejoin="round"
									class="css-i6dzq1">
									<path
										d="M8 3H5a2 2 0 0 0-2 2v3m18 0V5a2 2 0 0 0-2-2h-3m0 18h3a2 2 0 0 0 2-2v-3M3 16v3a2 2 0 0 0 2 2h3"
										style="stroke-dasharray: 37, 57; stroke-dashoffset: 0;"></path></svg>
								<svg id="icon-minimize" width="20" height="20"
									viewBox="0 0 24 24" fill="none" stroke="currentColor"
									stroke-width="2" stroke-linecap="round" stroke-linejoin="round"
									class="feather feather-minimize">
									<path
										d="M8 3v3a2 2 0 0 1-2 2H3m18 0h-3a2 2 0 0 1-2-2V3m0 18v-3a2 2 0 0 1 2-2h3M3 16h3a2 2 0 0 1 2 2v3"
										style="stroke-dasharray: 37, 57; stroke-dashoffset: 0;"></path></svg>
						</a></li>




						<li class="nav-item dropdown header-profile"><a
							class="nav-link" href="#" role="button" data-toggle="dropdown">
								<img src="images/profile/pic1.jpg" width="20" alt="">
								<div class="header-info">
									<span>Johndoe</span> <small>Super Admin</small>
								</div>
						</a>
							<div class="dropdown-menu dropdown-menu-right">


								<a href="LogoutController" class="dropdown-item ai-icon"> <svg
										id="icon-logout" xmlns="http://www.w3.org/2000/svg"
										class="text-danger" width="18" height="18" viewBox="0 0 24 24"
										fill="none" stroke="currentColor" stroke-width="2"
										stroke-linecap="round" stroke-linejoin="round">
										<path d="M9 21H5a2 2 0 0 1-2-2V5a2 2 0 0 1 2-2h4"></path>
										<polyline points="16 17 21 12 16 7"></polyline>
										<line x1="21" y1="12" x2="9" y2="12"></line></svg> <span
									class="ml-2">Logout </span>
								</a>
							</div></li>
					</ul>
				</div>
			</nav>

		</div>
	</div>


	<!-- Table -->
<div class="row">
	<div class="col-12">
		<div class="card">
			<div class="card-header">
				<h4 class="card-title">Basic Datatable</h4>
			</div>
			<div class="card-body">
				<div class="table-responsive">
					<div id="example_wrapper" class="dataTables_wrapper">
						<!-- <div class="dataTables_length" id="example_length">
							<label>Show
								<div class="dropdown bootstrap-select">
									<select name="example_length" aria-controls="example" class=""
										tabindex="-98"><option value="10">10</option>
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
										<div class="inner show" role="listbox" aria-expanded="false"
											tabindex="-1">
											<ul class="dropdown-menu inner show"></ul>
										</div>
									</div>
								</div> entries
							</label>
						</div> -->
						<h2>Pending</h2>
						<div id="example_filter" class="dataTables_filter">
							<label>Search:<input type="search" class=""
								placeholder="" aria-controls="example"></label>
						</div>
						<table id="example" class="display dataTable"
							style="min-width: 845px" role="grid"
							aria-describedby="example_info">
							<thead>
								<tr role="row">
									<th class="sorting_asc" tabindex="0" aria-controls="example"
										rowspan="1" colspan="1" aria-sort="ascending"
										aria-label="Name: activate to sort column descending"
										style="width: 137.297px;">Id</th>
									<th class="sorting_asc" tabindex="0" aria-controls="example"
										rowspan="1" colspan="1" aria-sort="ascending"
										aria-label="Name: activate to sort column descending"
										style="width: 137.297px;">Name</th>
									<th class="sorting" tabindex="0" aria-controls="example"
										rowspan="1" colspan="1"
										aria-label="Position: activate to sort column ascending"
										style="width: 218.133px;">Type</th>
									<th class="sorting" tabindex="0" aria-controls="example"
										rowspan="1" colspan="1"
										aria-label="Office: activate to sort column ascending"
										style="width: 105.516px;">Description</th>
									<th class="sorting" tabindex="0" aria-controls="example"
										rowspan="1" colspan="1"
										aria-label="Age: activate to sort column ascending"
										style="width: 40.8281px;">Time</th>
									<th class="sorting" tabindex="0" aria-controls="example"
										rowspan="1" colspan="1"
										aria-label="Start date: activate to sort column ascending"
										style="width: 85.7188px;">House Number</th>
									<th class="sorting" tabindex="0" aria-controls="example"
										rowspan="1" colspan="1"
										aria-label="Salary: activate to sort column ascending"
										style="width: 83.5078px;">Action</th>
								</tr>
							</thead>
							<tbody>
								<c:forEach items="${listIn }" var="it">
								
									<c:if test="${it.status == 'pending' }">
										<tr class="odd" role="row">
											<td class="sorting_1">${it.instruction }</td>
											<td>${it.name }</td>
											<td>${it.type }</td>
											<td>${it.description }</td>
											<td>${it.time }</td>
											<td>${it.houseBlock }</td>
											<td><span class="badge light badge-success"><a
													href="AllowFromInstruction?instructionId=${it.instruction}">Allow</a></span></td>
										</tr>
									</c:if>
								</c:forEach>
							</tbody>
							<tfoot>
								<tr>
									<th rowspan="1" colspan="1">Id</th>
									<th rowspan="1" colspan="1">Name</th>
									<th rowspan="1" colspan="1">Type</th>
									<th rowspan="1" colspan="1">Description</th>
									<th rowspan="1" colspan="1">Time</th>
									<th rowspan="1" colspan="1">House Number</th>
									<th rowspan="1" colspan="1">Action</th>
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
								class="paginate_button " aria-controls="example" data-dt-idx="3"
								tabindex="0">3</a><a class="paginate_button "
								aria-controls="example" data-dt-idx="4" tabindex="0">4</a><a
								class="paginate_button " aria-controls="example" data-dt-idx="5"
								tabindex="0">5</a><a class="paginate_button "
								aria-controls="example" data-dt-idx="6" tabindex="0">6</a></span><a
								class="paginate_button next" aria-controls="example"
								data-dt-idx="7" tabindex="0" id="example_next"><i
								class="fa fa-angle-double-right" aria-hidden="true"></i></a>
						</div>
					</div>
					
					
					
					<h2>Done</h2>
						<table id="example" class="display dataTable"
							style="min-width: 845px" role="grid"
							aria-describedby="example_info">
							<thead>
								<tr role="row">
									<th class="sorting_asc" tabindex="0" aria-controls="example"
										rowspan="1" colspan="1" aria-sort="ascending"
										aria-label="Name: activate to sort column descending"
										style="width: 137.297px;">Id</th>
									<th class="sorting_asc" tabindex="0" aria-controls="example"
										rowspan="1" colspan="1" aria-sort="ascending"
										aria-label="Name: activate to sort column descending"
										style="width: 137.297px;">Name</th>
									<th class="sorting" tabindex="0" aria-controls="example"
										rowspan="1" colspan="1"
										aria-label="Position: activate to sort column ascending"
										style="width: 218.133px;">Type</th>
									<th class="sorting" tabindex="0" aria-controls="example"
										rowspan="1" colspan="1"
										aria-label="Office: activate to sort column ascending"
										style="width: 105.516px;">Description</th>
									<th class="sorting" tabindex="0" aria-controls="example"
										rowspan="1" colspan="1"
										aria-label="Age: activate to sort column ascending"
										style="width: 40.8281px;">Time</th>
									<th class="sorting" tabindex="0" aria-controls="example"
										rowspan="1" colspan="1"
										aria-label="Start date: activate to sort column ascending"
										style="width: 85.7188px;">House Number</th>
									
								</tr>
							</thead>
							<tbody>
								<c:forEach items="${listIn }" var="it">
								
									<c:if test="${it.status == 'done' }">
										<tr class="odd" role="row">
											<td class="sorting_1">${it.instruction }</td>
											<td>${it.name }</td>
											<td>${it.type }</td>
											<td>${it.description }</td>
											<td>${it.time }</td>
											<td>${it.houseBlock }</td>
											
										</tr>
									</c:if>
								</c:forEach>
							</tbody>
							<tfoot>
								<tr>
									<th rowspan="1" colspan="1">Id</th>
									<th rowspan="1" colspan="1">Name</th>
									<th rowspan="1" colspan="1">Type</th>
									<th rowspan="1" colspan="1">Description</th>
									<th rowspan="1" colspan="1">Time</th>
									<th rowspan="1" colspan="1">House Number</th>
									
								</tr>
							</tfoot>
						</table>
				</div>
			</div>
		</div>
	</div>
</div>
	<jsp:include page="Js.jsp"></jsp:include>
</body>
</html>