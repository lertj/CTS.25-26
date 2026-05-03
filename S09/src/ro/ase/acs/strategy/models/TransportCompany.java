package ro.ase.acs.strategy.models;

import ro.ase.acs.strategy.abstracts.ITransportStrategy;

public class TransportCompany {
    String name;
    String address;
    ITransportStrategy transportMethod;

    public TransportCompany(String name, String address) {
        this.name = name;
        this.address = address;
    }
    public void assignTransport(){
        if(transportMethod!=null){
            System.out.println("Sending transport method");
            transportMethod.transport();
        }
    }

    public void setTransportMethod(ITransportStrategy transportMethod) {
        this.transportMethod = transportMethod;
    }
}
