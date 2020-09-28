import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        BubbleSort bubbleSort=new BubbleSort();
        Scanner input= new Scanner(System.in);
        System.out.println("Enter the list size: ");
        int size= input.nextInt();
        int[] list= new int[size];
        System.out.println("Enter "+ list.length + "values: ");
        for (int i=0;i<list.length;i++){
            list[i]=input.nextInt();
        }
        System.out.println("Your input list: ");
        for (int i=0;i<list.length;i++){
            System.out.println(list[i] +"\t");
        }
        System.out.println("\nBegin sort processing ...");
        bubbleSort.bubbleSortByStep(list);
    }
}
