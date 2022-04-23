package com.example.demo.dao;

import lombok.Builder;

import java.util.Objects;
import java.util.StringJoiner;

@Builder
public class ItemPO {
    public Long id;

    public String title;

    public String desc;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ItemPO itemPO = (ItemPO) o;
        return Objects.equals(id, itemPO.id) &&
                Objects.equals(title, itemPO.title) &&
                Objects.equals(desc, itemPO.desc);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, title, desc);
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", ItemPO.class.getSimpleName() + "[", "]")
                .add("id=" + id)
                .add("title='" + title + "'")
                .add("desc='" + desc + "'")
                .toString();
    }
}
