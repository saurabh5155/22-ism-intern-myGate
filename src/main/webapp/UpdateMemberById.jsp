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
							<h4 class="card-title">Add Member</h4>
						</div>
						<div class="card-body">
							<div class="basic-form">
								<form action="UpdateMemberController" method="post">
								${listMember.memberId }
								<input type="hidden" name="memberId"  value="${listMember.memberId }" > 
									<div class="form-row">
										<div class="form-group col-md-6">
											<label>Member name</label> <input type="text"
												class="form-control" name="memberName" value=" ${listMember.memberName }">
										</div>
										
										<div class="form-group col-md-6">
											<label>Member Number</label> <input type="number"
												class="form-control" name="memberNumber" value="${listMember.memberNumber }">
										</div>
										
										<div class="form-group col-md-6">
											<label>Member Age</label> <input type="number"
												class="form-control" name="memberAge" value="${listMember.memberAge }">
										</div>
										<div class="form-group col-md-6">
										<label class="mb-1"><strong>Gender</strong></label>
										<div class="form-group mb-0">
											<label class="radio-inline mr-3"><input type="radio"
												name="gender" value="male"> Male</label> <label
												class="radio-inline mr-3"><input type="radio"
												name="gender" value="female"> Female</label>
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