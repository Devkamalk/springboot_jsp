<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head><b>All About Us/Me</b> 
<script type="text/javascript" src="/javascript/firstscript.js"></script>
<script type="text/javascript" src="/javascript/jquery-3.7.0.js"></script>
<!-- <style type="text/css" href ="/css/NewFile.css"></style> -->
<link href="/css/NewFile.css" rel="stylesheet">

<link rel="stylesheet" href="/javascript/jqwidgets/styles/jqx.base.css" type="text/css"/>
<!-- <script type="text/javascript" src="../../scripts/jquery-1.11.1.min.js"></script> -->
<!-- <script src="http://ajax.googleapis.com/ajax/libs/jquery/1.11.1/jquery.min.js"></script> -->
<script type="text/javascript" src="/javascript/jqwidgets/jqxcore.js"></script>
<script type="text/javascript" src="/javascript/jqwidgets/jqxbuttons.js"></script>
<script type="text/javascript" src="/javascript/jqwidgets/jqxscrollbar.js"></script>
<script type="text/javascript" src="/javascript/jqwidgets/jqxlistbox.js"></script>
<script type="text/javascript" src="/javascript/jqwidgets/jqxdropdownlist.js"></script>
<script type="text/javascript" >
console.log("jsppp Loaded ");
</script>

<!-- <script>
require({
context:'requireApp'
}, ["first4"], function(App) {
App.initialize();
});
</script>  -->
<meta charset="ISO-8859-1">
<title>Home Page</title>
</head>
<body>
<button onclick="jsFunction()" class="button button1"> callJsButton </button></br>
<a href="http://localhost:8080/hi" target="_blank">Redirect to Hi link </a>
<div id='jqxdropdownlist'>
</div>
<script>
initElements();
</script>	
</body>
</html>