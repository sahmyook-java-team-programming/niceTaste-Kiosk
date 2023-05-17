package kr.ac.sahmyook.nicetaste.kiosk.drink;

public class CafeLatte extends Coffee implements Milk, Syrup{


    @Override
    public void putMilk() {
        System.out.println("우유를 넣는다.");
    }

    @Override
    public void putSyrup() {
        System.out.println("카페 시럽을 넣는다.");
    }
}
