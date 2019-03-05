package com.base.skut.repository;

import com.base.skut.entity.Attachment;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.RepositoryDefinition;



@RepositoryDefinition(domainClass = Attachment.class, idClass = Long.class)
public interface AttachmentRepository extends CrudRepository<Attachment,Long> {

}