package com.sinosoft.thymService;

import com.sinosoft.thymDao.ScoreDao;
import com.sinosoft.thymDao.TestThymeleafDao;
import com.sinosoft.thymDto.ScoreDto;
import com.sinosoft.thymDto.TestThymeleafDto;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;


@Service
public class TestThymeleafServiceImpl implements TestThymeleafService{

   @Resource
   private TestThymeleafDao testThymeleafDao;

   @Resource
   private ScoreDao scoreDao;

   public TestThymeleafDto findUser(String id){
      TestThymeleafDto testThymeleafDto = new TestThymeleafDto();
      testThymeleafDto = testThymeleafDao.findUser(id);
      return testThymeleafDto;
   }

   @Override
   public ScoreDto findScore(String userName, String pwd) {
      ScoreDto scoreDto = new ScoreDto();
      scoreDto = scoreDao.findByUserNameAndPwd(userName,pwd);
      return scoreDto;
   }
}
