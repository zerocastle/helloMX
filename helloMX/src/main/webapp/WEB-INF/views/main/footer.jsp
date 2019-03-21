<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
하단
<c:forEach var="customer" items="${hiber}">
		<div class="editable square">
			<p><span class="${customer.name}">${customer.name}</span></p>
		</div>
</c:forEach>