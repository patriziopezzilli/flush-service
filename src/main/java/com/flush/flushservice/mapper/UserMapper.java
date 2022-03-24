package com.flush.flushservice.mapper;

import com.flush.flushservice.model.UserDTO;
import com.flush.flushservice.persistence.entity.UserEntity;
import org.mapstruct.Mapper;

@Mapper
public interface UserMapper {

    UserEntity toUserEntity(UserDTO dto);

    UserDTO toUserModel(UserEntity entity);
}
