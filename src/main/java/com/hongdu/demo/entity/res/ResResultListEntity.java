package com.hongdu.demo.entity.res;


import java.util.ArrayList;
import java.util.List;


public class ResResultListEntity<Entity> extends ResResultEntity {

    /**
	 * 
	 */
	private static final long serialVersionUID = 989615358594857535L;
	private List<Entity> list=new ArrayList<Entity>();
    private Long size;
    public List<Entity> getList() {
        return list;
    }

    public void setList(List<Entity> list) {
        this.list = list;
    }

	public Long getSize() {
		return size;
	}

	public void setSize(Long size) {
		this.size = size;
	}
    
}
