package com.apiplaylist.backend.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Positive;
import jakarta.validation.constraints.PositiveOrZero;
import jakarta.validation.constraints.Size;

//Schema documenta essa classe na interface Swagger
@Schema(description = "Music data transfer object")
public class MusicDTO {

    //READ_ONLY indica ao Swagger que o cliente nao envia o id, apenas recebe
    @Schema(description = "Unifique identifier of the Music", example = "1", accessMode = Schema.AccessMode.READ_ONLY)
    private Long id;

    @NotBlank(message = "Title is required")
    @Size(min = 2, max = 150, message = "Title must be between 2 and 150 characters")
    @Schema(description = "Title of the music", example = "Samurai")
    private String title;

    @NotBlank(message = "The artist name is required")
    @Size(max = 100, message = "Artist name must not exeed 100 characters")
    @Schema(description = "Artist name", example = "Djavan")
    private String artist;

    @NotBlank(message = " Title is required")
    @Size(min = 2, max = 100, message = "Title must be between 2 and 100 characters")
    @Schema(description = "Title of the album", example = "Luz")
    @Positive(message = "The album needs to have songs")
    private String album;


    //Positive garante que o valor enviado seja maior que zero
    @Positive(message = "Value must be greater than zero")
    @Schema(description = "Song duration", example = "10:00")
    private double duration;

    @PositiveOrZero(message = "Quantity must be zero or greater")
    @Schema(description = "Quantity of the music", example = "10")
    private int quantity;

    @PositiveOrZero(message = "favorites")
    @Schema(description = "Favorites of the music", example = "10")
    private Boolean favorite;

    public MusicDTO(Long id, String title, String artist, String album, double value, int quantity, Boolean favorite, @Positive(message = "Value must be greater than zero") double duration) {
        this.id = id;
        this.title = title;
        this.artist = artist;
        this.album = album;
        this.duration = duration;
        this.quantity = quantity;
        this.favorite = favorite;
    }

    public MusicDTO(Long id2, String title2, String artist2, String album2, Integer duration2, int quantity2,
            Boolean favorite2) {
        
    }

    public Long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }
    
    public String getArtist() {
        return artist;
    }

    public String getAlbum() {
        return album;
    }

    public double getDuration() {
        return duration;
    }

    public int getQuantity() {
        return quantity;
    }

    public Boolean getFavorite() {
        return favorite;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public void setAlbum(String album) {
        this.album = album;
    }

    public void setValue(double duration) {
        this.duration = duration;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void setFavorite(Boolean favorite) {
        this.favorite = favorite;
    }

    





}