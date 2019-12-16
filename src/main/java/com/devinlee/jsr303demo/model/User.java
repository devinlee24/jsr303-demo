package com.devinlee.jsr303demo.model;

import lombok.Data;
import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Data
public class User {

    @NotNull(message = "id不能为空")
    private Long id;

    @Size(max = 5,min = 2,message = "姓名长度不正确")
    private String name;

}