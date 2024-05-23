let obj = {result: 0};
obj.add = function(x,y) {
	this.result = x + y; // this == obj
}
obj.add(3,4) // add 메서드를 보유한 객체는 obj -> this = obj
console.log(obj)