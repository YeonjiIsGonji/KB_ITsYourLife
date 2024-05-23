// 강사님이 안좋은 코드라 안풀어도 된다고 권장 . 이 코드는 잊어버리라고 했음!!

let p1 = {
	name : "아이패드",
	price : 20000,
	quantity : 2,
	order: function() {
		if (!this.amount) {
			this.amount = this.quantity * this.price;
		}
		console.log("주문금액 : " + this.amount);
	},
	discount(rate) {
		if (rate > 0 && rate < 0.8) {
			this.amount = (1-rate) * this.price * this.quantity;
		}
		console.log((100*rate) + "% 할인된 금액으로 구매합니다.");
	}
}
p1.discount(0.2);
p1.order();