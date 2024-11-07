package com.cnd.collection_service.services;

import com.cnd.collection_service.models.Collection;
import com.cnd.collection_service.repository.CSRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CSService {

    private final CSRepository csRepository;

    public CSService(CSRepository collectionRepository) {
        this.csRepository = collectionRepository;
    }

    public List<Collection> getAllCollections() {
        return csRepository.findAll();
    }

    public Collection getCollectionById(Long id) {
        return csRepository.findById(id).orElse(null);
    }

    public Collection createCollection(Collection collection) {

        return csRepository.save(collection);
    }

    public Collection updateCollection(Long id, Collection collection) {
        Collection existingCollection = csRepository.findById(id).orElse(null);
        if (existingCollection != null) {
            existingCollection.setName(collection.getName());
            // Update other fields as necessary
            return csRepository.save(existingCollection);
        }
        return null;
    }

    public void deleteCollection(Long id) {
        csRepository.deleteById(id);
    }
}