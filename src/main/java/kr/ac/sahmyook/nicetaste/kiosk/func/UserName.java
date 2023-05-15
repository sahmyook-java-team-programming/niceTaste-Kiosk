package kr.ac.sahmyook.nicetaste.kiosk.func;

import kr.ac.sahmyook.nicetaste.kiosk.user.User;

import java.util.Scanner;

public class UserName {
    Scanner sc = new Scanner(System.in);
    User user = new User();
    public void getName() {
        System.out.print("불러드릴 닉네임을 입력해주세요 : ");
        String str = sc.nextLine();
        user.setUserName(str);
    }
}
