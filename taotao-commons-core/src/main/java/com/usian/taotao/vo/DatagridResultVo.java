package com.usian.taotao.vo;

import java.io.Serializable;
import java.util.List;

public class DatagridResultVo<T> implements Serializable{
	private Long total;
	private List<T> rows;
	public Long getTotal() {
		return total;
	}
	public void setTotal(Long total) {
		this.total = total;
	}
	public List<T> getRows() {
		return rows;
	}
	public void setRows(List<T> rows) {
		this.rows = rows;
	}
	
	
	
}
