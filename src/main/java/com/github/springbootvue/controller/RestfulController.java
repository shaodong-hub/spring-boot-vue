package com.github.springbootvue.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.PostConstruct;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * 创建时间为 下午10:12 2019/11/13
 * 项目名称 spring-boot-vue
 * </p>
 *
 * @author 石少东
 * @version 0.0.1
 * @since 0.0.1
 */

@CrossOrigin
@RestController
public class RestfulController {

    private Map<String, DataDTO> hashMap = new HashMap<>();

    @GetMapping("data")
    public Map<String, DataDTO> findAll() {
        return hashMap;
    }

    @PostMapping("data")
    public DataDTO save(@RequestBody DataDTO dto) {
        hashMap.put(dto.getId(), dto);
        return dto;
    }

    @DeleteMapping("data/{id}")
    public void delete(@PathVariable String id) {
        hashMap.remove(id);
    }

    @PostConstruct
    public void init() {
        hashMap.put("1", new DataDTO("1", "name1", new Date()));
        hashMap.put("2", new DataDTO("2", "name2", new Date()));
        hashMap.put("3", new DataDTO("3", "name3", new Date()));
    }


}
