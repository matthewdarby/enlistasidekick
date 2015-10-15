<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE HTML>
<html>
<head>
<title>Enlist a Sidekick</title>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width; initial-scale=1.0">
<link rel="stylesheet" type="text/css" media="screen" href="css/style.css">
</head>
<body>
<div class="block1 p_bottom_zero">
	<div class="container_12">
		<header>
			<h1><a class="logo" href="/"><span class="underline">Enlist</span> A Sidekick</a></h1>
		</header>	  
	</div>
</div>
<div class="block2">
 	<div class="container_12">
		<section class="content">
			<div class="grid_12 last-col">
				<article class="grid_12 last-col">
					<div class="hello_box">A sidekick can help you stay on track!<br /> 
					Even superheroes need sidekicks. <br />
					Invite a sidekick now to help you accomplish your goal!
					</div>
				</article>
			</div>
		</section>
	</div>
<div>
<div class="block3">
  <div class="container_12"> 
    <!--==============================content================================-->
    <section class="content">
			<div class="wrapper projects">
				<form:form modelAttribute="challenger">
<%--         			<form:form action="register" method="post" commandName="challenger"> --%>
					<ul id="homehireus" class="hireform contactform">
						<li>		
							<label for="requestorName">Name:</label>
							<form:input path="requestorName" tabindex="1"/>
						</li>
						<li>		
							<label for="phoneNumber">Phone Number:</label>
							<form:input path="phoneNumber" value="" tabindex="2" />
						</li>
						<li>				
							<label for="goal">Choose a Goal:</label>
							<form:select path="goal" tabindex="3">
								<form:option value="smallgroup">Attend a small group</form:option>
								<form:option value="church">Go to church</form:option>
								<form:option value="relationship">End a relationship</form:option>
								<form:option value="vice">End a vice</form:option>
							</form:select>
						</li>
						<li>				
							<label for="customGoal">Create your goal:</label>
							<form:input path="customGoal" value="" tabindex="4" />
						</li>
						<li>				
							<label for="sidekickName">Sidekick Name:</label>
							<form:input path="sidekickName" value=""  tabindex="5"/>
						</li>
						<li>				
							<label for="sidekickPhoneNumber">Sidekick Phone Number:</label>
							<form:input path="sidekickPhoneNumber" value="" tabindex="6"/>
						</li>
						<li>				
							<label for="startDate">When do you want to get started?</label>
							<form:input path="startDate" value="" tabindex="7"/>
						</li>
						<li>				
							<label for="duration">Duration:</label>
							<form:input path="duration" value="" tabindex="8"/>
						</li>
						<li>				
							<label for="notificationFrequency">Frequency:</label>
							<form:select path="notificationFrequency" id="notificationFrequency">
								<form:option value="">Select Newsletter Frequency: </form:option>
								<c:forEach items="${frequencies}" var="frequency">
									<form:option value="${frequency}">${frequency}</form:option>
								</c:forEach>
							</form:select>
						</li>	
						<li>		
							<p>**Data message rates may apply<br />
							The information submitted will only be used for your goal.</p>
						</li>
						<li>
							<input type="submit" value="Enlist your Sidekick" /> 
						</li>
					</ul>
					<input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}"/>
				</form:form>
			</div>
		</section>
	</div>
</div>
<script type="text/javascript" src="js/jquery-1.8.2.min.js"></script> 
<script type="text/javascript" src="js/superfish.js"></script> 
<script type="text/javascript" src="js/jquery.responsivemenu.js"></script> 
<script type="text/javascript" src="js/jquery.easing.1.3.js"></script> 
<script type="text/javascript" src="js/script.js"></script>

</body>
</html>