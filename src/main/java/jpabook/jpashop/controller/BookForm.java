package jpabook.jpashop.controller;

import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotEmpty;

@Getter @Setter
public class BookForm {
    @NotEmpty(message = "상품 이름은 필수 입니다")
    private String name;
    private Long id;
    private int price;
    private int stockQuantity;
    private String author;
    private String isbn;


}
