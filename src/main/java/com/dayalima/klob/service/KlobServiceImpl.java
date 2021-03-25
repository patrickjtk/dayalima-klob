package com.dayalima.klob.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.dayalima.klob.model.Category;
import com.dayalima.klob.model.KlobInfo;
import com.dayalima.klob.repository.CategoryRepository;
import com.dayalima.klob.repository.KlobRepository;
import com.dayalima.klob.response.KlobResponse;

@Service
public class KlobServiceImpl implements KlobService {
    
    @Autowired
    CategoryRepository categoryRepository;
    
    @Autowired
    KlobRepository klobRepository;

    @Override
    public List<Category> getCategories() {
        return categoryRepository.findAll();
    }
    
    @Override
    public KlobResponse getAllKlob(Pageable pageable) {
        KlobResponse response = new KlobResponse();
        Page<KlobInfo> page = klobRepository.getAllKlob(pageable);
        response.setContent(page.getContent());
        response.setPage(pageable.getPageNumber());
        response.setPageSize(pageable.getPageSize());
        response.setTotalElements(page.getTotalElements());
        response.setTotalPages(page.getTotalPages());
        return response;
    }
    
    @Override
    public KlobInfo getKlobDetail(Long id) {
        // TODO Auto-generated method stub
        return klobRepository.findById(id).orElse(null);
    }

}
