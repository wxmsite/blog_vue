package com.whh.blog.Mapper;
import com.whh.blog.model.Blog;
import com.whh.blog.model.BlogDetail;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
/**
 * author bebetter159
 */
@Mapper
public interface BlogMapper {
    List<Blog> getAllBlog();
    boolean savePersonalBlog(BlogDetail blogDetail);
    int getCount();
    BlogDetail getPersonalBlog(String blogUrl);
    List<BlogDetail>getAllPersonalBlog(@Param("startOffset") int startOffset, @Param("pageSize") int pageSize);
    List<BlogDetail>getBlogTitle();




}
