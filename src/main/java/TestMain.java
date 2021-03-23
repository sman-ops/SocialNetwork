import java.sql.Timestamp;
import java.text.SimpleDateFormat;

public class TestMain {
    public static void main(String[] args){

        Page myPage = new Page();
        Member myMember = new Member();
        Group myGroup = new Group();


    }

    public static void afficheTemps(){
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");

        Timestamp timestamp = new Timestamp(System.currentTimeMillis());
        System.out.println("Format timestamp : " + timestamp);

        //format timestamp
        System.out.println("Date formaté : " + sdf.format(timestamp));
    }
}
