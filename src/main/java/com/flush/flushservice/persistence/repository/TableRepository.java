package com.flush.flushservice.persistence.repository;

import com.flush.flushservice.persistence.entity.TableEntity;
import com.flush.flushservice.persistence.entity.UserEntity;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface TableRepository extends MongoRepository<TableEntity, String> {

    @Query("{id:'?0'}")
    UserEntity findItemById(String id);

    public long count();

}