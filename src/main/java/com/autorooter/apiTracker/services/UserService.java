package com.autorooter.apiTracker.services;

import com.autorooter.apiTracker.domain.User;

public interface UserService {
    // two usecases: - Validate user Data. - Register new user.

     User validateUser(String email, String password) throws EtAuthException;

     User registerUser(String firstName, String lastName, String email, String password) throws EtAuthException;
}
