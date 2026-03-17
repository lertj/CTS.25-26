import ro.csie.cts.models.publicul.NetflixAccount;
//import ro.csie.cts.models.enumul.NetflixAccount;

import static ro.csie.cts.models.enumul.NetflixAccount.GABRIEL;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {

//    NetflixAccount cont1 = NetflixAccount.getInstance("Gabriel");
//    NetflixAccount cont2 = NetflixAccount.getInstance("Laurentiu");
    for(int i=0;i<=10;i++){
        int finalI = i;
        Runnable r = new Runnable(){

                @Override
                public void run() {
                    NetflixAccount cont1 = NetflixAccount.getInstance("Gabriel" + finalI);
                }
            };
        new Thread (r).start();

        //NetflixAccount n = GABRIEL;


    }

}

