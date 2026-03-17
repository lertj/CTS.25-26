package ro.csie.cts.models.eager;

public class NetflixAccount {
    String name;
    private static NetflixAccount instance;// = new NetflixAccount("Gabriel");

    static { // se executa la crearea clasei ( o singura data )
        instance = new  NetflixAccount("Andreea");
    }

    { // se executa la crearea fiecarui obiect
        System.out.println("Mesaj 2");
    }

    private NetflixAccount(String name) {
        System.out.println("NetflixAccount " + name + " created!");
        this.name = name;
    }

    public static synchronized NetflixAccount getInstance(String name) {
        return instance ;
    }
}
