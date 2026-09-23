package com.apiplaylist.backend.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

//Schema documenta essa classe na interface Swagger
@Schema(description = "Music data transfer object")
public class MusicDTO {

    //READ_ONLY indica ao Swagger que o cliente nao envia o id, apenas recebe
    @Schema(description = "Unifique identifier of the Music", example = "1", accessMode = Schema.AccessMode.READ_ONLY)
    private Long id;

    @NotBlank(message = "Title is required")
    @Size(min = 2, max = 100, message = "Title must be between 2 and 100 characters")
    @Schema(description = "Title of the music", example = "Samurai")
    private String title;

    @NotBlank(message = "Description is required")
    @Size(max = 255, message = "Description must not exeed 255 characters")
    @Schema(description = "Short description of the music", example = "Samurai - Djavan")
    private String description;




}