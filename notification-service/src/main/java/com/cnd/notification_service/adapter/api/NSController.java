package com.cnd.notification_service.adapter.api;


import com.cnd.notification_service.domain.NSService;
import com.cnd.notification_service.domain.models.Notification;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RequestMapping("/collections")
@RestController
public class NSController {

    private final NSService nsService;

    public NSController(NSService nsService) {
        this.nsService = nsService;
    }

    @GetMapping
    public ResponseEntity<List<Notification>> getAllCollections() {
        return new ResponseEntity<>(nsService.getAllCollections(), HttpStatus.OK);
    }

    /*
    @GetMapping("/{id}")
    public ResponseEntity<Collection> getCollectionById(@PathVariable Long id) {
        System.out.println(id);
        return new ResponseEntity<>(csService.getCollectionById(id), HttpStatus.OK);
    }

    @PostMapping
    public Collection createCollection(@RequestBody Collection collection) {
        System.out.println(collection);
        return csService.createCollection(collection);
    }

    @PutMapping("/{id}")
    public Collection updateCollection(@PathVariable Long id, @RequestBody Collection collection) {
        System.out.println("ID: " + id + ", Collection: " + collection);
        return csService.updateCollection(id, collection);
    }

    @DeleteMapping("/{id}")
    public void deleteCollection(@PathVariable Long id) {
        System.out.println("ID: " + id);
        csService.deleteCollection(id);
    }
    @PostMapping("/{id}/recipe")
    public Collection addRecipe(@PathVariable Long id, @RequestBody Recipe recipe) {
        return csService.addRecipe(id, recipe);
    }

    @DeleteMapping("/{id}/recipe")
    public Collection removeRecipe(@PathVariable Long id, @RequestBody Recipe recipe) {
        return csService.removeRecipe(id, recipe);
    }
    /*
     */
}