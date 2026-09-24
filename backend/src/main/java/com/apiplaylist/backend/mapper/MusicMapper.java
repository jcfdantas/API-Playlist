package com.apiplaylist.backend.mapper;

import com.apiplaylist.backend.dto.MusicDTO;
import com.apiplaylist.backend.model.Music;

public class MusicMapper {
    
    private MusicMapper() {}
        // Construtor privado para evitar instanciação

    public static MusicDTO toDTO(Music music) {
            // Converte uma entidade Music para um DTO para ser usado na camada de apresentação (API)
         return new MusicDTO(
            music.getId(),
            music.getTitle(),
            music.getArtist(),
            music.getAlbum(),
            music.getDuration(),
            music.getQuantity(),
            music.getFavorite()
        );

    }

    public static Music toEntity(MusicDTO musicDTO) {
            // Converte um DTO para uma entidade Music para ser usado na camada de persistência (banco de dados)
            // O id não é passado, pois ele será gerado automaticamente pelo banco de dados
        return new Music(
            musicDTO.getTitle(),
            musicDTO.getArtist(),
            musicDTO.getAlbum(),
            musicDTO.getDuration(),
            musicDTO.getQuantity(),
            musicDTO.getFavorite()
        );
    }
}


