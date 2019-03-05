package com.base.skut.repository;

import com.base.skut.entity.Task;
import com.base.skut.entity.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.RepositoryDefinition;

@RepositoryDefinition(domainClass = Task.class, idClass = Long.class)
public interface TaskRepository extends CrudRepository<Task,Long> {

    Task getById(final Long id);
    Task getByAuthor(final User author);


}
