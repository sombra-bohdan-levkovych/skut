package com.base.skut.repository;

import com.base.skut.entity.MagicLink;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.RepositoryDefinition;

@RepositoryDefinition(domainClass = MagicLink.class, idClass = Long.class)
public interface MagicLinkRepository extends CrudRepository<MagicLink,Long> {

}