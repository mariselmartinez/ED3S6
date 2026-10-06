
package ed3s6prac1;


public class ED3S6prac1 {

    
    public static void main(String[] args) {
// TODO code application logic here
        DetectaTipo<Integer , Integer> obj1 = new DetectaTipo<>(5,9);
        DetectaTipo<Double , Double> obj2 = new DetectaTipo<>(5.3,3.2);
        DetectaTipo<Float , Float> obj3 = new DetectaTipo<>(3.1416f,5.123f);
        DetectaTipo<String , String> obj4 = new DetectaTipo<>("hola","adios");
        DetectaTipo<Character , Character> obj5 = new DetectaTipo<>('i', 'm');
 
    }
}

