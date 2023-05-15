package kr.ac.sahmyook.nicetaste.kiosk.func;

import kr.ac.sahmyook.nicetaste.kiosk.view.Menu;
import java.util.Scanner;

public class FirstOrderConfirm {
    Scanner sc = new Scanner(System.in);
    Menu menu = new Menu();
    public void Userorder() {
        do {
            System.out.print("음료를 주문하시겠습니까? (Y/N) ");
            char x = sc.nextLine().charAt(0);
            if(x == 'y' || x == 'Y') {
                menu.showMenu();
                break;
            } else if (x == 'n' || x == 'N') {
                System.out.println("프로그램을 종료합니다.");
                return;
            } else {
                System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
                Userorder();
                break;
            }
        } while(true);

    }
}
