package academy.devdojo.maratonajava.javacore.ZZFtheads.server;

import academy.devdojo.maratonajava.javacore.ZZFtheads.dominio.Members;

public class EmailsDeliveryService implements Runnable {
    private final Members members;

    public EmailsDeliveryService(Members members){
        this.members = members;
    }


    @Override
    public void run() {
        String threadName = Thread.currentThread().getName();
        System.out.println(threadName+"starting to delivery emails...");
        while(members.isOpen() || members.pendingEmails()> 0) {

            try {
              String email =  members.retrieveEmail();
              if(email == null) continue;
                System.out.println(threadName+"enviando email para"+email);
                Thread.sleep(2000);
                System.out.println(threadName+"enviou email com sucesso para "+email);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Tdos os emails foram enviados com sucessp");
    }
}
