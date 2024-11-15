package com.cnd.notification_service.domain.models;

import lombok.*;

import java.util.List;

//lombok muss am Ende noch entfernt werden, damit model so basic wie möglich ist

@Data
@AllArgsConstructor
public class Notification {

    private Long id;
    private String name;
    private User author;
    private String description;
    private List<Recipe> recipes;
}