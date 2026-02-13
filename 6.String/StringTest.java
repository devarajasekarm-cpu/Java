import java.util.ArrayList;
import java.util.Collections;

public class StringTest {

    static void main() {

        ArrayList list = new ArrayList();
        list.add(42);
        list.add(24);
        list.add(87);
        list.add(12);
        list.sort((a,b)->a.getAmount()-b.getClass());
//        Collections.sort(list);
        System.out.println(list);
    }

}
