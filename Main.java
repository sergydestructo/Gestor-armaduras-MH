import java.util.Scanner;

public class Main{
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        SetList setList = new SetList();
        UI ui = new UI(scan, setList);

        ui.start();



    }

}