<%@ page session="false" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
<title>Home</title>
<script src="<c:url value="/resources/js/jquery-3.3.1.min.js"/>"></script>
<!-- <script>
	$(function() {
		var formData=$('#form_value').serialize();
		
		$('#insert').click(function() {
			alert(formData);
			$.ajax({
				url:"/insert/insert",
				method: "post",
				data:formData,
				success:function(data) {
					console.log(data);	
				},
				error:function(xhr,status) {
					alert(xhr +":" + status);
				}
				
			});
		})
		
		var edit=$(".editable");
		edit.click(function() {
			edit.removeClass(".square");
			edit.addClass(".red");
			$('#update').removeClass();
			$('#delete').removeClass();
			console.log($(this).children().children().text());
			var name=$(this).children().children().text();
			$('#name').val(name);
		});
	}); 
</script> -->
<!-- <style>
	.hidden {
		display:none;
	}
	#resultContainer {
	height:50%;
	overflow:auto;
	}
	.square {
		border:1px solid black;
	}
	.red {
		border:1px solid red;
	}
</style> -->
<link href="/resources/css/main.css" rel="stylesheet">
</head>
<body>
<a href="/"> home</a>
<a href="/info">info</a>
<a href="/menu">menu</a>
<a href="/membership">membership</a>
	<h1>Hello world!</h1>

	<P>The time on the server is ${serverTime}.</P>
	<div id="resultContainer">
	<c:forEach var="customer" items="${list}">
		<div class="editable square">
			<p><span class="${customer.name}">${customer.name}</span></p>
		</div>
	</c:forEach>
	</div>
	<p>${insert}</p>
	<hr />
	<form action="/hellomx/insert" method="post">	
	아이디<input type="text" name="cid" id="cid"/><br />
		이름<input type="text"name="name" id="name" /><br />
		비밀번호<input type="text" name="password" id="password" /><br />
		전화번호<input type="text" name="telephone" id="telephone"/><br />
		이메일<input type="text" name="email" id="email"/><br />
		주소<input type="text" name="address" id="address"/><br />
		생년월일과 등록일은 자동으로<br />
		<input type="submit" id="submit" value="등록"/>
	</form>
</body>
</html>
