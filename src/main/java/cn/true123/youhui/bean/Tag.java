package cn.true123.youhui.bean;

import java.io.Serializable;

public class Tag implements Serializable{
	private static final long serialVersionUID = -1264581720641316209L;
	private String href;
	private String name;

	public String getHref() {
		return href;
	}

	public void setHref(String href) {
		this.href = href;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Tag(String href, String name) {
		super();
		this.href = href;
		this.name = name;
	}

	@Override
	public String toString() {
		return "Tag [href=" + href + ", name=" + name + "]";
	}

}
