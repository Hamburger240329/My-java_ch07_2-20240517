package com.ham1142.exer2;

public class Triange extends Shape {

	@Override  // 어너테이션(명시하다) - 오버라이딩이라고 명시했음 - 가독성 좋음
	public void areaPrint() {
		// TODO Auto-generated method stub
		System.out.println(width * heigth * 0.5);		// 이부분을 수정
		// Shape 클래스를 상속 받음
		//	super.areaPrint(); // 부모 클래스에서 정의된 원봄 메소드 호출  
	}

//	@Override
//	public void namePrint() {
//		// TODO Auto-generated method stub
//		System.out.println("도형이름:Triangle;")
////		super.namePrint();
//	}
	


	
//	@Override  // 어너테이션(명시하다) - 오버라이딩이라고 명시했음 - 가독성 좋음
//	public void areaPrint() {
//		// TODO Auto-generated method stub
//		super.areaPrint();		// 이부분을 수정 - 수정 전
//	}  // Shape 클래스를 상속 받음
	
		
	
//	public void arraPrint() { // 오버라이딩 - 삼각형 넒이 출력
//		System.out.println(width * heigth * 0.5);
//	}

	
	
}
