package com.dayalima.klob.response;

import java.util.List;

import com.dayalima.klob.model.KlobInfo;

public class KlobResponse {
    private Integer totalPages, page, pageSize;
    private Long totalElements;
    private List<KlobInfo> content;
    public Integer getTotalPages() {
        return totalPages;
    }
    public void setTotalPages(Integer totalPages) {
        this.totalPages = totalPages;
    }
    public Integer getPage() {
        return page;
    }
    public void setPage(Integer page) {
        this.page = page;
    }
    public Integer getPageSize() {
        return pageSize;
    }
    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }
    public Long getTotalElements() {
        return totalElements;
    }
    public void setTotalElements(Long totalElements) {
        this.totalElements = totalElements;
    }
    public List<KlobInfo> getContent() {
        return content;
    }
    public void setContent(List<KlobInfo> content) {
        this.content = content;
    }
    
    
}
