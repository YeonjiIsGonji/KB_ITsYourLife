const obj = {
	name: '이효석',
	isOld: true
};

function getKeyValue(obj, key) {
	console.log(obj.name);
	console.log(obj[key]);
}

getKeyValue(obj, 'isOld');