package stream;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class Main {

  public static void main(String[] args) {
    List<Person> people = getPeople();

   
    // Filter
    List<Person>  females=people.stream().filter(person->person.getGender().equals(Gender.FEMALE)).collect(Collectors.toList());
//    females.forEach(System.out::println);

//    females.forEach(System.out::println);

    // Sort by age
    people.stream()
    .sorted(Comparator.comparing(person->((Person) person).getAge()).reversed())
    .forEach(System.out::println);
    

//    sorted.forEach(System.out::println);

    // All match
   boolean allMatch=people.stream()
   .allMatch(person->person.getAge()>6);
  System.out.println(allMatch);
   
    // Any match
    

//    System.out.println(anyMatch);
    // None match
   

//    System.out.println(noneMatch);

    // Max
    people.stream()
    .max(Comparator.comparing(Person::getAge)).ifPresent(System.out::println);
//        .ifPresent(System.out::println);

    // Min
   
//        .ifPresent(System.out::println);

    // Group
    Map<Gender,List<Person>> kamil=people.stream()
    .collect(Collectors.groupingBy(Person::getGender));
    kamil.forEach((gender,people1)->{
    	System.out.println(gender);
    	people1.forEach(System.out::println);
    	System.out.println();
    });
//    groupByGender.forEach((gender, people1) -> {
//      System.out.println(gender);
//      people1.forEach(System.out::println);
//      System.out.println();
//    });

    people.forEach(System.out::println);

   
  }

  private static List<Person> getPeople() {
    return List.of(
        new Person("Antonio", 20, Gender.MALE),
        new Person("Alina Smith", 33, Gender.FEMALE),
        new Person("Helen White", 57, Gender.FEMALE),
        new Person("Alex Boz", 14, Gender.MALE),
        new Person("Jamie Goa", 99, Gender.MALE),
        new Person("Anna Cook", 7, Gender.FEMALE),
        new Person("Zelda Brown", 120, Gender.FEMALE)
    );
  }

}