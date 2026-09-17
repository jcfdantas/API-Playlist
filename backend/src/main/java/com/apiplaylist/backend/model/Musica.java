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
}

