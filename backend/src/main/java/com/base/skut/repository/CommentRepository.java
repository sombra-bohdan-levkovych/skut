package com.base.skut.repository;


import com.base.skut.entity.Comment;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.RepositoryDefinition;

@RepositoryDefinition(domainClass = Comment.class, idClass = Long.class)
public interface CommentRepository extends CrudRepository<Comment,Long> {

}
