package academy.devdojo.maratonajava.javacore.ZZFtheads.test;

import academy.devdojo.maratonajava.javacore.ZZFtheads.dominio.Members;
import academy.devdojo.maratonajava.javacore.ZZFtheads.server.EmailsDeliveryService;

import javax.swing.*;

public class EmailDeliveryTest01 {
    public static void main(String[] args) {
        Members members = new Members();
        Thread jiraya = new Thread(new EmailsDeliveryService(members), "Jiraya");
        Thread kakashi = new Thread(new EmailsDeliveryService(members), "Kakashi");
        jiraya.start();
        kakashi.start();
        while(true){
            String email = JOptionPane.showInputDialog("Entre com seu email");
            if(email == null || email.isEmpty()){
                members.close();
                break;
            }
            members.addMemberEmail(email);
        }
    }
}
