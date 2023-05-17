package kr.ac.sahmyook.nicetaste.kiosk.drink;

public class MakeCafeLatte extends MakeCoffee implements MakeMilk, MakeSyrup {


    @Override
    public void putMilk() {
        System.out.println("우유를 넣는다.");
    }

    @Override
    public void putSyrup() {
        System.out.println("카페 시럽을 넣는다.");
    }
}
