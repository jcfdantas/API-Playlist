package com.apiplaylist.backend.controller


@RestController
@RequestMapping("apiplaylist/music")
@Tag(name = "Music", description = "Music API")
public class MusicController {
    @GetMapping//
    public ResponseEntity<List<Music>> getAllMusics(){
        list <Music> musics = musicService.getAllMusics();
        return ResponseEntity.ok(musics);}
    
    
    @GetMapping("/{id}")
    public ResponseEntity<Music> getMusicById(PathVariable Long id){
        Music music = musicService.getMusicById(id);
        return ResponseEntity.ok(music);
    }

    @PostMapping
    public ResponseEntity<Music> createMusic(@Valid @RequestBody Music music){
        MusicDTO createdMusic = musicService.createMusic(music);
        return ResposeEntity.HttpStatus.CREATED).body(createdMusic);
    }


    @PutMapping("/{id}")
    public ResponseEntity<music> updateMusic(@PathVariablee Long id, @Valid @RequestBody Music music){
        Optional<MusicDto> updateMusic = musicService.updateMusic(Long id, music);
        return updateMusic.map(ResponseEntity::ok).orElse(ResponseEntity.notFound().build());
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteMusic(@PathVariable Long id){
        boolean deleted = musicService.deleteMusic(id);
        return deleted ? ResponseEntity.noContent().build() : ResponseEntity.notFound().build();
    }

    @PatchMapping("/{id}/favorite")
    public ResponseEntity<Music> toggleFavorite(@PathVariable Long id){
        Optional<MusicDto> updatedMusic = musicService.toggleFavorite(id);
        return updatedMusic.map(ResponseEntity::ok).orElse(ResponseEntity.notFound().build());
    }
}
