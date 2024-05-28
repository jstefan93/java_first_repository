public class MainApp {

    public static void main(String[] args) {

        User stefan = new User("Jakub", "Stefański", "tescik@buziaczek.pl", 17);

        stefan.getAllInfo();


        User tomek = new User("Tomek", "Marczuk", "tomek.marzuk@test.pl", 25);

        tomek.getAllInfo();

    }

}