package kr.ac.sahmyook.nicetaste.kiosk.view;
import kr.ac.sahmyook.nicetaste.kiosk.func.Produce;
import java.util.Scanner;

public class Menu {
    public void showMenu() {
        Produce produce = new Produce();
        System.out.println("*** 메뉴판 ***");
        System.out.println("1. 아메리카노");
        System.out.println("2. 카페라떼");
        System.out.println("3. 바닐라라뗴");
        System.out.println("0. 주문종료");
        do {
            Scanner scanner = new Scanner(System.in);
            System.out.print("원하시는 메뉴번호를 입력하시오 : ");
            int x = scanner.nextInt();
            if (x == 1) {
                produce.makeAmericano();
                return;
            } else if (x == 2) {
                produce.makeCafeLatte();
                return;
            } else if (x == 3) {
                produce.makeVanillaLatte();
                return;
            } else{
                System.out.println("잘못된 입력입니다.");
                break;
            }
        } while(true);
    }
}
