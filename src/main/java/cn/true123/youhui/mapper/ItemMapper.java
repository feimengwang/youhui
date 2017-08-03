package cn.true123.youhui.mapper;

import java.util.List;

import cn.true123.youhui.bean.Item;

public interface ItemMapper {
	public Item selectItem(int id);
	public void insertItem(Item item);
	public List<Item> seleteItems(int createdUserId);

}
