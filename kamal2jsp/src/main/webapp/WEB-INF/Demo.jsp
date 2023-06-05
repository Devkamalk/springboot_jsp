<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head><b>Demo JSP Welcome message</b>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Align image with CSS</h1>
<h2>vertical-align: top</h2>
<p>Gif emoticon<img src="smiley.gif" alt="Smiley face" width="42" height="42" style="vertical-align:bottom"> This is some text. This is some text. This is some text.</p>

<b>Displaying jpeg file</b>
<p>Image <img src="kamal.jpeg"  width="960" height="1280" style="vertical-align:bottom"> This is some text. This is some text. This is some text.</p>

<b>Displaying txt file</b>
<iframe src="/textcontent.txt" width="100%" height="100%" style="border:none;">
</iframe>
<iframe src="" width="100%" height="300" style="border:none;">
</iframe>

<b>Displaying pdf file</b>
	<object data="/samsung_missing.pdf" width="800" height="500">
	</object>
</body>
</html>