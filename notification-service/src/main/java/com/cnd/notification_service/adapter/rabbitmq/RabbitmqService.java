package com.cnd.notification_service.adapter.rabbitmq;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Service;
import com.cnd.notification_service.domain.NSService;
import com.cnd.notification_service.domain.models.Notification;

@Service
public class RabbitmqService {
    private final NSService nsService;

    public RabbitmqService(NSService nsService) {
        this.nsService = nsService;
    }

    @RabbitListener(queues = "notificationQueue")
    public void receiveMessage(Notification notification) {
        nsService.saveNotification(notification);
    }
}