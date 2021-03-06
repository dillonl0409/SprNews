package com.java_ssm.mapper;

import com.java_ssm.entity.News;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface NewsMapper {
    @Insert("insert into `news` (`id`,`title`,`image`,`desct`,`url`,`create_time`,`content`) values (#{id},#{title},#{image},#{desct},#{url},#{create_time},#{content})")
    public Boolean addNews(News news);

    @Delete("delete from news where id = #{id}")
    public Boolean delNews(String id);

    @Update("update news set title=#{title}, image=#{image}, desct=#{desct}, url=#{url}, content=#{content} where id = #{id}")
    public Boolean editNews(News news);

    @Select("select * from news")
    public List<News> findNews();

    @Select("select * from news where id = #{id}")
    public News findOneNews(String id);

}
