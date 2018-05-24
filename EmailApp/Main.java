package EmailApp;

public class Main {
    public static void main(String[] args) {
        EmailApp em1 = new EmailApp("John","Smith");
        em1.setAlterEmail("john.Smith@gmail.com");
        System.out.println("Alternative email : " + em1.getAlterEmail());
        System.out.println(em1.showInfo());



    }

}
