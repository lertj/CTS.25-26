package ro.ase.acs.flyweight;

import java.util.HashMap;
import java.util.Map;

public class MobilaFactory {
    private static Map<MobilaType, Mobila> mobilas = new HashMap<>();

    public static Mobila getMobila(MobilaType type){
        Mobila m= mobilas.get(type);
        if (m!=null){
            return m;
        }
        switch (type) {
            case MobilaType.DULAP:
                m= new Mobila("Dulap", "white");
                break;
            case MASA:
                m = new Mobila("Masa", "blue");
                break;
            case NOPTIERA:
                m = new Mobila("Noptiera", "red");
                break;
            default: throw new UnsupportedOperationException("Type of mobila not suported");
        }
        mobilas.put(type, m);
        return m;
    }
}
