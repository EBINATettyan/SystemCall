<%@ page language="java" contentType="text/html; charset=UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<title>テスト画面</title>
</head>

<body>
	<form action='SampleServlet' method='POST'>
		<p>
			<input type="number" name="number1">
		</p>
		<p>
			<input type="number" name="number2">
		</p>
		<p>
			<input type="submit" value="送信する">
		</p>
	</form>
</body>

</html>