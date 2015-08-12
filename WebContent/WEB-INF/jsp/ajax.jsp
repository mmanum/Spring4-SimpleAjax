<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<title>Spring MVC Tutorial - Ajax call</title>
	<style type="text/css">
		body {
			background-image: url('http://crunchify.com/bg.png');
		}
	</style>
	
	<script type="text/javascript" src="http://code.jquery.com/jquery-1.10.1.min.js" ></script>
	
	<script type="text/javascript">
		function xaduinAjax() {
			$.ajax({
				url: 'ajaxtest.html',
				success: function(data) {
					$('#result').html(data);
				}
			});
		}
		
		var intervalId = 0;
		intervalId = setInterval(xaduinAjax, 3000);
	</script>
</head>

<body>
	<div align="center">
		<br/><br/>${message}<br/><br/>
		<div id="result">waiting for datas.....</div>
		<br/>
		<p> by <a href="xaduin.com">xaduin.com</a></p>
	</div>
</body>
</html>