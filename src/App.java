import utils.StringUtils;
import utils.WeekUtils;

public class App {

    public static void main(String[] args) {

        String sexAnDerBar = StringUtils.getFormattedText("SexAnDerBar");

        System.out.println(sexAnDerBar);
        String stefan = StringUtils.getFormattedText("Stefan");

        System.out.println(stefan);

        System.out.println(WeekUtils.MONDAY);


    }
}
