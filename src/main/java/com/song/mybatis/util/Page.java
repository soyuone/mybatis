package com.song.mybatis.util;

import java.util.List;

/**
 * <p>
 * Title: mybatis_[分页工具类]_[模块名]
 * </p>
 * <p>
 * Description: [分页工具类]
 * </p>
 * 
 * @author songyushi
 * @version $Revision$ 2017年2月13日
 * @author (lastest modification by $Author$)
 * @since 20100901
 */
public class Page {

	private int pageNo;// 当前页码

	private int pageTotal;// 总页码

	private int rowsTotal;// 总条数

	private int pageSize;// 每页显示条数

	private List<Object> list;// 返回的数据集合

	public int getPageNo() {
		return pageNo;
	}

	public void setPageNo(int pageNo) {
		this.pageNo = pageNo;
	}

	public int getPageTotal() {
		return pageTotal;
	}

	public void setPageTotal(int pageTotal) {
		this.pageTotal = pageTotal;
	}

	public int getRowsTotal() {
		return rowsTotal;
	}

	public void setRowsTotal(int rowsTotal) {
		this.rowsTotal = rowsTotal;
	}

	public int getPageSize() {
		return pageSize;
	}

	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}

	public List<Object> getList() {
		return list;
	}

	public void setList(List<Object> list) {
		this.list = list;
	}

	@Override
	public String toString() {
		return "Page [pageNo=" + pageNo + ", pageTotal=" + pageTotal + ", rowsTotal=" + rowsTotal + ", pageSize="
				+ pageSize + ", list=" + list + "]";
	}

}
