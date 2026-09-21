package com.apiplaylist.backend.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity 
//Indica para o JPA que isso é uma tabela
@Table(name ="musica") 
//define o nome da tabela
public class Musica {
    @Id 
    //id serve para definir como chave primaria
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    //@Generated com IDENTITY indica geração de valor do tipo identidade
    private Long id;

    @Column (nullable = false, length = 100)
    //Indica ao banco que é uma coluna
    private String title;

    @Column (nullable = false, length = 100)
    private String singer;

    @Column (nullable = true, length = 100)
    private String album;

    @Column (nullable = true, length = 20)
    private Integer duration;

    @Column (nullable =  false)
    private Boolean favorite;


    public Musica() {
    }
    //getters e setters

    public Musica(Long id, String title, String singer, String album, Integer duration, Boolean favorite) {
        this.id = id;
        this.title = title;
        this.singer = singer;
        this.album = album;
        this.duration = duration;
        this.favorite = favorite;
    }



    public Long getId() {
        return id;
    }
    public String getAlbum() {
        return album;
    }
    public Integer getDuration() {
        return duration;
    }
    public Boolean getFavorite() {
        return favorite;
    }
    public String getSinger() {
        return singer;
    }
    public String getTitle() {
        return title;
    }

    public void setId(Long id) {
        this.id = id;
    }
    public void setAlbum(String album) {
        this.album = album;
    }
    public void setDuration(Integer duration) {
        this.duration = duration;
    }
    public void setFavorite(Boolean favorite) {
        this.favorite = favorite;
    }
    public void setSinger(String singer) {
        this.singer = singer;
    }
    public void setTitle(String title) {
        this.title = title;
    }

    @Override 
    public String toString() {
        return "Musica [id=" + id + ", title=" + title + ", singer=" + singer + ", album=" + album + ", duration="
                + duration + ", favorite=" + favorite + "]";
    }
}

