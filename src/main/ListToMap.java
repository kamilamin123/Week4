package main;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ListToMap {

    public static void main(String[] args) {

        // Create a list of students
    	 List<Student> students = new ArrayList<>();
        
        //add student objects to this list
    	 students.add(new Student(1, "Alice", 20));
    	 students.add(new Student(2, "Bob", 22));
    	 students.add(new Student(3, "Charlie", 21));

        // Convert the list into a map with the student id as key
    	 Map<Integer, Student> studentMap = students.stream()
    	            .collect(Collectors.toMap(Student::getId, student->student));
        // Print the map
        System.out.println("Students Map: "+ studentMap);
        
        
        	
        }
    }
