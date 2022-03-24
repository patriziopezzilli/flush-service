package com.flush.flushservice.mapper;

import com.flush.flushservice.model.TableDTO;
import com.flush.flushservice.persistence.entity.TableEntity;
import org.mapstruct.Mapper;

@Mapper
public interface TableMapper {

    TableEntity toTableEntity(TableDTO dto);

    TableDTO toTableModel(TableEntity entity);
}
