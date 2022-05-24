package com.hello.app;

public class PolymorphismEx {

    public static void main(String[] args) {
        // 다형성, HelloWorld를 구현한 모든 자식클래스는 부모 타입을 가질 수 있다.
        HelloWorld hello = new HalloWorldKo();
        HelloWorld hello2 = new HalloWorldKo();
        HelloWorld hello3 = new HalloWorldKo();
        HelloWorld hello4 = new HalloWorldKo();
        HelloWorld hello5 = new HalloWorldKo();
        HelloWorld hello6 = new HalloWorldKo();
        HelloWorld hello7 = new HalloWorldKo();
        HelloWorld hello8 = new HalloWorldKo();
        HelloWorld hello9 = new HalloWorldKo();
        HelloWorld hello10 = new HalloWorldKo();

        // 만약 이 상황에서 HalloWorldKo를 HalloWorldEn으로 변경해야 한다면?
        // 이렇게 많은 객체 혹은 더 많은 객체가 있을 경우 변경하기가 어렵다.

        callMethod(hello);
    }

    public static void callMethod(HelloWorld hello) {
        hello.sayHello();
    }
}


