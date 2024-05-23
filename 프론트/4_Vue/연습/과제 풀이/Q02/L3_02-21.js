const p = new Promise((res, rej) => {
  setTimeout(() => {
    const num = Math.random();
    if (num >= 0.8) {
      return rej("생성된 숫자가 0.8 이상임 - " + num);
    }
    return res(num);
  }, 2000);
});

p.then((result) => {
  console.log(`처리 결과 : ${result}`);
}).catch((error) => {
  console.log(`오류 : ${error}`);
});
console.log("## Promise 객체 생성!");

//async, await 적용
async function random() {
  console.log("## Promise 객체 생성!");
  try {
    const result = await Promise;
  } catch (error) {
    console.log(`오류 : ${error}`);
  }
}
random();
