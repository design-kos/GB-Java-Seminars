package Seminars.Seminar10;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Main {
    public static void main(String[] args) {

        List<Integer> listOfNumbers = Arrays.asList(
                new Random().nextInt(200) - 100,
                new Random().nextInt(200) - 100,
                new Random().nextInt(200) - 100,
                new Random().nextInt(200) - 100,
                new Random().nextInt(200) - 100,
                new Random().nextInt(200) - 100);

        System.out.println("Main List");
        System.out.println(listOfNumbers);

        System.out.println("-------------------------------------");
        System.out.println("List of even numbers:");
        List<Integer> listOfEvenNumbers = filter(listOfNumbers, new IsEven());
        System.out.println(listOfEvenNumbers);

        System.out.println("-------------------------------------");
        System.out.println("List of positive numbers:");
        List<Integer> listOfPositiveNumbers = filter(listOfNumbers, new IsPositive());
        System.out.println(listOfPositiveNumbers);

        List<String> stringList = Arrays.asList(
                "Rod",
                "Pale",
                "Sink",
                "Steam",
                "River",
                "Meaty",
                "Start",
                "Ads",
                "Skip");

        System.out.println("-------------------------------------");
        System.out.println("String List begins with:");
        List<String> stringListBeginsWith = filter(stringList, new BeginsWith("St"));
        System.out.println(stringListBeginsWith);

        System.out.println("-------------------------------------");
        System.out.println("String List begins with A:");
        List<String> stringListBeginsWithA = filter(stringList, new BeginsWithA());
        System.out.println(stringListBeginsWithA);

    }

    private static <T> List<T> filter(Iterable<T> array, IsGood<T> isGood) {
        List<T> newArray = new ArrayList<>();
        for (T item : array) {
            if (isGood.isGood(item)) {
                newArray.add(item);
            }
        }
        return newArray;
    }
}