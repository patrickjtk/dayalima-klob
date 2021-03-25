package com.dayalima.klob.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.dayalima.klob.model.KlobInfo;

@Repository
public interface KlobRepository extends JpaRepository<KlobInfo, Long> {
    
    @Query("SELECT k FROM KlobInfo k")
    Page<KlobInfo> getAllKlob(Pageable pageable);

}
