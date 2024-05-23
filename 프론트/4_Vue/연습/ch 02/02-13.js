//강사님이 안좋은 코드이기 때문에 안풀어도 된다고 권장함. 절대 이런 코드 짜면 안된다 했음!!!

let obj = {result:0};

obj.add = function(x,y) {
	function inner() {
		this.result = x+y;
	}
	inner();
}

obj.add(3,4)

console.log(obj)
console.log(obj.result)
console.log(global.result)
