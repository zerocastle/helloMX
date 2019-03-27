<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>페이지 이동 테스트</title>
<style>
	body{
		margin: 0;
	}
	#container {
		margin:0 auto;
		width:80%;
		height: 90%;
		border:2px dotted green;
	}
	#upperMenu {
		display:block;
		height:200px;
		border:1px solid yellow;
	}
	.innerMargin {
		margin:1%;
	}
	#article {
		height:800px;
		border:1px solid blue;
	}
	#footer {
		height:150px;
		border:1px solid orange;
	}
</style>
<script src="<c:url value="/resources/js/jquery-3.3.1.min.js"/>"></script>
</head>
<body>
<div id="container">
	<div id="upperMenu" class="innerMargin">
		<jsp:include page="main/upperMenu.jsp"/>
	</div>
	<div id="article"class="innerMargin">
		<jsp:include page="main/article.jsp"/>
	</div>
	<div id="footer"class="innerMargin">
		<jsp:include page="main/footer.jsp"/>
	</div>
</div>
</body>
</html>