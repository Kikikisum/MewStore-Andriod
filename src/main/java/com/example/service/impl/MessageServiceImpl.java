package com.example.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.entity.Message;
import com.example.mapper.MessageMapper;
import com.example.service.MessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MessageServiceImpl extends ServiceImpl<MessageMapper, Message> implements MessageService {

    @Autowired
    private MessageMapper messageMapper;

    @Override
    public int InsertMessage(Message message)
    {
        return messageMapper.insert(message);
    }

    @Override
    public Message getMessage(Long id)
    {
        LambdaQueryWrapper<Message> lqw1=new LambdaQueryWrapper<Message>();
        lqw1.eq(Message::getId,id);
        Message message=messageMapper.selectOne(lqw1);
        return message;
    }

}
