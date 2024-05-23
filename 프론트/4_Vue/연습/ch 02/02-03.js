const p1 = {name : 'john', age: 20};
//const는 변경할 수 없는 상수!
p1.age = 22;
// p1은 객체의 메모리 주소를 갖고 있기 때문에 주소는 변함없음(상수)
//내부의 속성값을 바꾼다고 메모리 주소가 바뀌지 않음
console.log(p1);

// p1 = {name: 'lee', age: 25};