import java.util.List;
import java.util.LinkedList;
import java.util.Arrays;
import java.util.Iterator;
/**
 * prog11
 */
public class prog11 {
    public static void main(String[] args){
        int sum = 0;
        Integer[] arr = {2,1,8,3,5,7,3};
        List<Integer> my_list = new LinkedList<>(Arrays.asList(arr));
        Iterator<Integer> it = my_list.iterator();
        while (it.hasNext()){
            sum = sum + it.next();
        }
        System.out.println(sum);
    }
    
}