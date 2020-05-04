package com.jumpcode.seed.system.bz.controller;

import com.jumpcode.seed.system.bz.contract.model.User;
import com.jumpcode.seed.system.bz.contract.service.UserService;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author jumpcode
 * @version V1.0
 * @date 2020/5/4 0004 17:36
 * @Description TODO
 */
@RestController
@RequestMapping(value = "/api/v1", produces = "application/json")
@Api(value = "/api/v1", description = "AppUser Api")
public class UserController {
		@Autowired
		UserService userService;
		
		@PostMapping(value = "/user/{username}")
		public ResponseEntity<User> create(@PathVariable String username) {
				//返回类型使用ResponseEntity
				return new ResponseEntity<User>(new User("1", username), HttpStatus.OK);
		}
}
