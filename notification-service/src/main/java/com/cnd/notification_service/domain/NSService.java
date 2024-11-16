package com.cnd.notification_service.domain;

import com.cnd.notification_service.domain.models.Notification;

import java.util.List;

public interface NSService {
    List<Notification> getNotifications(String username);
    void saveNotification(Notification notification);
}
