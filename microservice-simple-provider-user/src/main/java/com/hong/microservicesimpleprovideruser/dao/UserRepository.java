package com.hong.microservicesimpleprovideruser.dao;

import com.hong.microservicesimpleprovideruser.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @Author: Seth
 * @Description:
 * @Date: Created in 15:46 2019/11/19
 */
@Repository
public interface UserRepository extends JpaRepository<User, Integer> {
    //public User findById(int id);
}
