let student = {};

student.이름 = '김연지';
student.취미 = '뮤지컬공연관람';
student.특기 = '프로그래밍';
student.장래희망 = '개발자';
//student에 key, value 설정

//student에 toString이라는 key 설정, toString은 익명함수로 설정
student.toString = function () {
	for (let key in this) {
		if (key != 'toString') {
			console.log(key + '\t' + this[key]);
		}
	}
};

student.toString();