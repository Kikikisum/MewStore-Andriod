package com.example.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.entity.Favorite;
import com.example.mapper.FavoriteMapper;
import com.example.service.FavoriteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FavoriteServiceImpl extends ServiceImpl<FavoriteMapper, Favorite> implements FavoriteService{
    @Autowired
    FavoriteMapper favoriteMapper;

    @Override
    public int InsertFavorite(Favorite favorite)
    {
        return favoriteMapper.insert(favorite);
    }

}
