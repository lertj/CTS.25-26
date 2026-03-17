package ro.csie.cts.models.enumul;

public enum NetflixAccount {
    GABRIEL("Gabriel");
    String name;

    private NetflixAccount(String name) {
        System.out.println("NetflixAccount " + name + " created!");
        this.name = name;
    }
}

