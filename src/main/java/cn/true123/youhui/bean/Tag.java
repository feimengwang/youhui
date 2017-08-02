package cn.true123.youhui.bean;

import java.io.Serializable;

public class Tag implements Serializable {
	private static final long serialVersionUID = -1264581720641316209L;
	private int id;
	private String name;
	private int itemId;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getItemId() {
		return itemId;
	}

	public void setItemId(int itemId) {
		this.itemId = itemId;
	}

	public Tag(int id, String name, int itemId) {
		super();
		this.id = id;
		this.name = name;
		this.itemId = itemId;
	}

	@Override
	public String toString() {
		return "Tag [id=" + id + ", name=" + name + ", itemId=" + itemId + "]";
	}

}
