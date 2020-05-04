package com.jumpcode.seed.system.bz.service.repository;

import com.jumpcode.seed.system.bz.service.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author liugan83@gmail.com
 * @version V1.0
 * @date 2020/5/4 0004 17:34
 * @Description TODO
 */
@Repository
public interface UserRepository extends JpaRepository<UserEntity, String> {
}
