import {connection} from './main.js'
let ul = document.getElementById("main")

connection.onmessage = function(e){
	let objs = JSON.parse(e.data)
	let arr = Array.from(objs).reduce((buf, val)=>buf+=`<li class="main_li">${Object.keys(val)}</li>`,"")
	ul.innerHTML = arr
    
};