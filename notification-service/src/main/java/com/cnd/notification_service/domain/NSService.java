package com.cnd.notification_service.domain;

import com.cnd.notification_service.domain.models.Notification;

import java.util.List;

public interface NSService {
    List<Notification> getAllCollections();
    /*
    Collection getCollectionById(Long id);
    Collection createCollection(Collection collection);
    Collection updateCollection(Long id, Collection collection);
    void deleteCollection(Long id);
    Collection addRecipe(Long collectionId, Recipe recipe);
    Collection removeRecipe(Long collectionId, Recipe recipe);

     */
}
