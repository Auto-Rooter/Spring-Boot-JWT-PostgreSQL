package com.autorooter.apiTracker.repositories;

import com.autorooter.apiTracker.domain.User;
import com.autorooter.apiTracker.exceptions.EtAuthException;

public interface UserRepository {

    Integer create(String firstName, String lastName, String email, String password) throws EtAuthException;

    User findByEmailAndPassword(String email, String password) throws EtAuthException;

    Integer getCountByEmail(String email);

    User findById(Integer userId);
}
