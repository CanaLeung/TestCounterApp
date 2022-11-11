package useCases;
import Entities.counter;

public class resetCounter {
    public static void resetCounter(){
        counter.setCount(0);
    }
}
