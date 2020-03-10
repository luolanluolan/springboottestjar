package com.sinosoft.thymDto;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

//import javax.persistence.*;

// @Entity : 指出该Java 类为实体类，并将映射到指定数据库表
@Entity
//@Table 实体类与其映射的数据库表名不同名时需要使用 @Table 标注说明
@Table(name = "test_thymscore")
@Data
public class ScoreDto implements Serializable{

    @Id  // 标注用于声明一个实体类的属性映射为数据库的主键列
    @Column(name = "id" ,nullable = false)  //定义数据库的列名如果与字段名一样可以省略
    private String id ;

    @Column(name = "username" ,nullable = false)
    private String userName;

    @Column(name = "pwd" ,nullable = false)
    private String pwd;

//    @Transient  //表示该属性不是一个到数据库表的字段的映射,ORM框架将忽略该属性.
    @Column(name = "score" ,nullable = false)
    private String score;

    public ScoreDto() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public String getScore() {
        return score;
    }

    public void setScore(String score) {
        this.score = score;
    }

    @Override
    public String toString() {
        return "ScoreDto{" +
                "id='" + id + '\'' +
                ", userName='" + userName + '\'' +
                ", pwd='" + pwd + '\'' +
                ", score='" + score + '\'' +
                '}';
    }
}
