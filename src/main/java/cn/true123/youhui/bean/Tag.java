package cn.true123.youhui.bean;

import java.io.Serializable;

public class Tag implements Serializable {
	private static final long serialVersionUID = -1264581720641316209L;
	private int id;
	private String name;
	private Item item;

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

	public Item getItem() {
		return item;
	}

	public void setItem(Item item) {
		this.item = item;
	}

	public Tag(int id, String name, Item item) {
		super();
		this.id = id;
		this.name = name;
		this.item = item;
	}

	@Override
	public String toString() {
		return "Tag [id=" + id + ", name=" + name + ", item=" + item + "]";
	}

	public Tag() {
		super();
	}


}
