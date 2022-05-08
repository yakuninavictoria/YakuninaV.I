//Определить дополнительный массив, состоящий из неповторяющихся элементов исходного массива и вывести его на экран
import java.util.Arrays;
 public class Main
{
    public static void main(String[] args)
    {
        int[] numbers = new int[] {1,2,3,4,6,5,1,3,4};
        int[] uniqueNumbers = Arrays.stream(numbers).distinct().toArray();
        for (int i : uniqueNumbers)
        {
            System.out.println(i);
        }
    }
}