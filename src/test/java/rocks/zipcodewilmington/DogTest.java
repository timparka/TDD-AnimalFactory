package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import rocks.zipcodewilmington.animals.Animal;
import rocks.zipcodewilmington.animals.Dog;
import rocks.zipcodewilmington.animals.Mammal;

import java.util.ArrayList;
import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class DogTest {
    // TODO - Create tests for `new Dog(String name, Date birthDate, Integer id)`
    // TODO - Create tests for `speak`
    // TODO - Create tests for `setBirthDate(Date birthDate)`
    // TODO - Create tests for `void eat(Food food)`
    // TODO - Create tests for `Integer getId()`
    // TODO - Create test to check Animal inheritance; google search `java instanceof keyword`
    // TODO - Create test to check Mammal inheritance; google search `java instanceof keyword`

    @Test
    public void testConstructor(){
        // Given
        Date givenDate = new Date();
        String givenName = "Tim";
        Integer givenId = 7;
        Dog dog = new Dog(givenName, givenDate, givenId);

        String retrievedName = dog.getName();
        Date retrievedBirthDate = dog.getBirthDate();
        Integer retrievedId = dog.getId();

        //testing
        Assert.assertEquals(givenName, retrievedName);
        Assert.assertEquals(givenDate, retrievedBirthDate);
        Assert.assertEquals(givenId, retrievedId);
    }

    @Test
    public void testSpeak(){
        //given
        Date givenDate = new Date();
        String givenName = "Tim";
        Integer givenId = 7;
        Dog dog = new Dog(givenName, givenDate, givenId);

        //expected
        String expected = "bark!";
        String actual = dog.speak();
        //test
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testBirthdate(){
        Date givenDate = new Date();
        String givenName = "Tim";
        Integer givenId = 7;

        Dog dog = new Dog(givenName, givenDate, givenId);

        Date expected = givenDate;
        Date actual = dog.getBirthDate();
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void testEat() {
        //given
        Food pizza = new Food();
        Food candy = new Food();
        Date givenDate = new Date();
        String givenName = "Tim";
        Integer givenId = 7;
        Dog dog = new Dog(givenName, givenDate, givenId);
        dog.eat(pizza);
        dog.eat(candy);

        //expected
        Integer expected = 2;
        Integer actual = dog.getNumberOfMealsEaten();
        //test
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void testId() {
        Date givenDate = new Date();
        String givenName = "Tim";
        Integer givenId = 7;
        Dog dog = new Dog(givenName, givenDate, givenId);

        Integer expected = givenId;
        Integer actual = dog.getId();
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void testAnimal() {
        Date givenDate = new Date();
        String givenName = "Tim";
        Integer givenId = 7;
        Dog dog = new Dog(givenName, givenDate, givenId);

        boolean expected = true;
        boolean actual = dog instanceof Animal;
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void testMammal() {
        Date givenDate = new Date();
        String givenName = "Tim";
        Integer givenId = 7;
        Dog dog = new Dog(givenName, givenDate, givenId);

        boolean expected = true;
        boolean actual = dog instanceof Mammal;
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void setNameTest() {
        // Given (a name exists and a dog exists)
        Dog dog = new Dog(null, null, null);
        String givenName = "Milo";

        // When (a dog's name is set to the given name)
        dog.setName(givenName);

        // Then (we expect to get the given name from the dog)
        String dogName = dog.getName();
        Assert.assertEquals(dogName, givenName);
    }
}
