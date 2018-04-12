package com.petrichor.ving.dao;

import com.petrichor.ving.domain.Album;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface AlbumRepos extends JpaRepository<Album,String>{
    Album findByAId(String AId);
    List<Album> findByAName(String AName);
    List<Album> findByUId(String UId);
    List<Album> findByATag(String ATag);
    List<Album> findByACover(String ACover);
}
