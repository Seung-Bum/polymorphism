package kr.co.hello.main;

import kr.co.hello.beans.HelloWorld;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainClass {
    public static void main(String[] args) {
        // xml 파일로딩
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("application.xml");

        // xml에 정의한 bean 객체의 주소값을 가져온다.
        // <bean id="hello" class="kr.co.hello.beans.HelloWorldEn" /> => HelloWorldKo로 바꾸면 내용이 다 바뀜
        // id가 hello인 클래스의 객체를 가져와서 반환해준다.

        HelloWorld hello = (HelloWorld) ctx.getBean("hello");
        callMethod(hello);

        HelloWorld hello2 = ctx.getBean("hello", HelloWorld.class);
        callMethod(hello2);

        ctx.close();
    }

    public static void callMethod(HelloWorld hello) {
        hello.sayHello();
    }
}
