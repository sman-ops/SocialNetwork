import com.socialnetwork.dao.MemberDAO;
import com.socialnetwork.entity.Group;
import com.socialnetwork.entity.Member;
import com.socialnetwork.entity.Page;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;

public class TestMain {
    public static void main(String[] args){

        Page myPage = new Page();
        Member myMember = new Member();
        myMember.setFirstName("Mohamed");
        // ...


        Group myGroup = new Group();

        MemberDAO memberDao = new MemberDAO();
        memberDao.create((myMember));

    }

    public static void afficheTemps(){
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");

        Timestamp timestamp = new Timestamp(System.currentTimeMillis());
        System.out.println("Standard Format timestamp : " + timestamp);

        //format timestamp
        System.out.println("Date formaté : " + sdf.format(timestamp));
    }
}
