package com.apiplaylist.backend.service;

import java.security.PublicKey;

import org.springframework.stereotype.Service;


@Service 
public class MusicService {
    private final MusicRepository musicRepository;

    public MusicService(MusicRepository musicRepository) {
        this.musicRepository = musicRepository;
    }
}
