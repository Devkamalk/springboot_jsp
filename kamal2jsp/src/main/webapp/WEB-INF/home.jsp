<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Welcome to our home</title>
<script type="text/javascript" src="/javascript/homescript.js"></script>
<script type="text/javascript" src="/javascript/jquery-3.7.0.js"></script>
<link type="text/css" rel="Stylesheet" href="javascript/jqwidgets/styles/jqx.base.css" />
<link type="text/css" rel="Stylesheet" href="javascript/jqwidgets/styles/jqx.orange.css" />
<script type="text/javascript" src="javascript/jqwidgets/jqxcore.js"></script>
<script type="text/javascript" src="javascript/jqwidgets/jqxribbon.js"></script>
</head>
<body>
    <div id="jqxRibbon">
        <ul>
            <li>About Us and Vision</li>
            <li>Feedback</li>
            <li>Contact Us</li>
        </ul>
        <div>
            <div>
            <br>
                <b>Welcome to home page of our app.</b> <br>
                <br>
                We have created this app to tell you about ourselves and 
                what we wish to create and become in future. <br>
                
                Our mission is to help beginners or new enthusiast to work on technologies in a easy 
                manner. <br>Apart from knowledge spread in the society, We will be helping businesses
                 to create apps as per there custom needs/requirements. We hope we will spread lots
                 of knowledge.<br>
                 <br>
                 
                 Thanks visiting
            </div>
            <div>
                <b>This is our feedback,</b> <br>
                <br>
                It is currently in progress.
                <br>
                <br>
                Here idea is to allow give us open feedback to include new ideas or improve as per
                your feedback.<br>
                
                Thanks for your valuable time and feedback.
                <br>
                <br>
                <!-- <form action="/newFeedBack"> -->
                <label>Name:-</label>
                <input type="text" id="nameId"><br><br>
                <label>Email-Id:-</label>
                <input type="text" id="emailId"><br>
                <p><label> Please add your feedback:</label></p>
                <textarea id = "textArea" rows="10" cols="100"></textarea>
                <br>
                <button type="button" onclick="newFeedBack()" > Submit </button>
                </div>
            <div>
               <b>This is our contact us page:</b><br>
               <br>
               Below is our email id and contact no which will help you reach us without any delay.<br>
               <br>
               <br>
               Email: kamalkishore95@gmail.com
               <br>
               Contact: +91 9717390401
               </div>
        </div>
    </div>
</body>
<script>
initHomeElements();
</script>
</html>