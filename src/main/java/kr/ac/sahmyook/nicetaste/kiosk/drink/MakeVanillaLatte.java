package kr.ac.sahmyook.nicetaste.kiosk.drink;

public class MakeVanillaLatte extends MakeCoffee implements MakeMilk, MakeSyrup {
    @Override
    public void putMilk() {
        System.out.println("저지방 우유를 넣는다.");
    }

    @Override
    public void putSyrup() {
        System.out.println("바닐라 시럽을 넣는다.");
    }
}
