import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        TodoList list = new TodoList();
        while(true) {
            System.out.print("Command: ");
            String command = scanner.nextLine();
            if(command.equals("stop")) {
                System.out.println("Sorry, did our service noto work?");
                break;
            } else if(command.equals("list")) {
                list.print();
            } else if(command.equals("add")) {
                System.out.print("Task: ");
                list.add(scanner.nextLine());
            } else if(command.equals("Completed")) {
                System.out.print("Which task: ");
                list.remove(scanner.nextInt());
            }
        }
    }
}
