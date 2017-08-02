package cn.true123.youhui.bean;

import java.io.Serializable;

public class Catalog implements Serializable {
	private static final long serialVersionUID = -6510019383932858762L;
	private int id;
	private String name;

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

	public Catalog(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	@Override
	public String toString() {
		return "Catalog [id=" + id + ", name=" + name + "]";
	}

}
