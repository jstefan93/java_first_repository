import model.computer.Laptop;
import model.computer.PC;

public class ComputerApp {

    public static void main(String[] args) {

        PC officeComputer = new PC("Office computer", "HP", 500, 128);
        Laptop gamingLaptop = new Laptop("XGames", "HP Games", 500, 256);

        officeComputer.switchOn();
        System.out.println(officeComputer.getState());

        gamingLaptop.switchOn();
        System.out.println(gamingLaptop.getState());

        officeComputer.showComputerName();

    }
}
