package com.jumpcode.seed.system.bz.contract.model;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

/**
 * @author jumpcode
 * @version V1.0
 * @date 2020/5/4 0004 17:30
 * @Description User
 */
public class User {
		String id;
		
		@Size(min = 1, max = 31)
		@NotEmpty
		String name;
		
		public User(String id, String name) {
				this.id = id;
				this.name = name;
		}
		
		public String getId() {
				return id;
		}
		
		public void setId(String id) {
				this.id = id;
		}
		
		public String getName() {
				return name;
		}
		
		public void setName(String name) {
				this.name = name;
		}
		
		@Override
		public String toString() {
				return "User{" +
								"id='" + id + '\'' +
								", name='" + name + '\'' +
								'}';
		}
}
