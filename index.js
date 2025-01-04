import {connection} from './main.js'

let btn = document.getElementById("btn");
connection.onopen = function(){
	console.log('Connected!');
    
};

connection.onerror = function(error){
	console.log('WebSocket Error ' + error);
};

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
