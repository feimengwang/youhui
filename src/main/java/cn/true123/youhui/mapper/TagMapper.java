package cn.true123.youhui.mapper;

import java.util.List;

import cn.true123.youhui.bean.Tag;

public interface TagMapper {
	public List<Tag> selectTag(int id);
	public void insertTag(Tag tag);


}
