package com.song.mybatis.beans;

public class CatBean extends PetBean {

	/**
	 * 随机
	 */
	private static final long serialVersionUID = -7147054857438338744L;

	private Integer fish;

	public CatBean() {
		super();
	}

	public CatBean(Integer id, String name) {
		super(id, name);
	}

	public Integer getFish() {
		return fish;
	}

	public void setFish(Integer fish) {
		this.fish = fish;
	}

	@Override
	public String toString() {
		return "CatBean [fish=" + fish + ", toString()=" + super.toString() + "]";
	}

}
