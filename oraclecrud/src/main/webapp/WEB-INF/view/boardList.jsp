<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<table border="1">
		<thead>
			<tr>
				<th>번호</th>
				<th>제목</th>
				<th>작성자</th>
				<th>상세보기</th>
			</tr>
		</thead>
		<c:forEach var="b" items="${board}">
			<tr>
				<td>${b.boardId}</td>
				<td>${b.boardTitle}</td>
				<td>${b.boardWriter}</td>
				<td><a href="boardOne/${b.boardId}">보기</a>
			</tr>
		</c:forEach>
	</table>
</body>
</html>