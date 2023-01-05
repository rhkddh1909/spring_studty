package kr.co.softcampus.main;

import kr.co.softcampus.beans.HelloWorld;
import kr.co.softcampus.beans.HelloWorldEn;
import kr.co.softcampus.beans.HelloWorldKo;

public class Main {
    public static void main(String[] args) {
//        HelloWorldEn helloWorldEn = new HelloWorldEn();
//        callMethode(helloWorldEn);
//        HelloWorldKo helloWoeldKo = new HelloWorldKo();
//        callMethode(helloWoeldKo);
//        HelloWorldEn helloWorldEn2 = new HelloWorldEn();
//        callMethode(helloWorldEn2);
//        HelloWorldKo helloWoeldKo2 = new HelloWorldKo();
//        callMethode(helloWoeldKo2);
        HelloWorld hellowWorld = new HelloWorldEn();
        HelloWorld hellowWorld2 = new HelloWorldKo();
        callMethode(hellowWorld);
        callMethode(hellowWorld2);
    }

    public static void callMethode(HelloWorld helloWorld){
        helloWorld.sayHello();
    }
}