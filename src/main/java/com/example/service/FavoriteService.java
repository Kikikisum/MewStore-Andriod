package com.example.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.example.entity.Favorite;

public interface FavoriteService extends IService<Favorite> {
    public int InsertFavorite(Favorite favorite);
}
