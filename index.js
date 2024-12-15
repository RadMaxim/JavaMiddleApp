let connection = new WebSocket('ws://127.0.0.1:7777');

connection.onopen = function(){
	console.log('Connected!');
    
};

connection.onerror = function(error){
	console.log('WebSocket Error ' + error);
};

connection.onmessage = function(e){
	console.log(e.data);
    console.log("wef");
    
};
let btn = document.getElementById("btn");
btn.addEventListener('click',(e)=>{
    e.preventDefault()
    onLoginBtnClick();
})
function onLoginBtnClick(){
	let userName = document.getElementById("exampleInputEmail1").value;
	let userPass = document.getElementById("exampleInputPassword1").value;
	let user = {
		type: "login",
		name: userName,
		pass: userPass
	}
	let json = JSON.stringify(user);
	connection.send(json);
};
