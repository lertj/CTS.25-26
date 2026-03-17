package ro.csie.cts.models.registry;

public class Main {
    static void main() {
        NetflixAccount gabi1 = NetflixAccount.getInstance("Gabriel");
        NetflixAccount gabi2 = NetflixAccount.getInstance("Gabriel");
        NetflixAccount gabi3 = NetflixAccount.getInstance("Gabriel");
        gabi1.name = "Gabriela";
        System.out.println(gabi1.name);
        System.out.println(gabi2.name);
        System.out.println(gabi3.name);
        NetflixAccount vali = NetflixAccount.getInstance("Valentina");
    }
}
