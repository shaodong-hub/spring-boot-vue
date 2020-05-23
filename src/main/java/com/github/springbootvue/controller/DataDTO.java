package com.github.springbootvue.controller;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.util.Date;

/**
 * <p>
 * 创建时间为 下午10:13 2019/11/13
 * 项目名称 spring-boot-vue
 * </p>
 *
 * @author 石少东
 * @version 0.0.1
 * @since 0.0.1
 */

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class DataDTO {

    private String id;

    private String name;

    private Date date;
}
