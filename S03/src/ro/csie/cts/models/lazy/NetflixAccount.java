package ro.csie.cts.models.lazy;

public class NetflixAccount {
    String name;
    private static NetflixAccount instance;

    private NetflixAccount(String name) {
        System.out.println("NetflixAccount " + name + " created!");
        this.name = name;
    }
    public static synchronized NetflixAccount getInstance(String name) {
        if(instance==null){
            instance=new NetflixAccount(name);
        }
        return instance ;


    }
}
