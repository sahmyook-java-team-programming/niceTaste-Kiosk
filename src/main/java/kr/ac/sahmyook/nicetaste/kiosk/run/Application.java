package kr.ac.sahmyook.nicetaste.kiosk.run;

import kr.ac.sahmyook.nicetaste.kiosk.func.FirstOrderConfirm;

public class Application {
    public static void main(String[] args) {
        FirstOrderConfirm orderConfirm = new FirstOrderConfirm();
        orderConfirm.userOrder();

    }
}
