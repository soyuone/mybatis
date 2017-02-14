package com.song.mybatis.beans;

public class DogBean extends PetBean {

	/**
	 * 随机
	 */
	private static final long serialVersionUID = -1105410365334659076L;

	private Integer bone;

	public DogBean() {
		super();
	}

	public DogBean(Integer id, String name) {
		super(id, name);
	}

	public Integer getBone() {
		return bone;
	}

	public void setBone(Integer bone) {
		this.bone = bone;
	}

	@Override
	public String toString() {
		return "DogBean [bone=" + bone + ", toString()=" + super.toString() + "]";
	}

}
