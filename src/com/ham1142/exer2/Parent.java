package com.ham1142.exer2;

	public class Parent{
		public String name;
		
	public Parent() {
			super();
			// TODO Auto-generated constructor stub
		}


	public Parent(String name) {
		this.name = name; // 기본생성자가 아님. 인수가 없는 생성자는 사용을 못함 - 없어져버림 
	} 
		
}


// 부모 클래스에서 기본 생성자를 생성하거나
 // 자식 클래스에서 부모클래스를 호출하거나
  // 답이 2가지