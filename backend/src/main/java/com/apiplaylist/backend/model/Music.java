package com.apiplaylist.backend.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity 
//Indica para o JPA que isso é uma tabela
@Table(name ="musics") 
//define o nome da tabela
public class Music {
    @Id 
    //id serve para definir como chave primaria
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    //@Generated com IDENTITY indica geração de valor do tipo identidade
    private Long id;

    @Column (nullable = false, length = 150)
    //Indica ao banco que é uma coluna
    private String title;

    @Column (nullable = false, length = 100)
    private String artist;

    @Column (length = 100)
    private String album;

    @Column (length = 20)
    private double duration;

    @Column (nullable =  false)
    private Boolean favorite;

    //PERGUNTAR PARA O MATEUS   
    public Music() {}
    
    //getters e setters

    public Music(String title, String artist, String album, double duration, Boolean favorite) {
        this.title = title;
        this.artist = artist;
        this.album = album;
        this.duration = duration;
        this.favorite = favorite;
    }



    public Music(String title2, String artist2, String album2, double duration2, int quantity, Boolean favorite2) {
        //TODO Auto-generated constructor stub
    }

    public Long getId() {
        return id;
    }
    public String getAlbum() {
        return album;
    }
    public double getDuration() {
        return duration;
    }
    public Boolean getFavorite() {
        return favorite;
    }
    public String getArtist() {
        return artist;
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
    public void setSinger(String artist) {
        this.artist = artist;
    }
    public void setTitle(String title) {
        this.title = title;
    }

    @Override 
    public String toString() {
        return "Musica [id=" + id + ", title=" + title + ", artist=" + artist + ", album=" + album + ", duration="
                + duration + ", favorite=" + favorite + "]";
    }

    public int getQuantity() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getQuantity'");
    }
}

