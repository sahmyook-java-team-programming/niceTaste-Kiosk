package kr.ac.sahmyook.nicetaste.kiosk.func;

import java.util.Scanner;

public class AddOrder {
    private String addQuestion;
    public boolean addPrint() {
        Scanner sc = new Scanner(System.in);
        System.out.print("추가 주문 하시겠습니까? (Y/N) ");
        this.addQuestion = sc.nextLine();

        if(addQuestion.equals("Y") || addQuestion.equals("y")) {
            return true;
        } else if (addQuestion.equals("N") || addQuestion.equals("n")) {
            return false;
        }
        return false;
    }

}
