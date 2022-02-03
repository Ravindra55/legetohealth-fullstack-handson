package com.legatohealth.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.legatohealth.beans.User;

public interface UserDao extends JpaRepository<User,Integer> {
//	public void deleteByName(String Name);

}
/* it dont have implementation, it is done by spring data
 * now all methods of jparepository would work on users table & get primery key int type
 */
