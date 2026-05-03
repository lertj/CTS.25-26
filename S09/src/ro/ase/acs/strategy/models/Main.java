package ro.ase.acs.strategy.models;

public class Main {
    static void main() {
        TransportCompany tc = new TransportCompany("Eusebiu SRL", "Calea Dorobanti");
        tc.assignTransport();

        int buget = 5000;
        if(buget > 1000){
            tc.setTransportMethod(new PlaneStrategy());
        }
        else if(buget < 100){
            tc.setTransportMethod(new BicycleStrategy());
        } else{
            tc.setTransportMethod(new TaxiStrategy());
        }
        tc.assignTransport();
    }
}
