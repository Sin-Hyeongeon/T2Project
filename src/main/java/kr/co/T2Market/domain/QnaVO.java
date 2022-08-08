package kr.co.T2Market.domain;

import java.sql.Date;

import lombok.Data;

@Data
public class QnaVO {
	
	// 글 번호 
	private String Qna_no;
	
	// 회원 아이디 
	private String member_id;
	
	// 제목 
	private String title;
	
	// 내용 
	private String content;
	
	// 작성일 
	private Date regdate;
	
	// 수정일 
	private Date updatedate;
	
}
