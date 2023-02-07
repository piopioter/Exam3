package exercise4.app;

import exercise4.models.Person;
import exercise4.models.MinMax;
import exercise4.services.MinMaxService;

import java.util.ArrayList;
import java.util.List;

public class MinMaxRunner {
    public static void main(String[] args) {


        List<String> stringList = new ArrayList<>();
        stringList.add("string");
        stringList.add("strin");
        stringList.add("stri");
        stringList.add("str");
        stringList.add("st");


        MinMax<String> minMax = MinMaxService.getMinAndMax(stringList);
        System.out.println(minMax.getMax());
        System.out.println(minMax.getMin());


        List<Person> personList = new ArrayList<>();
        personList.add(new Person("paweł","gil"));
        personList.add(new Person("jan","gil"));
        personList.add(new Person("łukasz","buc"));
        personList.add(new Person("michał","janusz"));
        personList.add(new Person("mateusz","michal"));

        MinMax<Person> personMinMax = MinMaxService.getMinAndMax(personList);

        System.out.println(personMinMax.getMax());
        System.out.println(personMinMax.getMin());




    }
}
