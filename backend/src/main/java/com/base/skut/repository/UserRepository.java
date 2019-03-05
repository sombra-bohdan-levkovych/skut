package com.base.skut.repository;

import com.base.skut.entity.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.RepositoryDefinition;
import org.springframework.stereotype.Repository;

import java.util.Set;

@Repository
//@RepositoryDefinition(domainClass = User.class, idClass = Long.class)
public interface UserRepository extends CrudRepository<User, Long> {
    User getUserById(final Long userId);
    Set<User> findAll();
    User getUserByEmail(final String email);
}
