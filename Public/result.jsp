<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<%@ page import="java.util.ArrayList"%>
<%
	@SuppressWarnings("unchecked")
	ArrayList<Integer> resultList = (ArrayList<Integer>) request.getAttribute("resultList");
%>

<!DOCTYPE html>
<html>
<head>
<title>実行結果画面</title>
</head>

<body>
	<p>
		実行結果：<%=resultList.get(0) + "," + resultList.get(1)%>
	</p>
</body>

</html>