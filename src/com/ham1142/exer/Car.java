package com.ham1142.exer;

public class Car {

	String modelName;  // 모델명
	int modelYear; // 년식
	private String horsePower; // 마력
	String color; // 차색깔
	
	public void printModel() {
		System.out.println("자동차 모델명:"+this.modelName);
		
	}

	public Car() {
		System.out.println("Car 클래스(부모클래스) 생성자 호출됨!!");
		
	}

	public Car(String modelName, int modelYear, String horsePower, String color) {
		super();
		this.modelName = modelName;
		this.modelYear = modelYear;
		this.horsePower = horsePower;
		this.color = color;  // 이것도 생성자 오버로딩 이라고 할 수 있음
	}

	
	}
