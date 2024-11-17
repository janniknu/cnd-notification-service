package com.cnd.notification_service.adapter.api;


import com.cnd.notification_service.domain.NSService;
import com.cnd.notification_service.domain.models.Notification;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RequestMapping("/notifications")
@RestController
public class NSController {

    private final NSService nsService;

    public NSController(NSService nsService) {
        this.nsService = nsService;
    }

    @GetMapping
    public ResponseEntity<List<Notification>> getNotifications(@RequestParam String username) {
        return new ResponseEntity<>(nsService.getNotifications(username), HttpStatus.OK);
    }
}