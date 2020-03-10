package com.sinosoft.thymDao;

import com.sinosoft.thymDto.TestThymeleafDto;
//import org.springframework.data.jpa.repository.JpaRepository;

//public interface TestThymeleafDao extends JpaRepository<TestThymeleafDto,String> {
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

@Mapper
@Component
public interface TestThymeleafDao {

//   @Query("select u from test_thym u where u.username = ?1")
//   TestThymeleafDto findByUserName(String userName);

   TestThymeleafDto findUser(String id);
}
