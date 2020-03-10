package com.sinosoft.thymService;

import com.sinosoft.thymDto.ScoreDto;
import com.sinosoft.thymDto.TestThymeleafDto;
//import org.springframework.data.jpa.repository.JpaRepository;

public interface TestThymeleafService {

   TestThymeleafDto findUser(String id);

    ScoreDto findScore(String userName, String pwd);
}
