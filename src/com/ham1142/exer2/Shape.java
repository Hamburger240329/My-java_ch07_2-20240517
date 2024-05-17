package com.ham1142.exer2;

public class Shape {

	int width=10; // 가록길이
	int heigth=20; // 세로길이
//	String name="도형";
	
	public void areaPrint() {
		System.out.println(this.width * this.heigth);
	}

	public final void namePrint() { // final 키워드가 메소드 선언에 추가되면 해당 메소드는 오버라이딩 불가! 
		System.out.print("도형이름:shape");
	}
}
