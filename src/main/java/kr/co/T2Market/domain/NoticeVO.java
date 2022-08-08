package kr.co.T2Market.domain;

import java.sql.Date;

import lombok.Data;

@Data
public class NoticeVO {
	
	// 사용여부 
	private String active;

	// 어드민 아이디 
	private String admin_id;
	
	// 공지사항 번호 
	private String notice_no;
	
	// 제목 
	private String title;
	
	// 내용 
	private String content;
	
	// 작성일 
	private Date regdate;
	
	// 수정일 
	private Date updatedate;
}
