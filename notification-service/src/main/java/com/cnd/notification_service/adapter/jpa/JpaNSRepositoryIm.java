package com.cnd.notification_service.adapter.jpa;

import org.springframework.stereotype.Service;

import com.cnd.notification_service.ports.outgoing.NSRepository;

@Service
public class JpaNSRepositoryIm implements NSRepository {

    private final JpaNSRepository repo;

    public JpaNSRepositoryIm(JpaNSRepository repo) {
        this.repo = repo;
    }

}

