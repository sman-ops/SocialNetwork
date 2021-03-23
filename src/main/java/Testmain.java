import java.sql.Timestamp;
import java.text.SimpleDateFormat;

public class Testmain {
    public static void main(String[] args){
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");

        Timestamp timestamp = new Timestamp(System.currentTimeMillis());
        System.out.println("Format timestamp : " + timestamp);

        //format timestamp
        System.out.println("Date formaté : " + sdf.format(timestamp));
    }
}
