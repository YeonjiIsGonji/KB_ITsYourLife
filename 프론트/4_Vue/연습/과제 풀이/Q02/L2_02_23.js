const obj1 = { name: "박문수", age: 29 };
const obj2 = { name: obj1.name, age: obj1.age, email: "mspark@gmail.com" };
const obj3 = { ...obj1, email: "mspark@gmail.com" };

console.log(obj2);
console.log(obj3);

const tetzObj = {
  name: "차은우",
  isOld: false,
  address: "서울 어딘가",
};

const copyObj = { ...tetzObj, address: "tdsda" };

console.log(tetzObj);
console.log(copyObj);
console.log(tetzObj === copyObj);
