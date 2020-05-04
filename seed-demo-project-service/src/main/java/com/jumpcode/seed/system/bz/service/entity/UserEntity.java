package com.jumpcode.seed.system.bz.service.entity;

import javax.persistence.*;

/**
 * @author jumpcode
 * @version V1.0
 * @date 2020/5/4 0004 17:32
 * @Description TODO
 */
@Entity
@Table(name = "test_user", schema = "test")
public class UserEntity {
		@Id
		@GeneratedValue(strategy = GenerationType.AUTO)
		@Column(name = "id", nullable = false)
		String id;
		
		@Column(name = "username", nullable = false)
		String name;
		
		public UserEntity(String name) {
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
				return "UserEntity{" +
								"id='" + id + '\'' +
								", name='" + name + '\'' +
								'}';
		}
}
