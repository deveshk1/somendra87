package niki;

import java.util.Date;

public class PersonTest
{
    /**
     * we also call class as an entity
     * we call class as an entity because it can contain data members
     * <p>
     * data members :
     * attributes (variables)
     * constructor
     * methods
     */

    //Instance variables or attributes or properties
    private String firstName;
    private String lastName;
    private Integer age;
    private Date dateOfBirth;
    private Integer height;
    private AddressNiki address;

    //No argument constructor
   /* PersonTest(){

    }*/

    PersonTest(
            String firstName,
            String lastName
    )
    {
        this.firstName = firstName;
        this.lastName = lastName;
    }


    /**
     * what all can a person do
     */
    public void walk()
    {
        System.out.println(firstName + "  " + lastName + "person can walk ");
    }

    public void talk()
    {
        System.out.println("person can talk ");
    }

    public void eat()
    {
        System.out.println("person can eat ");
    }

    public void sleep()
    {
        System.out.println("person can sleep ");
    }

    public static void main(String[] args)
    {
        PersonTest personTest = new PersonTest("devesh", "kumar");
        personTest.walk();

    }

}
