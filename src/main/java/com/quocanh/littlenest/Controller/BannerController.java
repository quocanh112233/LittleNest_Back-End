package com.quocanh.littlenest.Controller;

import com.quocanh.littlenest.Entity.Banner;
import com.quocanh.littlenest.Service.Banner.BannerService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/banners")
@RequiredArgsConstructor
public class BannerController {
    private final BannerService bannerService;

    @GetMapping
    public List<Banner> getAll() {
        return bannerService.getAll();
    }

    @GetMapping("/{id}")
    public Banner getById(@PathVariable Long id) {
        return bannerService.getById(id);
    }

    @PostMapping
    public Banner create(@RequestBody Banner banner) {
        return bannerService.create(banner);
    }

    @PutMapping("/{id}")
    public Banner update(@PathVariable Long id, @RequestBody Banner banner) {
        return bannerService.update(id, banner);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        bannerService.delete(id);
    }

    @GetMapping("/search")
    public List<Banner> search(@RequestParam String keyword) {
        return bannerService.searchByTitle(keyword);
    }
}
