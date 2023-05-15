package kr.ac.sahmyook.nicetaste.kiosk.func;

import kr.ac.sahmyook.nicetaste.kiosk.user.User;
import kr.ac.sahmyook.nicetaste.kiosk.view.Menu;

import java.util.Scanner;

public class Order {

    private String drinkName;
    private int drinkNum;

    public Order() {
    }

    public Order(String drinkName, int drinkNum) {
        this.drinkName = drinkName;
        this.drinkNum = drinkNum;
    }

    public String getDrinkName() {
        return drinkName;
    }

    public void setDrinkName(String drinkName) {
        this.drinkName = drinkName;
    }

    public int getDrinkNum() {
        return drinkNum;
    }

    public void setDrinkNum(int drinkNum) {
        this.drinkNum = drinkNum;
    }

    public void userOrder() {
        User user1 = new User();

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

    }
}
