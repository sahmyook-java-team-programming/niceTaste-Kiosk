package kr.ac.sahmyook.nicetaste.kiosk.func;

import java.util.Scanner;

public class FirstOrderConfirm {
    Scanner sc = new Scanner(System.in);
    Order order = new Order();
    public void userOrder() {
        do {
            System.out.print("음료를 주문하시겠습니까? (Y/N) ");
            char x = sc.nextLine().charAt(0);
            if(x == 'y' || x == 'Y') {
                order.userOrder();
                break;
            } else if (x == 'n' || x == 'N') {
                System.out.println("프로그램을 종료합니다.");
                return;
            } else {
                System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
                userOrder();
                break;
            }
        } while(true);

    }
}
