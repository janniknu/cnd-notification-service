package com.cnd.collection_service.services;

import com.cnd.collection_service.models.Collection;
import com.cnd.collection_service.repository.CSRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CSService {

    private final CSRepository collectionRepository;

    public CSService(CSRepository collectionRepository) {
        this.collectionRepository = collectionRepository;
    }

    public List<Collection> getAllCollections() {
        return collectionRepository.findAll();
    }

    public Collection getCollectionById(Long id) {
        return collectionRepository.findById(id).orElse(null);
    }

    public Collection createCollection(Collection collection) {
        return collectionRepository.save(collection);
    }

    public Collection updateCollection(Long id, Collection collection) {
        Collection existingCollection = collectionRepository.findById(id).orElse(null);
        if (existingCollection != null) {
            existingCollection.setName(collection.getName());
            // Update other fields as necessary
            return collectionRepository.save(existingCollection);
        }
        return null;
    }

    public void deleteCollection(Long id) {
        collectionRepository.deleteById(id);
    }
}