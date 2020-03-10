package com.sinosoft.thymController;

import com.alibaba.fastjson.JSON;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @Author luolan
 * @Description TODO
 * @Date 2020/3/10 15:58
 **/
public class TestMapTOJSON {


    @Test
    public void testMapToJson(){

        List<ProductUtil> list = new ArrayList();

        List<Student> riskDtoList = this.createStudentList(); //查询险种信息
        for(int i=0;i<riskDtoList.size();i++){
            ProductUtil productUtil = new ProductUtil();

            Student riskDto = new Student();
            riskDto = riskDtoList.get(i);
            productUtil.setRiskCode(riskDto.getName());
            productUtil.setRiskName(riskDto.getSex());

            List<Teacher> ggKindDtoList = this.createTeacherList(); //查询险种下的险别信息
            List<Map<String,String>> kindList = new  ArrayList<Map<String,String>>();
            for(int j=0;j<ggKindDtoList.size();j++){
                Map kind = new HashMap();
                Teacher ggKindDto = new Teacher();
                ggKindDto = ggKindDtoList.get(j);
                kind.put(ggKindDto.gettName(), ggKindDto.gettSex());
                kindList.add(kind);
            }
            productUtil.setKindList(kindList);

            List<Emp> ggItemDtailDtoList = this.createEmpList(); //查询险种下标的信息
            List<Map<String,String>> itemList = new  ArrayList<Map<String,String>>();
            for(int k=0;k<ggItemDtailDtoList.size();k++){
                Map item = new HashMap();
                Emp ggitemDtailDto = new Emp();
                ggitemDtailDto = ggItemDtailDtoList.get(k);
                item.put(ggitemDtailDto.geteName(), ggitemDtailDto.geteSex());
                itemList.add(item);
            }
            productUtil.setItemList(itemList);

            list.add(productUtil);
        }

        String productInfoDtoJSON = JSON.toJSONString(list);
        System.out.println(productInfoDtoJSON);
    }

    public List createStudentList(){
        List<Student> list = new ArrayList<Student>();
        Student s1 = new Student("张三1","男1");
        Student s2 = new Student("张三2","男2");
        list.add(s1);
        list.add(s2);
        return list;
    }

    public List createTeacherList(){
        List<Teacher> list = new ArrayList<Teacher>();
        Teacher s1 = new Teacher("李四1","男四1");
        Teacher s2 = new Teacher("李四2","男四2");
        list.add(s1);
        list.add(s2);
        return list;
    }

    public List createEmpList(){
        List<Emp> list = new ArrayList<Emp>();
        Emp s1 = new Emp("王五1","男五1");
        Emp s2 = new Emp("王五2","男五2");
        list.add(s1);
        list.add(s2);
        return list;
    }

}
