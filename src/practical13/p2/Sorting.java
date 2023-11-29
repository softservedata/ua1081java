package practical13.p2;

import java.util.Arrays;
import java.util.List;

class Sorting{

    public static void main(String[] args) {
        List<String> my = Arrays.asList("sda","bfdg","dsfd","tlhg","dfgd");
        sort(my);


    }
    public static void sort(List<String> list){
        list.stream().sorted().forEach(System.out::println);
        //у зворотньому порядку
        //list.stream().sorted((a,b)->b.compareTo(a)).forEach(System.out::println);
    }
}