package com.example.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.example.entity.Freeze;

public interface FreezeService extends IService<Freeze> {
    public int InsertFreeze(Freeze freeze);
    public Freeze queryById(Long id);
}
