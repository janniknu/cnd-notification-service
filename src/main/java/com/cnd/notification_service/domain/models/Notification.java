package com.cnd.notification_service.domain.models;

import lombok.*;

//lombok muss am Ende noch entfernt werden, damit model so basic wie möglich ist

@Data
@AllArgsConstructor
public class Notification {

    private Long id;
    private String user;
    private String title;
    private String message;
}