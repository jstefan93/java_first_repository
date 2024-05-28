public class MainApp {

    public static void main(String[] args) {

        User stefan = new User("Jakub", "Stefański", "tescik@buziaczek.pl", 17);

        stefan.getAllInfo();


        User tomek = new User("Tomek", "Marczuk", "tomek.marzuk@test.pl", 25);

        tomek.getAllInfo();

        Bug bug1 = new Bug("Nie działa przycisk", "stefan@byk.pl", 1);
//        bug1.isBugOpen = false;
        bug1.getAllBugInfo();
        int bugPriority = bug1.getBugPriority();
        System.out.println(bugPriority);
        bug1.showBugStatus();
        bug1.showEmail();


    }



}