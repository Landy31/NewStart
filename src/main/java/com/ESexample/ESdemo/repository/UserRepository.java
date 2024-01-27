package com.ESexample.ESdemo.repository;

import org.springframework.data.repository.CrudRepository;
import com.ESexample.ESdemo.model.User;
import org.springframework.stereotype.Repository; // добавлено
@Repository // добавлено
public interface UserRepository extends CrudRepository<User, Long> {
}
