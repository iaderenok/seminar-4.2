import java.util.List;
import java.util.LinkedList;
import java.util.Arrays;
import java.util.Collections; 
/**
 * prog10
 */
public class prog10 {
    public static void main(String[] args){
    Integer[] arr = {2,5,1,5,7,3,2};
    List<Integer> my_list = new LinkedList<>(Arrays.asList(arr));
    Collections.reverse(my_list);
    System.out.println(my_list);
}
    
}