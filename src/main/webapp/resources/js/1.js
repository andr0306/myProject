var c=0;
var r = document.getElementById("rating");
document.getElementById("like").onclick = function func1(){
	c++;
	r.innerHTML = c;	
}
document.getElementById("dislike").onclick = function func2(){
		c--;
		r.innerHTML = c;	
}