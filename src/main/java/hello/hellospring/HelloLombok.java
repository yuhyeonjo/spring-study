package hello.hellospring;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@RequiredArgsConstructor
@Getter
public class HelloLombok {

    private final String hello;

    private final int lombok;

    public static void main(String[] args) {
        HelloLombok helloLombok = new HelloLombok("hi", 4);
//        helloLombok.setHello("hi");
//        helloLombok.setLombok(4);

        System.out.println("helloLombok.getHello() : " + helloLombok.getHello());
        System.out.println("helloLombok.getLombok() : " + helloLombok.getLombok());
    }

}
