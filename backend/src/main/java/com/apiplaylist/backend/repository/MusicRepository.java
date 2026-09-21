package com.apiplaylist.backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.apiplaylist.backend.model.Music;

@Repository 
public interface MusicRepository extends JpaRepository<Music, Long>    {
    
}