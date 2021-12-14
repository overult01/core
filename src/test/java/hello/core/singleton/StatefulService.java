package hello.core.singleton;

public class StatefulService {

    // 어떤 서비스 이름이 StatefulService 인 것.
//    private int price; // 상태를 유지하는 필드

    public int order(String name, int price) {
        System.out.println("name = " + name + "price = " + price);
//        this.price = price; // 여기가 문제!
        return price; // return으로 price 값 넘기기
    }

//    public int getPrice() {
//        return price;
//    }

}
