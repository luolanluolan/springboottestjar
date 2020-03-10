package com.sinosoft.thymController;

import com.sinosoft.thymDto.ScoreDto;
import com.sinosoft.thymDto.TestThymeleafDto;
import com.sinosoft.thymService.TestThymeleafService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.io.*;
@Controller
public class TestThymeleafController {
    private Logger logger = LoggerFactory.getLogger(TestThymeleafController.class);

    @Resource
    private TestThymeleafService testThymeleafService;

    //登录
    @RequestMapping("/login")
    public String login(String userName , String pwd ){
        TestThymeleafDto testThymeleafDto = testThymeleafService.findUser(userName);
        String message = "用户不存在";
        if(testThymeleafDto!=null && !"".equals(testThymeleafDto)){
            if(!pwd.equals(testThymeleafDto.getPwd())){
                message = "密码不正确";
            }else{
                message = testThymeleafDto.getUserName()+"登录成功";
            }
        }
        logger.info(message);
        return "success";
    }

    //查询总分
    @RequestMapping("/findScore")
    public String findScore(String userName , String pwd ){
        ScoreDto scoreDto = testThymeleafService.findScore( userName, pwd);
        String message = "请检查学号、用户名、密码";
        if(scoreDto!=null && !"".equals(scoreDto)){
            message = scoreDto.getUserName()+"的成绩总分为："+scoreDto.getScore();
        }
        logger.info(message);
        return "success";
    }

    @ResponseBody
    @RequestMapping("/getPath")
    public String getPath(){
        String path = "template/filedir/abc.txt";
        BufferedReader br = null;
//        String path1 = "\\src\\main\\resources\\template\\filedir\\abc.txt";
        try {
            InputStream in = TestThymeleafController.class.getClassLoader().getResourceAsStream(path);//new FileInputStream(path) ;
            br = new BufferedReader(new InputStreamReader(in));
//            FileReader fileReader = new FileReader(new File(path1));
            String line ="";
            System.out.println("-----------------------------------");
            while ((line = br.readLine()) !=null) {
                System.out.println(line);
            }
            br.close();
            System.out.println("-----------------------------------");
        } catch (Exception e) {
        }
        return "123";
    }
}
