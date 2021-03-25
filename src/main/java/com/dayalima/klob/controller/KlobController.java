package com.dayalima.klob.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.web.PageableDefault;
import org.springframework.data.web.SortDefault;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dayalima.klob.model.Category;
import com.dayalima.klob.model.KlobInfo;
import com.dayalima.klob.response.BaseResponse;
import com.dayalima.klob.response.KlobResponse;
import com.dayalima.klob.service.KlobService;

@RestController
@RequestMapping("/api/klob")
public class KlobController {
    
    @Autowired
    KlobService klobService;
    
    @GetMapping(value = "/get-categories")
    public ResponseEntity<?> getCategories() {
        return ResponseEntity.ok(new BaseResponse<List<Category>>(klobService.getCategories()));
    }
    
    @GetMapping
    public ResponseEntity<?> getList(HttpServletRequest request,
            @PageableDefault(page = 0, size = 20) @SortDefault.SortDefaults({
                    @SortDefault(sort = "updatedAt", direction = Sort.Direction.DESC)
                    }) Pageable pageable) {

        return ResponseEntity.ok(new BaseResponse<KlobResponse>(klobService.getAllKlob(pageable)));
    }
    
    @GetMapping(value = "/detail/{id}")
    public ResponseEntity<?> getList(@PathVariable Long id) {

        return ResponseEntity.ok(new BaseResponse<KlobInfo>(klobService.getKlobDetail(id)));
    }

}
