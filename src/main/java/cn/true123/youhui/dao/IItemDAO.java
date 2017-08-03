package cn.true123.youhui.dao;

import java.util.List;

import cn.true123.youhui.bean.Item;

public interface IItemDAO {
public Item getItem(int id);
public List<Item> getItems(int createdUserId);
public void insertItem(Item item);
}
