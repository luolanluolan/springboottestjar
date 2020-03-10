package com.sinosoft.thymDto;

import lombok.Data;

import java.io.Serializable;

//import javax.persistence.*;

// @Entity : 指出该Java 类为实体类，并将映射到指定数据库表
//@Entity
//@Table 实体类与其映射的数据库表名不同名时需要使用 @Table 标注说明
//@Table(name = "test_thym")
@Data
public class TestThymeleafDto implements Serializable{

   /* @Id  // 标注用于声明一个实体类的属性映射为数据库的主键列
    @Column(name = "id" ,nullable = false)  //定义数据库的列名如果与字段名一样可以省略
    @GeneratedValue(strategy= GenerationType.AUTO) //生成主键的策略AUTO自动的根据数据的类型生成主键*/
    /*
     @GeneratedValue
    IDENTITY：采用数据库 ID自增长的方式来自增主键字段，Oracle 不支持这种方式；
    AUTO： JPA自动选择合适的策略，是默认选项；
    SEQUENCE：通过序列产生主键，通过 @SequenceGenerator 注解指定序列名，MySql 不支持这种方式
    TABLE：通过表产生主键，框架借由表模拟序列产生主键，使用该策略可以使应用更易于数据库移植。
     */
    private String id ;

    //unique=true是指这个字段的值在这张表里不能重复，所有记录值都要唯一，就像主键那样;
    //nullable=false是这个字段在保存时必需有值，不能还是null值就调用save去保存入库;
//    @Column(name = "userName" ,nullable = false)
    private String userName;

//    @Column(name = "pwd" ,nullable = false)
    private String pwd;

//    @Transient  //表示该属性不是一个到数据库表的字段的映射,ORM框架将忽略该属性.
//    @Column(name = "isNew" )
    private String isNew;

    public TestThymeleafDto() {
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

    public String getIsNew() {
        return isNew;
    }

    public void setIsNew(String isNew) {
        this.isNew = isNew;
    }
}
