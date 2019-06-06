package com.whh.blog.service;

import com.whh.blog.model.Blog;
import com.whh.blog.model.BlogDetail;

import java.util.List;

/**
 * author bebetter159
 * date  2018/5/27 17:46
 */
public interface BlogService {


    List<Blog> getAllExpertblog();
    boolean savePersonalBlog(BlogDetail blogDetail);
    int getCount();
    BlogDetail getPersonalBlog(String blogUrl);
    List<BlogDetail>getAllPersonalBlog(int pn,int pageSize);
    List<BlogDetail>getBlogTitle();

}
