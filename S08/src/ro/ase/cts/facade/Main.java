package ro.ase.cts.facade;

import ro.ase.cts.facade.models.FacadeSmartHome;
import ro.ase.cts.facade.models.SmartAC;
import ro.ase.cts.facade.models.SmartLights;
import ro.ase.cts.facade.models.SmartStove;

public class Main {
    public static void main(String[] args) {
        FacadeSmartHome facadeSmartHome = new FacadeSmartHome();
        facadeSmartHome.leaveHome();

    }
}
