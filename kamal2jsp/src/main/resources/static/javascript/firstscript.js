/**
 * First Js File
 */
	
/*define([], function () {

var init = function (){
$(document).ready( function (){});
};

return {
            initialize: initialize
        };

});*/



	/*var source = [
	    "Instant coffee",
	    "Irish coffee",
	    "Liqueur coffee"
	];*/


function initElements(){
	console.log("js loaded");
	api();
	console.log(source);
	$("#jqxdropdownlist").jqxDropDownList({ source: source, width: '200px', height: '25px' });
}


function jsFunction() {
	console.log("Hi from first js function")
	var items=['a','z','b','y'];
	for(i in items){
		console.log(items[i]);
	}
	
}
var source = [];
function api(){
	$.ajax({
	url:'http://localhost:8080/hi',
	type:'GET',
	dataType:'json',
	async:false,
	success:
	//console.log(data)
	function(data){
		//console.log("nothing");
		source=data;
		console.log(source);
	}
	
});

}








