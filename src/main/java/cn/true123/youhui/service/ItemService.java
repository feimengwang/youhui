package cn.true123.youhui.service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.true123.youhui.bean.Item;
import cn.true123.youhui.dao.IItemDAO;

@Service
public class ItemService implements IItemService {

	@Autowired
	private IItemDAO itemDAO;

	@Override
	public Item getItem(int id) {
		return itemDAO.getItem(id);
	}
	@Override
	public List<Item> getItems(int createdUserId) {
		return itemDAO.getItems(createdUserId);
	}
	@Override
	public void insertItem(Item item) {
		itemDAO.insertItem(item);
	}

}
