package com.example.demo.service;

import com.example.demo.dao.ItemDao;
import com.example.demo.dao.ItemPO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HelloService {

    @Autowired
    private ItemDao itemDao;

    public List<ItemPO> hello() {
        return itemDao.getItems();
    }
}
