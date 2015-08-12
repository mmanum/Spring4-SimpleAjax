<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<title>Spring MVC Tutorial - JQuery</title>
	
		
	<!-- JSP -->
	<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
        
    <!-- My CSS -->
    <link rel="stylesheet" href="<c:url value='/css/style.css'/>">
    
	
	<script type="text/javascript" src="http://code.jquery.com/jquery-1.10.1.min.js" ></script>
	
	<script type="text/javascript">
		$(document).ready(function () {
			$(".flip").click(function() {
				$(".panel").slideToggle("slow");				
			});
		});		
	</script>
	
	
</head>

<body>
	<div class="panel">
		<p>This is simple jQuery Show/Hide Example by Crunchify...</p>
		<p>Click below Show/Hide again to Toggle visibility...</p>		
	</div>	
	<br>
	<p class="flip">Click here to Show/Hide Panel</p>
	<br/>
	
	<div align="center">
		<div class="container">
		Simple jQuery Example by xaduin
		Click <a href='http://crunchify.com/category/java-web-development-tutorial/'>here</a> for more than 150 examples.<br/>
		</div> 
	</div>
</body>
</html>