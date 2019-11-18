package com.citihacks19.townhallapp.dao;

import com.citihacks19.townhallapp.entities.UserEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;



@Repository
public interface UserDao extends CrudRepository<UserEntity, Integer> {
}
