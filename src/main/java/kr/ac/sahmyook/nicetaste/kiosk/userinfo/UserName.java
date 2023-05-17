package kr.ac.sahmyook.nicetaste.kiosk.userinfo;

import java.util.Scanner;

public class UserName {
    private String nickName;

    public UserName() {
    }

    public String getNickName() {
        System.out.println("\n" + this.nickName + " 님 주문하신 음료 나왔습니다.");
        return nickName;
    }

    public void setNickName() {
        Scanner sc = new Scanner(System.in);
        System.out.print("불러드릴 닉네임을 입력해주세요 : ");
        this.nickName = sc.nextLine();
    }
}
