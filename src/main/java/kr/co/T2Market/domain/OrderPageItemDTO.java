package kr.co.T2Market.domain;

import java.util.List;

public class OrderPageItemDTO {

	// 상품 번호
	private String product_no;
	
	// 상품 개수
	private int sales;

	// 상품명
	private String product_name;

	// 상품 단가
	private int sell_price;

	// 할인률
	private int discount;

	// 판매가
	private int real_price;

	// 총 판매가
	private int total_sales;

	public String getProduct_no() {
		return product_no;
	}

	public void setProduct_no(String product_no) {
		this.product_no = product_no;
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

	public void setReal_price(int real_price) {
		this.real_price = real_price;
	}

	public int getTotal_sales() {
		return total_sales;
	}

	public void setTotal_sales(int total_sales) {
		this.total_sales = total_sales;
	}

	public void initSaleTotal() {
		this.real_price = (int) ((this.sell_price * (100 - this.discount)) / 100);
		this.total_sales = this.real_price * this.sales;
	}

	@Override
	public String toString() {
		return "OrderPageItemDTO [product_no=" + product_no + ", sales=" + sales + ", product_name=" + product_name
				+ ", sell_price=" + sell_price + ", discount=" + discount + ", real_price=" + real_price
				+ ", total_sales=" + total_sales + "]";
	}

}
