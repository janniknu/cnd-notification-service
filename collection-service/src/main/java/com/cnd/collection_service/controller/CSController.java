package com.cnd.collection_service.controller;


import com.cnd.collection_service.services.CSService;
import com.cnd.collection_service.models.Collection;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/collections")
public class CSController {

    private final CSService collectionService;

    public CSController(CSService collectionService) {
        this.collectionService = collectionService;
    }

    @GetMapping
    public List<Collection> getAllCollections() {
        return collectionService.getAllCollections();
    }

    @GetMapping("/{id}")
    public Collection getCollectionById(@PathVariable Long id) {
        return collectionService.getCollectionById(id);
    }

    @PostMapping
    public Collection createCollection(@RequestBody Collection collection) {
        return collectionService.createCollection(collection);
    }

    @PutMapping("/{id}")
    public Collection updateCollection(@PathVariable Long id, @RequestBody Collection collection) {
        return collectionService.updateCollection(id, collection);
    }

    @DeleteMapping("/{id}")
    public void deleteCollection(@PathVariable Long id) {
        collectionService.deleteCollection(id);
    }
}