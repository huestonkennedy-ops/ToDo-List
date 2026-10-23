import java.util.ArrayList;
public class TodoList {
    private ArrayList<String> list = new ArrayList<>();
    public TodoList() {

    }
    public void add(String add) {
        list.add(add);
    }
    public void print() {
        int index = 1;
        for(String i: list) {
            System.out.print(index + ": ");
            System.out.println(i);
            index += 1;
        }
    }
    public void remove(int number) {
        list.remove(number - 1);
    }
}