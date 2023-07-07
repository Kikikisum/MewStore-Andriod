package com.example.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.example.Entity.Favorite;

public interface FavoriteService extends IService<Favorite> {
    public int InsertFavorite(Favorite favorite);
}
