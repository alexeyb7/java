<<<<<<< HEAD
public class dz3 {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
    }
=======
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class dz3 {
    public static void main(String[] args) {}
        public List<Integer> intsInRange(int size, int lowerBound, int upperBound) 
        { Random random = new Random();
             List<Integer> result = new ArrayList<>();
            for (int i = 0; i < size; i++)
            { result.add(random.nextInt(upperBound - lowerBound) + lowerBound);
             } 
        return result; }

        List<Integer> integerList = intsInRange(5, 0, 10);

        //System.out.@printf(integerList(0));       

>>>>>>> 2dc089038d73480f7f2e6d24c4733e50f95bca86
}
