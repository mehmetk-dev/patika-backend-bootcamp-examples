package hafta5.prework.methodreferance;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class MethodReferanceExample {

    public static void main(String[] args) {

        // 1: Static method referance -> Classname::methodName Math::max
        // 2: Instance method referance (Object)-> objectReferance:: instanceMethod
        // System.out::println
        // 3: Instance method referance (Class)-> ClassName::methodName String::toUpperCase
        // 4: Constructor method referance -> ClassName::new ArrayList::new

        // 1: Static method referance -> Classname::methodName

        BiFunction<Integer,Integer,Integer> sum = MathOperations::sum;
        System.out.println("Toplam" + sum.apply(1,6));

        // 2: Instance method referance (Object)-> objectReferance:: instanceMethod

        Printer printer = new Printer();
        Consumer<String> print = printer::print;
        print.accept("mehmet");

        // 3: Instance method referance (Class)-> ClassName::methodName

        List<String> myList = Arrays.asList("merhaba","ben","benim");
        myList.forEach(System.out::println);

        // 4: Constructor method referance -> ClassName::new

        Supplier<Car> cars = Car::new;
        cars.get();
        Car car = cars.get();
    }
}
