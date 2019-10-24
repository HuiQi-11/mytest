package com.elieli.springbootdemo3.dao;


import com.elieli.springbootdemo3.eneity.User;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;


/**
 * @Author: huiqi
 * @CreateTime: 2019-10-24 15:20
 */
@Repository
@Mapper
public interface UserDao {
    /**
     * 查询用户名是否存在，若存在，不允许注册
     * 注解@Param(value) 若value与可变参数相同，注解可省略
     * 注解@Results  列名和字段名相同，注解可省略
     */
    @Select(value = "select u.username,u.password from users u where u.username=#{username}")
    @Results
            ({@Result(property = "username", column = "username"),
                    @Result(property = "password", column = "password")})
    User findUserByName(@Param("username") String username);

    //注册
    @Insert("insert into users values(#{id},#{username},#{password})")
    //加入该注解可以保存对象后，查看对象插入id
    //@Options(useGeneratedKeys = true, keyProperty = "id",keyColumn="id")
    @Options(useGeneratedKeys = true,keyProperty = "id",keyColumn = "id")
    void regist(User user);

    //登录
    @Select("select u.id from users u where u.username = #{username} and password = #{password}")
    Long login(User user);

}
