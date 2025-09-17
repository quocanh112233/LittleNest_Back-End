package com.quocanh.littlenest.Service.Banner;

import com.quocanh.littlenest.Entity.Banner;

import java.util.List;

public interface BannerService {
    List<Banner> getAll();
    Banner getById(Long id);
    Banner create(Banner banner);
    Banner update(Long id, Banner banner);
    void delete(Long id);
    List<Banner> searchByTitle(String keyword);
}
