package com.cnd.notification_service.ports.outgoing;

import java.util.List;

import com.cnd.notification_service.domain.models.Notification;

public interface NSRepository {
    List<Notification> findByUser(String user);
    void save(Notification notification);
}
