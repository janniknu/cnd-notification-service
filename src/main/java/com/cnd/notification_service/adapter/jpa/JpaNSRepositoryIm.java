package com.cnd.notification_service.adapter.jpa;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.cnd.notification_service.adapter.jpa.entities.NotificationEntity;
import com.cnd.notification_service.domain.models.Notification;
import com.cnd.notification_service.ports.outgoing.NSRepository;

@Service
public class JpaNSRepositoryIm implements NSRepository {

    private final JpaNSRepository repo;

    public JpaNSRepositoryIm(JpaNSRepository repo) {
        this.repo = repo;
    }

    @Override
    public List<Notification> findByUser(String username) {
        return repo.findByUsername(username).stream()
                .map(entity -> new Notification(entity.getId(), entity.getUsername(), entity.getTitle(), entity.getMessage()))
                .collect(Collectors.toList());
    }

    @Override
    public void save(Notification notification) {
        NotificationEntity entity = new NotificationEntity(notification.getUser(), notification.getTitle(), notification.getMessage());
        repo.save(entity);
    }

}

