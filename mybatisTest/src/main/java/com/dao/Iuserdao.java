package com.dao;
import com.domain.User;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * 　　* @description: TODO
 * 　　* @param ${tags}
 * 　　* @return ${return_type}
 * 　　* @throws
 * 　　* @author yangtao
 * 　　* @date $date$ $time$
 *
 */
public interface Iuserdao {
//
//    @Select("select * from tb_user")
    List <User> findAll();

//    @Select("select * from tb_user where id=1")
    User  findone(int id);


    void save(User user);

    void update(User user);


    void delete(String  id) ;

    User findById(String id );

    List <User>  findByName( String name);

    int findCount();




}
