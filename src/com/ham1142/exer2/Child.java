package com.ham1142.exer2;

public class Child extends Parent{
	
	private int studentNo;
	
	public Child(String name, int studentNo) {
//		super("홍길동");  // 부모클래스의 생성자를 반드시 호출!
//		super(name); // 이 한줄이 있으면 아래 2줄은 없어도 됨
		this.name = name;
		this.studentNo = studentNo;
		
	} // 자식 클래스의 생성자가 만들어질려면 부모 클래스의 생성자가 있어야 함
	//	근데 부모 클래스의 생성자가 없어졌으니 자식 클래스는 생략하면 안됨
	//	즉 부모 클래스의 생성자를 호출 해줘야 함

}

