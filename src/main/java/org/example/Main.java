package org.example;

// 문제 : 객체를 사용하지 않고 2번째 플레이어를 만들어주세요.

class Main {
    public static void main(String[] args) {
        플레이어 a플레이어1;
        a플레이어1 = new 플레이어();
        a플레이어1.나이 = 20;
        a플레이어1.이름 = "홍길동";
        a플레이어1.직업 = "의적";

        a플레이어1.stat();

        플레이어 b플레이어1 = b플레이어1 = new 플레이어();
        b플레이어1.나이 = 30;
        b플레이어1.이름 = "홍길순";
        b플레이어1.직업 = "도적";

        b플레이어1.stat();
    }
}
class 플레이어 {
    int 나이;
    String 이름;
    String 직업;
    void stat() {
        System.out.println("저의 이름은 " + 이름 + " 나이는 " + 나이 + " 직업은 " + 직업 + "입니다.");
    }
}