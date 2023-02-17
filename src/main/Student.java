package main;

import java.util.Objects;

public class Student {

    // Create instance variables int id, String name, and int age
	private int id;
	private String name;
	private int age;
    //Define a constructor that takes three arguments (id, name, and age)
   
    public Student(int id, String name, int age) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
	}

	// Define a getter method for the id field
    

    // Define a getter method for the name field
   


   // Define a getter method for the age field
    public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

   
    //toString() method
    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

	@Override
	public int hashCode() {
		return Objects.hash(age, id, name);
	}

	@Override
	public boolean equals(Object obj) {
		
		Student other = (Student) obj;
		return age == other.age && id == other.id && Objects.equals(name, other.name);
	}
    

	
}

