package com.example.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.example.Entity.Message;

public interface MessageService extends IService<Message> {

    public int InsertMessage(Message message);
    public Message getMessage(Long id);
}
