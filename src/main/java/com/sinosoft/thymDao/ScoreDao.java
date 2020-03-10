package com.sinosoft.thymDao;

import com.sinosoft.thymDto.ScoreDto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;


public interface ScoreDao extends JpaRepository<ScoreDto,String>{


    ScoreDto findByUserNameAndPwd(@Param("username") String userName,@Param("pwd") String pwd);



}
