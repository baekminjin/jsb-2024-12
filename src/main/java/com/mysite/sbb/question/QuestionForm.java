package com.mysite.sbb.question;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;

import lombok.Getter;
import lombok.Setter;

@Getter //반환
@Setter //설정(수정)
public class QuestionForm {
	@NotEmpty(message="제목은 필수항목입니다.") //해당 값이 Null 또는 빈 문자열("")을 허용하지 않음 / 오류메시지
	@Size(max=200)
	private String subject;

	@NotEmpty(message="내용은 필수항목입니다.")
	private String content;
}
