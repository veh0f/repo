package com.amex.fde.iris.service.repository;

import org.springframework.data.repository.CrudRepository;

import com.amex.fde.iris.service.domain.User;

public interface UserRepository extends CrudRepository<User, Integer> {
    User findByName(String name);
}
