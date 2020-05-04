package com.jumpcode.seed.system.bz.service.serviceimpl;

import com.jumpcode.seed.system.bz.contract.service.UserService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author jumpcode
 * @version V1.0
 * @date 2020/5/4 0004 17:33
 * @Description TODO
 */
@Service
@Transactional(rollbackFor = Exception.class)
public class UserServiceImpl implements UserService {
}
