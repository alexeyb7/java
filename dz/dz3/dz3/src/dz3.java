/*Пусть дан произвольный список целых чисел.
1) Нужно удалить из него чётные числа 
2) Найти минимальное значение 
3) Найти максимальное значение 
4) Найти среднее значение */

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class dz3 {
    public static void main(String[] args) {
        int min = 1;
        int max = 100;
       // System.out.println(new Random().nextInt((max-min)+min));
        List<Integer> integerList = intsInRange(10, min, max); 
        System.out.println(integerList);
        List<Integer> evnList = integerList;
        for (int i=evnList.size();i-- > 0;)
        {
          if (evnList.get(i)%2 == 0) {
            evnList.remove(i);            }
        }
        System.out.print("Только нечетные: ");
        System.out.println(evnList);

         
}
public static List<Integer> intsInRange(int size, int lowerBound, int upperBound)
{ 
    Random random = new Random(); 
    List<Integer> result = new ArrayList<>();
    float sum = 0; 
    for (int i = 0; i < size; i++) { 
    result.add(random.nextInt(upperBound - lowerBound) + lowerBound);
    sum = sum + result.get(i);
    } 
    int minlst = result.get(0);
    int maxlst = result.get(0);
    for (int i = 1; i < size; i++) { 
        if (result.get(i) < minlst){
            minlst = result.get(i);
        }
        
        if (result.get(i) > maxlst){
            maxlst = result.get(i);
        }
        
        } 
    float avg = sum  / result.size();
    System.out.print("Среднее значение: ");
    System.out.println(avg);
    System.out.print("Минимальное значение: ");
    System.out.println(minlst);
    System.out.print("Максимальное значние: ");
    System.out.println(maxlst);
    return result; 
    } 
    
}
