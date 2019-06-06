package com.whh.blog.Mapper;


import com.whh.blog.model.BlogUrl;
import com.whh.blog.model.ExpertUrl;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.Date;
import java.util.List;
/**
 * author bebetter159
 */
@Mapper
public interface ExpertUrlMapper {
    List<ExpertUrl> getAllExpertUrl();
    void updateBlogUrl(@Param("blogUrl")String blogUrl, @Param("title")String title,@Param("time")String time,
                       @Param("read")int read,@Param("comment")int comment);

    boolean insertExpertUrl(ExpertUrl expertUrl);
    boolean insertBlogUrl(BlogUrl blogUrl);




}
