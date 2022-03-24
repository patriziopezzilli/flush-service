package com.flush.flushservice.mapper;

import com.flush.flushservice.model.UserTableDTO;
import com.flush.flushservice.persistence.entity.UserTableEntity;
import org.mapstruct.Mapper;

@Mapper
public interface UserTableMapper {

    UserTableEntity toUserTableEntity(UserTableDTO dto);
    UserTableDTO toUserTableModel(UserTableEntity entity);
}
