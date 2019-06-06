package com.whh.blog.controller;

import com.whh.blog.model.BlogDetail;
import com.whh.blog.service.BlogService;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * author bebetter159
 */
@Controller
@RequestMapping("/blog")
public class BlogController {
@Autowired
    BlogService blogService;

    @RequestMapping("/edit")
    public String edit() {
        return "blog";
    }
    @ResponseBody
    @RequestMapping("/save")

    public String save(@Param("title")String title, @Param("content")String content) {


        BlogDetail blogDetail=new BlogDetail(title,content,
                new SimpleDateFormat("yyyy-MM-dd").format(new Date()),0,0);
        blogService.savePersonalBlog(blogDetail);
        return "200";
    }
    @RequestMapping("/detail/{blogID}")
    public String detail(Model model, @PathVariable String blogID){
        BlogDetail blogDetail=blogService.getPersonalBlog(blogID);

        model.addAttribute("blog",blogDetail);

        return "blogDetail";
    }
    @RequestMapping("/comment")
    public void comment(){

    }

}
