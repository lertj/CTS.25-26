package ro.csie.cts.models.registry;

import java.util.HashMap;
import java.util.Map;

public class NetflixAccount {
    String name;
    private static Map<String,NetflixAccount> instances = new HashMap<>();

    private NetflixAccount(String name) {
        System.out.println("NetflixAccount " + name + " created!");
        this.name = name;
    }
    public static synchronized NetflixAccount getInstance(String name) {
        NetflixAccount acc = instances.get(name);
        if (acc == null) {
            acc = new NetflixAccount(name);
            instances.put(name, acc);
        }
        return acc;
    }
}
