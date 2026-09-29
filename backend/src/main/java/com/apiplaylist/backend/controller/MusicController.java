package com.apiplaylist.backend.controller;

import com.apiplaylist.backend.dto.MusicDTO;
import com.apiplaylist.backend.model.Music;
import com.apiplaylist.backend.service.MusicService;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import io.swagger.v3.oas.annotations.tags.Tag;

import java.util.List;
import java.util.Optional;


@RestController
@RequestMapping("apiplaylist/music")
@Tag(name = "Music", description = "Music API")
public class MusicController {
    private final MusicService musicService;

    public MusicController(MusicService musicService) {
        this.musicService = musicService;
    }

    @GetMapping
    public ResponseEntity<List<Music>> getAllMusics(){
        List<Music> musics = musicService.getAllMusics();
        return ResponseEntity.ok(musics);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Music> getMusicById(@PathVariable Long id){
        Music music = musicService.getMusicById(id);
        return ResponseEntity.ok(music);
    }

    @PostMapping
    public ResponseEntity<Music> createMusic(@Valid @RequestBody Music music){
        MusicDTO createdMusic = musicService.createMusic(music);
        return ResponseEntity.status(201).body(createdMusic);
    }


    @PutMapping("/{id}")
    public ResponseEntity<MusicDTO> updateMusic(@PathVariable Long id, @Valid @RequestBody Music music){
        Optional<MusicDTO> updateMusic = musicService.updateMusic(id, music);
        return updateMusic.map(ResponseEntity::ok).orElse(ResponseEntity.notFound().build());
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteMusic(@PathVariable Long id){
        boolean deleted = musicService.deleteMusic(id);
        return deleted ? ResponseEntity.noContent().build() : ResponseEntity.notFound().build();
    }

    @PatchMapping("/{id}/favorite")
    public ResponseEntity<MusicDTO> toggleFavorite(@PathVariable Long id){
        Optional<MusicDTO> updatedMusic = musicService.toggleFavorite(id);
        return updatedMusic.map(ResponseEntity::ok).orElse(ResponseEntity.notFound().build());
    }
}
