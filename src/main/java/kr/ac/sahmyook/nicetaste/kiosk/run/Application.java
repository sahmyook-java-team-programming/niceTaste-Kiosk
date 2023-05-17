package kr.ac.sahmyook.nicetaste.kiosk.run;

import kr.ac.sahmyook.nicetaste.kiosk.control.ControlTower;
import kr.ac.sahmyook.nicetaste.kiosk.func.FirstOrderConfirm;

public class Application {
    public static void main(String[] args) {

        ControlTower controlTower = new ControlTower();
        controlTower.start();
    }
}
