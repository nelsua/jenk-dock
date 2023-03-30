package com.nelsua.security.repository;

import com.nelsua.security.entity.UserCred;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.Optional;

@Repository
public interface ValRepo extends JpaRepository<UserCred, Integer> {
    Optional<UserCred>findByEmail(String email);
}
