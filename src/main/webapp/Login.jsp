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
									<h4 class="text-center mb-4">Sign in your account</h4>
									<form action="LoginController" method="post">
									<span class="badge badge-rounded badge-danger">${wait } </span>
									<span class="badge badge-rounded badge-danger">${InvalidUser } </span>
										<div class="form-group">
											<label class="mb-1"><strong>Email</strong></label> <input
												type="email" class="form-control" name="email" placeholder="hello@example.com">
										</div>
										<div class="form-group">
											<label class="mb-1"><strong>Password</strong></label> <input
												type="password" class="form-control" name="password" placeholder="Password">
										</div>
										
											<div class="form-group">
												<a href="page-forgot-password.html">Forgot Password?</a>
											</div>
										</div>
										<div class="text-center">
											<button type="submit" class="btn btn-primary btn-block">Sign
												Me In</button>
										</div>
										
									</form>
									<div class="new-account mt-3">
										<p>
											Don't have an account? <a class="text-primary"
												href="Signup.jsp">Sign up</a>
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
</body>
<jsp:include page="Js.jsp"></jsp:include>
</html>