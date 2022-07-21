<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" session="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<jsp:include page="Css.jsp"></jsp:include>
</head>
<body class="vh-100">
	<div class="authincation h-100">
		<div class="container h-100">
			<div class="row justify-content-center h-100 align-items-center">
				<div class="col-md-6">
					<div class="authincation-content">
						<div class="row no-gutters">
							<div class="col-xl-12">
								<div class="auth-form">
									<div class="text-center mb-3">
										<img src="images/logo-full.png" alt="">
									</div>
									<h4 class="text-center mb-4">Sign up your account</h4>
									<form action="SignupController" method="post">
										<div class="form-group">
											<label class="mb-1"><strong>FirstName</strong></label> <input
												type="text" class="form-control" name="firstName"
												placeholder="username">
										</div>

										<div class="form-group">
											<label class="mb-1"><strong>LastName</strong></label> <input
												type="text" class="form-control" name="lastName"
												placeholder="lastName">
										</div>

										<label class="mb-1"><strong>Gender</strong></label>
										<div class="form-group mb-0">
											<label class="radio-inline mr-3"><input type="radio"
												name="gender" value="male"> Male</label> <label
												class="radio-inline mr-3"><input type="radio"
												name="gender" value="female"> Female</label>
										</div>


										<div class="form-group">
											<label class="mb-1"><strong>Number</strong></label> <input
												type="number" class="form-control" name="number"
												placeholder="number">
										</div>

										<div class="form-group">
											<label class="mb-1"><strong>Email</strong></label> <input
												type="email" name="email" class="form-control"
												placeholder="hello@example.com">
										</div>
										<div class="form-group">
											<label class="mb-1"><strong>Password</strong></label> <input
												type="password" name="password" class="form-control" placeholder="Password">
										</div>
										<div class="text-center mt-4">
											<button type="submit" class="btn btn-primary btn-block">Sign
												me up</button>
										</div>
									</form>
									<div class="new-account mt-3">
										<p>
											Already have an account? <a class="text-primary"
												href="Login.jsp">Sign in</a>
										</p>
									</div>
								</div>
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