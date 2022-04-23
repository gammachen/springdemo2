package com.example.demo.dao;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class ItemDao {
    public List<ItemPO> getItems() {
        ItemPO p1 = ItemPO.builder().title("t").id(2L).desc("d").build();

        List<ItemPO> list = new ArrayList<>(3);
        list.add(p1);

        return list;
    }
}
