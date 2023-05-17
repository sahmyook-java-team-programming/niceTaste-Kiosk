package kr.ac.sahmyook.nicetaste.kiosk.func;

import kr.ac.sahmyook.nicetaste.kiosk.drink.MakeCafeLatte;
import kr.ac.sahmyook.nicetaste.kiosk.drink.MakeCoffee;
import kr.ac.sahmyook.nicetaste.kiosk.drink.MakeVanillaLatte;

public class Machine {

    public void MakingCoffee(int count1, int count2, int count3) {
        int total = count1 + count2 + count3;

        for(int i = 1; i <= total; i++) {
            System.out.println("\n" + i + "번째 음료를 만들겠습니다.");
            new MakeCoffee().makeEspresso();
            if(count1 > 0) {
                new MakeCoffee().putWater();
                count1--;
            } else if(count2 > 0) {
                new MakeCafeLatte().putMilk();
                new MakeCafeLatte().putSyrup();
                count2--;
            } else if(count3 > 0) {
                new MakeVanillaLatte().putMilk();
                new MakeVanillaLatte().putSyrup();
                count3--;
            }
        }
    }
}
