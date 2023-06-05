/**
 * 
 */

function initHomeElements(){
	$("#jqxRibbon").jqxRibbon({ theme: "orange", width: 1520	, height: 800/*, mode: "popup"*/, position: "top", selectionMode: "click" });
}

var msg="";
var msgDto={'name':"", 'emailId':"", 'message':""};
/*$("#textArea").getSelectedItem({});*/
/*if(document.getElementById("textArea")!=null){
var txtAreaValue = document.getElementById("textArea").innerHTML;
}
console.log(txtAreaValue);*/
function newFeedBack(){
	if(document.getElementById("textArea")!=null){
		msgDto.message = document.getElementById("textArea").value;
		msgDto.name = document.getElementById("nameId").value;
		msgDto.emailId = document.getElementById("emailId").value;
		//msg=txtAreaValue;
		//msgDto=JSON.stringify(msgDto);
		
}
console.log(msgDto);
	
	console.log("in feed back call");
	$.ajax({
		url:"http://localhost:8080/newFeedBack",
		type:"POST",
		async:true,
		data:msgDto,
		success:
		function (data){
		console.log(data);
		}
		
	});
	
}
/* $(document).ready(function () {
            $("#jqxRibbon").jqxRibbon({ width: 320, height: 200, position: "top", selectionMode: "click" });
        });*/