package ro.ase.cts.facade.models;

public class FacadeSmartHome {
    SmartAC smartAC = new SmartAC();
    SmartLights smartLights = new SmartLights();
    SmartStove smartStove = new SmartStove();

    public void leaveHome(){
        smartAC.turnOff();
        smartLights.turnOff();
        smartStove.stopGas();
        smartStove.closeDoor();
    }
}
