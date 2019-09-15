package com.domain;

import java.io.Serializable;
import java.util.Date;

/**
 * 　　* @description: TODO
 * 　　* @param ${tags}
 * 　　* @return ${return_type}
 * 　　* @throws
 * 　　* @author yangtao
 * 　　* @date $date$ $time$
 *
 */
public class User  implements Serializable {

    private String  id;
    private String  user_name;
    private String  password;
    private String  name;
    private Integer age;
    private Integer sex;
    private String created;
    private Date   birthday;
    private String updated;



    public String getId() {
        return id;
    }

    public void setId( String id ) {
        this.id = id;
    }

    public String getUser_name() {
        return user_name;
    }

    public void setUser_name( String user_name ) {
        this.user_name = user_name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword( String password ) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName( String name ) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge( Integer age ) {
        this.age = age;
    }

    public Integer getSex() {
        return sex;
    }

    public void setSex( Integer sex ) {
        this.sex = sex;
    }

    public String getCreated() {
        return created;
    }

    public void setCreated( String created ) {
        this.created = created;
    }


    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday( Date birthday ) {
        this.birthday = birthday;
    }

    public String getUpdated() {
        return updated;
    }

    public void setUpdated( String updated ) {
        this.updated = updated;
    }

    @Override
    public String toString() {
        return "User{" +
                "id='" + id + '\'' +
                ", user_name='" + user_name + '\'' +
                ", password='" + password + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", sex=" + sex +
                ", created='" + created + '\'' +
                ", birthdday=" + birthday +
                ", updated='" + updated + '\'' +
                '}';
    }
}
