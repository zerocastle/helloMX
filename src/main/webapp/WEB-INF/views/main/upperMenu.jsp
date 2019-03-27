<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<script>
	$(function() {
		$('#toHome').click(function() {
			$('#article').load('/hellomx/');
		});
		$('#toMain').click(function() {
			sendRedirect('main');
		});
	});
</script>
상단
<button id="toHome">홈으로 가기</button>
<button id="toMain">메인으로 가기</button>