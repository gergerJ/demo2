package com.example.demo.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.Arrays;
import java.util.StringJoiner;
import java.util.stream.Collectors;

@Controller
@Slf4j
public class DemoController {

    //@RequestMapping(value = "/demo" , method = RequestMethod.GET)
    @GetMapping(value = "/demo")
    public ModelAndView demo(ModelAndView mv, String id){
        log.info("?????????????????????1234555");

        String name = "";
        if(id.equals("liu")){
            name = "김연우";
        }else if(id.equals("2")){
            name = "뽀삐";
        }else{
            name = "밍키";
        }

        String aaa = "[김연우,";
        aaa +="이재성,";
        aaa +="조한영,";
        aaa +="허희진]";

        new StringBuffer().append("[")  // 각 메소드별 synchronized keyword 가 존재하고 멀티 스레드 상태에서 동기화를 지원
                .append("김연우")
                .append(",")
                .append("이재성")
                .append(",")
                .append("조한영")
                .append(",")
                .append("허희진")
                .append("]");

        new StringBuilder() // 단일 Thread 환경에서만 사용하도록 설계!!-> 속도는 Buffer보다 빠르지만, 언제 멀티가 필요할지 모름!
                .append("[")
                .append("김연우,")
                .append("이재성,")
                .append("조한영,")
                .append("허희진")
                .append("]");

        new StringJoiner(",","[","]")
                .add("김연우")
                .add("이재성")
                .add("조한영")
                .add("허희진");

        log.info("name:::{}", name);
        log.info("name:::" + name + "+ id ::::"+aaa);
        log.info("name:::{}, id ::::{}", name, aaa);

        mv.addObject("id", id);
        mv.addObject("name", name);
        mv.setViewName("test.html");
        return mv;
    }
}
