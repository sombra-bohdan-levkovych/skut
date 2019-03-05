package com.base.skut.repository;


import com.base.skut.entity.Project;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.RepositoryDefinition;

@RepositoryDefinition(domainClass = Project.class, idClass = Long.class)
public interface ProjectRepository extends CrudRepository<Project,Long> {

}
