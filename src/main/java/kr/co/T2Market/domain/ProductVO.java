package kr.co.T2Market.domain;

import java.util.Date;

import lombok.Data;

@Data
public class ProductVO {

	// 상품명
	private String product_no;

	// 분류 코드 1, 대분류
	private String code1;

	// 분류 코드 2, 소분류
	private String code2;

	// 상품 설명
	private String explain;

	// 상품명
	private String product_name;

	// 할인률
	private int discount;

	// 단가
	private int sell_price;

	// 판매가
	private int real_price;

	// 총 판매량
	private int total_output;

	// 총 판매가
	private int total_sales;

	// 입고량
	private int input;

	// 출고량
	private int stock;

	// 등록일
	private Date regdate;

	// 수정일
	private Date updatedate;

	// 사용유무 deafult는 Y , Y는 사용 , N은 비활성화
	private String active;
}
