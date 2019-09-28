import java.util.Scanner;

public class JAVA_Find_Min_Array {
    public static int minValue (int [] array){
        int min = array[0];
        int index = 0;
        for (int i = 0 ; i < array.length ; i++){
            if (array[i] < min){
                min = array[i];
                index = i;
            }
        }
        return min;
    }

    public static void main(String[] args) {
        int [] array;
        int size;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a size: ");
        size = input.nextInt();
        while (size <= 0){
            System.out.println("Size should not exceed");
            size++;
        }
        array = new int[size];
        int i = 0;
        while (i < size){
            System.out.print("Enter element: " + (i+1) + "\t");
            array[i] = input.nextInt();
            i++;
        }
        System.out.println("Show Array");
        for (i = 0; i < array.length ; i++){
            System.out.println(array[i] + "\t");
        }
        int Min = minValue(array);
        System.out.print("Min Array: ");
        System.out.println(Min);
    }
}
