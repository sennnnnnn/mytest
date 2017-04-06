package com.hs.dubbo.entity;

import java.util.ArrayList;
import java.util.List;

public class PageEntity {

	/* 权限表主键 */
	private String pageId;
	/* 父权限 */
	private String prePageId;

	private String pageName;
	private String url;
	private Integer orderNo;
	private String description;
	private String iconName;

	private List<PageEntity> childrenPage = new ArrayList<PageEntity>();
	public String getPageId() {
		return pageId;
	}

	public void setPageId(String pageId) {
		this.pageId = pageId;
	}

	public String getPrePageId() {
		return prePageId;
	}

	public void setPrePageId(String prePageId) {
		this.prePageId = prePageId;
	}

	public String getPageName() {
		return pageName;
	}

	public void setPageName(String pageName) {
		this.pageName = pageName;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public Integer getOrderNo() {
		return orderNo;
	}

	public void setOrderNo(Integer orderNo) {
		this.orderNo = orderNo;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getIconName() {
		return iconName;
	}

	public void setIconName(String iconName) {
		this.iconName = iconName;
	}

	public List<PageEntity> getChildrenPage() {
		return childrenPage;
	}

	public void setChildrenPage(List<PageEntity> childrenPage) {
		this.childrenPage = childrenPage;
	}

}
