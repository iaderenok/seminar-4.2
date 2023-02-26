import java.util.ArrayDeque;

public class prog12 {

    public static ArrayDeque<Integer> enqueue(ArrayDeque<Integer> my_list, int element) {
        my_list.addLast(element);
        return my_list;
    }

    public static int dequeue(ArrayDeque<Integer> my_list) {
        int fe = my_list.getFirst();
        my_list.pollFirst();
        System.out.println("после удаления элемента: " + my_list);
        return fe;
    }

    public static int first(ArrayDeque<Integer> my_list) {
        return my_list.getFirst();
    }

    public static void main(String[] args) {
        ArrayDeque<Integer> my_list = new ArrayDeque<>();
        for (int i = 0; i < 10; i++) {
            my_list.add((int) (Math.random() * (10)));
        }
        int element = 22;
        System.out.println("очередь: " + my_list);
        System.out.println("после добавления элемента: " + enqueue(my_list, element) + "\n"+ "добавили" + element);
        System.out.println("удалили: " + dequeue(my_list));
        System.out.println("первый элемент: " + first(my_list));
    }

}