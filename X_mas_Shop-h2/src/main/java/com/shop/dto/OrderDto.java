package com.shop.dto;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class OrderDto {
	
	@NotNull(message = "상품 아이디는 필수 입력 사항입니다.")
	private Long itemId;	//상품 아이디
	
	@Min(value = 1, message = "최소 주문 수량은 1개입니다")
	@Max(value = 999, message ="최대 주문 가능 수량은 999개 입니다.")
	private int count;
}
