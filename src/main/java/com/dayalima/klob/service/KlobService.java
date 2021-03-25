package com.dayalima.klob.service;

import java.util.List;

import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.dayalima.klob.model.Category;
import com.dayalima.klob.model.KlobInfo;
import com.dayalima.klob.response.KlobResponse;

@Service
public interface KlobService {
    List<Category> getCategories();
    KlobResponse getAllKlob(Pageable pageable);
    KlobInfo getKlobDetail(Long id);
}
