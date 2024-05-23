let obj = {result:0};

obj.add = function(x,y) {
	this.result = x+y;
}

let add2 = obj.add;
// add 메서드의 메모리 주소를 add2로 복사. 같은 주소 참조하는 동일 함수 
console.log(add2 === obj.add) //true

add2(3,4) // add2 함수는 특정 객체의 메서드가 아니기 때문에 전역 변수 result에 7이 할당
console.log(obj); //0
console.log(result); //