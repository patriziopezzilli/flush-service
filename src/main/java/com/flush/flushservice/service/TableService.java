package com.flush.flushservice.service;

import com.flush.flushservice.model.TableDTO;
import com.flush.flushservice.model.UserDTO;
import com.flush.flushservice.persistence.repository.TableRepository;
import com.flush.flushservice.persistence.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TableService {

    @Autowired
    private TableRepository tableRepository;

    @Autowired
    private UserRepository userRepository;

    public TableDTO join(String inviteCode){

        return null;
    }

    public TableDTO getTable(String userId) {

        return null;
    }

    public TableDTO markPaied(String tableId, String userId) {

        return null;
    }
}
