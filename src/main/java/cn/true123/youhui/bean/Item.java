package cn.true123.youhui.bean;

import java.io.Serializable;
import java.util.List;

public class Item implements Serializable {
	private static final long serialVersionUID = 3648845115065428534L;
	private int id;
	private String title;
	private String date;
	private String url;
	private String catalogName;
	private int catalogId;
	private List<Tag> tags;
	private String context;
	private String imgUrl;
	private int createdUserId;
	private int createdUserName;

	

	public String getCatalogName() {
		return catalogName;
	}

	public void setCatalogName(String catalogName) {
		this.catalogName = catalogName;
	}

	public int getCreatedUserName() {
		return createdUserName;
	}

	public void setCreatedUserName(int createdUserName) {
		this.createdUserName = createdUserName;
	}

	public int getCreatedUserId() {
		return createdUserId;
	}

	public void setCreatedUserId(int createdUserId) {
		this.createdUserId = createdUserId;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public List<Tag> getTags() {
		return tags;
	}

	public void setTags(List<Tag> tags) {
		this.tags = tags;
	}

	public String getContext() {
		return context;
	}

	public void setContext(String context) {
		this.context = context;
	}

	public String getImgUrl() {
		return imgUrl;
	}

	public void setImgUrl(String imgUrl) {
		this.imgUrl = imgUrl;
	}

	public Item(int id, String title, String date, String url, String catalogName, List<Tag> tags, String context,
			String imgUrl, int createdUserId, int createdUserName) {
		super();
		this.id = id;
		this.title = title;
		this.date = date;
		this.url = url;
		this.catalogName = catalogName;
		this.tags = tags;
		this.context = context;
		this.imgUrl = imgUrl;
		this.createdUserId = createdUserId;
		this.createdUserName = createdUserName;
	}

	@Override
	public String toString() {
		return "Item [id=" + id + ", title=" + title + ", date=" + date + ", url=" + url + ", catalogName="
				+ catalogName + ", tags=" + tags + ", context=" + context + ", imgUrl=" + imgUrl + ", createdUserId="
				+ createdUserId + ", createdUserName=" + createdUserName + "]";
	}

	

}
