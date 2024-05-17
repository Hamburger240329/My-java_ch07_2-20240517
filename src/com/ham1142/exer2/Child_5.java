package com.ham1142.exer2;

public class Child_5 extends Parent {
private String name;

public Child_5() {
this("홍길동");
System.out.println("Child() call");
}
public Child_5(String name) {
this.name = name;
System.out.println("Child(String name) call");
}
}
