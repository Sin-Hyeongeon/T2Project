package kr.co.T2Market.domain;

import lombok.Data;

public class CartDTO {

	// 카트 번호
	private String cart_no;

	// 회원 id
	private String member_id;

	// 상품 번호
	private String product_no;

	// 상품 개수
	private int sales;

	// 상품명
	private String product_name;

	// 상품 단가
	private int sell_price;

	// 할인율
	private int discount;

	// 할인율 계산
	private int real_price;

	// 총 판매가
	private int total_sales;

	public String getCart_no() {
		return cart_no;
	}

	public void setCart_no(String cart_no) {
		this.cart_no = cart_no;
	}

	public String getProduct_no() {
		return product_no;
	}

	public void setProduct_no(String product_no) {
		this.product_no = product_no;
	}

	public String getMember_id() {
		return member_id;
	}

	public void setMember_id(String member_id) {
		this.member_id = member_id;
	}

	public int getSales() {
		return sales;
	}

	public void setSales(int sales) {
		this.sales = sales;
	}

	public String getProduct_name() {
		return product_name;
	}

	public void setProduct_name(String product_name) {
		this.product_name = product_name;
	}

	public int getSell_price() {
		return sell_price;
	}

	public void setSell_price(int sell_price) {
		this.sell_price = sell_price;
	}

	public int getDiscount() {
		return discount;
	}

	public void setDiscount(int discount) {
		this.discount = discount;
	}

	public int getReal_price() {
		return real_price;
	}

	public int getTotal_sales() {
		return total_sales;
	}

	public void initSaleTotal() {
		this.real_price = (int) ((this.sell_price * (100 - this.discount)) / 100);
		this.total_sales = this.real_price * this.sales;
	}

	@Override
	public String toString() {
		return "CartDTO [cart_no=" + cart_no + ", product_no=" + product_no + ", member_id=" + member_id + ", sales="
				+ sales + ", product_name=" + product_name + ", sell_price=" + sell_price + ", discount=" + discount
				+ ", real_price=" + real_price + ", total_sales=" + total_sales + "]";
	}

}
