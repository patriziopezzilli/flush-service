package com.flush.flushservice.web;

import com.flush.flushservice.model.TableDTO;
import com.flush.flushservice.service.TableService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TableController {

    @Autowired
    private TableService service;

    @GetMapping("/flush/api/v1/table/join")
    public TableDTO join(@RequestParam String inviteCode) {
        return service.join(inviteCode);
    }

    @GetMapping("/flush/api/v1/table/{userId}")
    public TableDTO get(@PathVariable String userId) {
        return service.getTable(userId);
    }

    @GetMapping("/flush/api/v1/table")
    public TableDTO mark(@RequestParam(required = false) String tableId, @RequestParam(required = false) String userId) {
        return service.markPaied(tableId, userId);
    }
}
