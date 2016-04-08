package neacy.upmarqueer.bean;

import java.io.Serializable;

public class ViewPointDeatils implements Serializable {
	// "url": "/article/detail/v/app/id/152",
	// "id": "152",
	// "is_top": "1",
	// "is_public": "1",
	// "title": "从尿液看肾脏健康 冒泡沫或是肾虚",
	// "content": "@",
	// "source": "之间医疗",
	// "abstract2": "　尿液是人体正常的生理代谢产物，尿液同时也是健康状况的晴雨表。",
	// "article_category_id": "22",
	// "order_list": "0",
	// "img_url":
	// "http://img.pic.ubetween.cn/?f=8d2fcf1550052bcfadcb5538398a1261",
	// "keys": "肾虚，尿液，健康",
	// "doctorid": "0"
	private String url;
	private String id;
	private String is_top;
	private String is_public;
	private String title;
	private String content;
	private String source;
	private String abstract2;
	private String article_category_id;
	private String order_list;
	private String img_url;
	private String keys;
	private String doctorid;

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getIs_top() {
		return is_top;
	}

	public void setIs_top(String is_top) {
		this.is_top = is_top;
	}

	public String getIs_public() {
		return is_public;
	}

	public void setIs_public(String is_public) {
		this.is_public = is_public;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getSource() {
		return source;
	}

	public void setSource(String source) {
		this.source = source;
	}

	public String getAbstract2() {
		return abstract2;
	}

	public void setAbstract2(String abstract2) {
		this.abstract2 = abstract2;
	}

	public String getArticle_category_id() {
		return article_category_id;
	}

	public void setArticle_category_id(String article_category_id) {
		this.article_category_id = article_category_id;
	}

	public String getOrder_list() {
		return order_list;
	}

	public void setOrder_list(String order_list) {
		this.order_list = order_list;
	}

	public String getImg_url() {
		return img_url;
	}

	public void setImg_url(String img_url) {
		this.img_url = img_url;
	}

	public String getKeys() {
		return keys;
	}

	public void setKeys(String keys) {
		this.keys = keys;
	}

	public String getDoctorid() {
		return doctorid;
	}

	public void setDoctorid(String doctorid) {
		this.doctorid = doctorid;
	}

}
