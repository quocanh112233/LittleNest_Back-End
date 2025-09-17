package com.quocanh.littlenest.Service.Banner;

import com.quocanh.littlenest.Entity.Banner;
import com.quocanh.littlenest.Repository.BannerRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class BannerServiceImpl implements BannerService {
    private final BannerRepository bannerRepository;

    @Override
    public List<Banner> getAll() {
        return bannerRepository.findAll();
    }

    @Override
    public Banner getById(Long id) {
        return bannerRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Banner not found"));
    }

    @Override
    public Banner create(Banner banner) {
        return bannerRepository.save(banner);
    }

    @Override
    public Banner update(Long id, Banner banner) {
        Banner existing = getById(id);
        existing.setTitle(banner.getTitle());
        existing.setImageUrl(banner.getImageUrl());
        return bannerRepository.save(existing);
    }

    @Override
    public void delete(Long id) {
        bannerRepository.deleteById(id);
    }

    @Override
    public List<Banner> searchByTitle(String keyword) {
        return bannerRepository.findByTitleContainingIgnoreCase(keyword);
    }
}
