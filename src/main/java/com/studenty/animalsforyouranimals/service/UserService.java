package com.studenty.animalsforyouranimals.service;

import com.studenty.animalsforyouranimals.model.User;

public interface UserService {
    public User findUserByEmail(String email);
    public void saveUser(User user);
}
