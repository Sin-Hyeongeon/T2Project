package kr.co.T2Market.domain;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class QnaCriteria {

	// 페이지 개수
	private int pageNum;

	// 한 페이지에 들어갈 글 개수
	private int amount;

	public QnaCriteria() {
		this(1, 10);
	}

	public QnaCriteria(int pageNum, int amount) {
		this.pageNum = pageNum;
		this.amount = amount;
	}

}
