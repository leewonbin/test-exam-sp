package com.bdi.test.vo;

public class ExamVo {
	
	private Integer num;
	private String name;
	private String age;
	@Override
	public String toString() {
		return "ExamVo [num=" + num + ", name=" + name + ", age=" + age + "]";
	}
	public Integer getNum() {
		return num;
	}
	public void setNum(Integer num) {
		this.num = num;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}

}
