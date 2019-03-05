package com.base.skut.repository;


import com.base.skut.entity.Permission;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.RepositoryDefinition;

@RepositoryDefinition(domainClass = Permission.class, idClass = Long.class)
public interface PermissionRepository extends CrudRepository<Permission,Long> {

}
