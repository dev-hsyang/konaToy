package com.konai.hsyang.konatoy.login.repository;

import com.konai.hsyang.konatoy.login.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {

    Optional<User> findByUsername(String name);
    Optional<User> findByNickname(String nickname);
//    @Query("SELECT u FROM User u WHERE u.userID = :userID")
//    Optional<User> findById(@Param("userID")Long id);
}
