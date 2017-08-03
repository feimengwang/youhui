package cn.true123.youhui.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import cn.true123.youhui.bean.Item;
import cn.true123.youhui.mapper.ItemMapper;

@Component
public class ItemDAO implements IItemDAO {
	@Autowired
	private SqlSession sqlSession;


	@Override
	public Item getItem(int id) {
		ItemMapper itemMapper = sqlSession.getMapper(ItemMapper.class);
		return itemMapper.selectItem(id);
	}

	@Override
	public List<Item> getItems(int createdUserId) {
		ItemMapper itemMapper = sqlSession.getMapper(ItemMapper.class);
		return itemMapper.seleteItems(createdUserId);
	}

	@Override
	public void insertItem(Item item) {
		ItemMapper itemMapper = sqlSession.getMapper(ItemMapper.class);
		itemMapper.insertItem(item);
		
	}

}
