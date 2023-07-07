package com.example.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.example.entity.Good;

public interface GoodService extends IService<Good> {
    public Good queryById(Long id);
}
