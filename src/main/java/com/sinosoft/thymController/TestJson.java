package com.sinosoft.thymController;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import org.json.JSONString;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @Author luolan
 * @Description TODO
 * @Date 2020/3/9 16:06
 **/


public class TestJson {

    @Test
    public void testStringToJSON(){

        //一、Json类型的字符串解析获取属性值
        String s = this.getStringJson();
        JSONObject jsonObject1 = JSON.parseObject(s);
        String user = jsonObject1.getString("user");
        String password = jsonObject1.getString("password");
        String password1 = jsonObject1.getString("password1");

        //JSON里放对象
        String jsonString = this.getObjectJson();
        List<Student> jsonObject = JSON.parseArray(jsonString, Student.class);
        for (int i = 0; i < jsonObject.size(); i++) {
            Student o = (Student)jsonObject.get(i);
            System.out.println(o);
        }
    }

    public String getStringJson(){
       Map map = new HashMap();
       map.put("user", "");
       map.put("password","ypic@123");
       String s = JSON.toJSONString(map);
        return s;
    }

    //构造对象json数据
    public String getObjectJson(){
        Student s1 = new Student("张三1","男1",11);
        Student s2 = new Student("张三2","女2",12);
        Student s3 = new Student("张三3","男3",13);
        List list = new ArrayList();
        list.add(s1);
       /* list.add(s2);
        list.add(s3);*/
        String result = JSONArray.toJSONString(list);
        return result;
    }
}
