package ro.csie.cts.models.publicul;

public class NetflixAccount {
    String name;
    public static final NetflixAccount instance = new NetflixAccount("Vali");

    private NetflixAccount(String name) {
        System.out.println("NetflixAccount " + name + " created!");
        this.name = name;
    }
    public static synchronized NetflixAccount getInstance(String name) {
        return instance ;


    }
}
