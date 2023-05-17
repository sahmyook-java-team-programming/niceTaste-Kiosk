package kr.ac.sahmyook.nicetaste.kiosk.control;

import kr.ac.sahmyook.nicetaste.kiosk.drink.MakeAmericano;
import kr.ac.sahmyook.nicetaste.kiosk.func.FirstOrderConfirm;
import kr.ac.sahmyook.nicetaste.kiosk.func.Machine;
import kr.ac.sahmyook.nicetaste.kiosk.func.Order;
import kr.ac.sahmyook.nicetaste.kiosk.userinfo.UserName;

public class ControlTower {

    public void start() {
        // 음료를 주문 할 건지 물어봄
        Order order = new Order();
        FirstOrderConfirm OrderConfirm = new FirstOrderConfirm();


        // 주문 한다면 Order 클래스의 userOrder 메소드 호출
        int[] cnt = new int[] {0,0,0};
        if(OrderConfirm.userOrder()) {
            cnt = order.userOrder();
        }

        // 손님의 닉네임 받기
        UserName userName = new UserName();
        userName.setNickName();

        // 음료 제조 상황 출력
        new Machine().MakingCoffee(cnt[0], cnt[1], cnt[2]);

        // 주문이 완료되면 손님 부르기
        userName.getNickName();






    }
}
