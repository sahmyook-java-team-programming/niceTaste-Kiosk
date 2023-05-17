package kr.ac.sahmyook.nicetaste.kiosk.func;

import kr.ac.sahmyook.nicetaste.kiosk.userinfo.UserDrinkNum;
import kr.ac.sahmyook.nicetaste.kiosk.view.Menu;

import java.util.Scanner;

public class Order {

    private String drinkName;
    private int drinkNum;

    public Order() {
    }

    public int[] userOrder() {

        UserDrinkNum user1 = new UserDrinkNum();

        do {
            Scanner sc = new Scanner(System.in);

            new Menu().showMenu();

            System.out.print("원하시는 음료를 입력해주세요. : ");
            this.drinkName = sc.nextLine();
            System.out.print("수량을 입력해주세요. : ");
            this.drinkNum = sc.nextInt();
            sc.nextLine();

            if (drinkName.equals("아메리카노")) {
                user1.setAmericano_num(user1.getAmericano_num() + drinkNum);
            } else if (drinkName.equals("카페라떼")) {
                user1.setCafeLatte_num(user1.getCafeLatte_num() + drinkNum);
            } else if (drinkName.equals("바닐라라떼")) {
                user1.setVanillaLatte_num(user1.getVanillaLatte_num() + drinkNum);
            }

        } while (new AddOrder().addPrint());

        int[] cnt = {user1.getAmericano_num(),user1.getCafeLatte_num(),user1.getVanillaLatte_num()};
        return cnt;
    }
}
