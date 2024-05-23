const tetzObj = {
	name: '김연지',
	isOld: true,
	sayHello: function () {
		console.log(this.name);
	},
	nestedObj: {
		name: '방시혁',
		isOld: true,
		sayHello: function () {
			console.log(this.name);
			//this = tetzObj.nestedObj
		}
	},
};

tetzObj.sayHello();
tetzObj.nestedObj.sayHello();