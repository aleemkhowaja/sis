package com.sis.repository;

import org.springframework.data.repository.Repository;
import com.sis.model.UserModel;

/**
 * @author: Alim Khowaja
 * UserRepository.java used to
 */
public interface UserRepository extends Repository<UserModel, String>
{

}
