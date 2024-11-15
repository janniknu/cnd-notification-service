package com.cnd.notification_service.adapter.jpa;

import com.cnd.notification_service.adapter.jpa.entities.NotificationEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface JpaNSRepository extends CrudRepository<NotificationEntity, Long> {
}