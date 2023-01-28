//import java.util.function.Consumer;
//import java.util.function.Function;
//import java.util.function.Predicate;
//import java.util.function.Supplier;
//
//public class Main {
//    public static void main(String[] args) {
//
//
//        //Задание 1
//
//        //Анонимный класс
//        Predicate<Integer> predicate = new Predicate<Integer>() {
//            @Override
//            public boolean test(Integer integer) {
//                return integer >= 0;
//            }
//        };
//        System.out.println(predicate.test(-10));
//
//        //Лямбда
//        Predicate<Integer> predicate1 = integer -> integer >= 0;
//        System.out.println(predicate1.test(10));
//
//
//        // Задание 2
//
//        // Анонимный класс
//        Consumer<String> consumer = new Consumer<String>() {
//            @Override
//            public void accept(String s) {
//                System.out.println("Привет, меня зовут " + s + ".");
//            }
//        };
//        consumer.accept("Иван");
//
//        //Лямбда
//        Consumer<String> consumer1 = s -> System.out.println("Привет, меня зовут " + s + ".");
//        consumer1.accept("Федор");
//
//
//        //Задание 3
//
//        //Анонимный класс
//        Function<Double, Long> function = new Function<Double, Long>() {
//            @Override
//            public Long apply(Double aDouble) {
//                return aDouble.longValue();
//            }
//        };
//        System.out.println(function.apply(223.794545));
//
//        //Лямбда
//        Function<Double, Long> function1 = aDouble -> aDouble.longValue();
//        System.out.println(function1.apply(123.54124123));
//
//
//        //Задание 4
//
//        //Анонимный класс
//        Supplier<?> supplier = new Supplier<>() {
//            @Override
//            public Object get() {
//                return (int) (Math.random() * 100);
//            }
//        };
//        System.out.println(supplier.get());
//
//        //Лямбда
//        Supplier<Integer> supplier1 = () -> (int) (Math.random() * 100);
//        System.out.println(supplier1.get());
//        System.out.println("-------------------------------------");
//
//
//        //Задание 5
//        Function<Object, String> function2 = s -> "resultTrue";
//        Function<Object, String> function3 = s -> "resultFalse";
//
//        System.out.println(ternaryOperator(predicate,function2,function3).apply("asd"));
//    }
//
//    public static Function<Object, String> ternaryOperator(Predicate<Integer> condition, Function<Object, String> ifTrue, Function<Object, String> ifFalse) {
//        return t -> condition.test(-5) ? ifTrue.apply(3) : ifFalse.apply(3);
//    }
//}