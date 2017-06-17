import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.text.DateFormat;

public class Main {

    public static boolean isValidDate(String inDate) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-mm-yyyy");
        dateFormat.setLenient(false);
        try {
            dateFormat.parse(inDate.trim());
        } catch (ParseException pe) {
            return false;
        }
        return true;
    }

    public static void main(String[] args) {

        DateFormat dateFormat = new SimpleDateFormat("dd/mm/yyyy");
        Date date = new Date();
        System.out.println(dateFormat.format(date));

        System.out.println(isValidDate("29-03-2006"));
        System.out.println(isValidDate("2005-02-29"));
    }
}