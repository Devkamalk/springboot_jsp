/**
 * 
 */

function initHomeElements(){
	$("#jqxRibbon").jqxRibbon({ theme: "orange", width: 1520	, height: 800/*, mode: "popup"*/, position: "top", selectionMode: "click" });
	
	fetchFeedbacks();
	createTableRows();

}

var msg="";
var msgDto={'name':"", 'emailId':"", 'message':""};
var editDto={'name':"", 'emailId':"", 'message':""};
var editFlag=false;
/*$("#textArea").getSelectedItem({});*/
/*if(document.getElementById("textArea")!=null){
var txtAreaValue = document.getElementById("textArea").innerHTML;
}
console.log(txtAreaValue);*/


function newFeedBack(){
	if(editFlag){
		editCall(editDto);
	} else {
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
		url:"http://localhost:8080/newFeedBack",//"http://localhost:8080/newFeedBack?message="+msgDto,
		type:"POST",
		async:true,
		data:msgDto,
		success:
		function (data){
		console.log(data);
		}
		
	});
	}
	
}

function createTableRows(){
	
	var table = document.getElementById("tableId");
	
	for(let i=0;i<feedBackList.length;i++){
		var row = document.createElement("tr");
		//for(let j=0;j<2;j++){
			var cellName = document.createElement("td");
			var cellNameText = document.createTextNode(` ${feedBackList[i].name}`);
			cellName.appendChild(cellNameText);
			row.appendChild(cellName);
			
			var cellMsg = document.createElement("td");
			var cellMsgText = document.createTextNode(` ${feedBackList[i].message}`);
			cellMsg.appendChild(cellMsgText);
			row.appendChild(cellMsg);
			
			//var cellButton = document.createElement("td");
			/*var newButton = document.createElement("button");
			newButton.style.width='100%';
			newButton.innerText='editFeedBack';
			//cellButton.appendChild(newButton);
			row.appendChild(newButton);*/
			
			var cellEdit = document.createElement("td");
			var cellEditText = document.createTextNode("Edit Feedback");
			cellEdit.appendChild(cellEditText);
			row.appendChild(cellEdit);
		//}
		table.appendChild(row);
	}
	
	var table = document.getElementById("tableId");
	
	/*table.onclick= function(){
		console.log("cliked");
		
		if (table != null) {
    for (var i = 0; i < table.rows.length; i++) {
        for (var j = 0; j < table.rows[i].cells.length; j++)
        if(table.rows[i].cells[j]!=null && table.rows[i].cells[j]!=undefined){
        //table.rows[i].cells[j].onclick = function () {
            //tableText(this);
            tableText(this);
            break;
            //console.log(table.rows[i].cells[j].innerText);
        //};
        }
        break;
    }
}
	}*/
	
/*	if (table != null) {
    for (var i = 1; i < table.rows.length; i++) {
        for (var j = 0; j < table.rows[i].cells.length; j++)
        if(table.rows[i].cells[j]!=null && table.rows[i].cells[j]!=undefined){
        table.rows[i].cells[j].onclick = function () {
            tableText(this);
            console.log(table.rows[i].cells[2].innerText);
        };
        }
    }
}
*/
/*function tableText(tableCell) {
    //alert(tableCell.innerHTML);
    if(tableCell.cells!=null && table.cells!=undefined){
    console.log(tableCell.cells[0].innerText);
    }
}*/

var editDto={'name':"", 'emailId':"", 'message':""};
$("#tableId tr").click(function(){
   $(this).addClass('selected').siblings().removeClass('selected');    
   editDto.name=$(this).find('td:eq(0)').html();
   editDto.emailId=$(this).find('td:eq(1)').html();
   editDto.message=$(this).find('td:eq(2)').html();
  // var value2=$(this).find('td:second').html();
   //var value3=$(this).find('td:third').html();
   alert(editDto.name);    
   console.log(editDto.name)
   console.log(editDto.name);
   console.log(editDto.name);
   
    editFeedBack(editDto);
   
});
	
	
}

var feedBackList=[];

function fetchFeedbacks(){
	$.ajax({
		url: "http://localhost:8080/getAllFeedbacks",
		type: "GET",
		async: false,
		success : 
		function(data){
			console.log(data);
			feedBackList=data;
		}
		
	});
}

function editFeedBack(editDto){
	editFlag=true;
	$("#nameId").val(editDto.name);
	$("#textArea").val(editDto.message);
	//$("nameId").val("editDto.name");
	$("#emailId").val(editDto.emailId);
	
}

function editCall(editDto){
	
	editDto.message = document.getElementById("textArea").value;
	editDto.name = document.getElementById("nameId").value;
	editDto.emailId = document.getElementById("emailId").value;
	
	$.ajax({
		url:"http://localhost:8080/editFeedBack",//"http://localhost:8080/newFeedBack?message="+msgDto,
		type:"POST",
		async:true,
		data:editDto,
		success:
		function (data){
		console.log(data);
		}
		
	});
}

/* $(document).ready(function () {
            $("#jqxRibbon").jqxRibbon({ width: 320, height: 200, position: "top", selectionMode: "click" });
        });*/