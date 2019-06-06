package com.whh.blog.service;


import com.whh.blog.model.BlogUrl;
import com.whh.blog.model.ExpertUrl;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
/**
 * author bebetter159
 */
/**
 * 管理所有博客专家的主页
 */
@Service
public interface ExpertUrlService {
     List<ExpertUrl> getAllExpertUrl();
     void updateBlogUrl(String blogUrl, String title, String time, int read, int comment);
     boolean insertExpertUrl(ExpertUrl expertUrl);
     boolean insertBlogUrl(BlogUrl blogUrl);


}
