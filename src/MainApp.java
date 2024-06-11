import model.Bug;
import model.User;

public class MainApp {

    public static void main(String[] args) {

        User stefan = new User("Jakub", "Stefański", "tescik@buziaczek.pl", 17);

        System.out.println(stefan.getEmail());

        stefan.setEmail("Lord@stefix.pl");
        System.out.println(stefan.getEmail());;

        stefan.setEmail("stefano@rosja.ru");
        System.out.println(stefan.getEmail());


        User tomek = new User("Tomek", "Marczuk", "tomek.marzuk@test.pl", 25);


        Bug bug1 = new Bug("Nie działa przycisk", "stefan@byk.pl", 1);
//        bug1.isBugOpen = false;
        bug1.getAllBugInfo();
        int bugPriority = bug1.getBugPriority();
        System.out.println(bugPriority);
        bug1.showBugStatus();
        bug1.showEmail();

        bug1.setBugDescription("seks");

        bug1.setBugReporterEmail("stefan@");

        bug1.setBugPriority(-1);
        System.out.println(bug1.getBugPriority());


    }



}