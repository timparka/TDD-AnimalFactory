package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Animal;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.Dog;
import rocks.zipcodewilmington.animals.Mammal;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class CatTest {
    // TODO - Create tests for `void setName(String name)`
    // TODO - Create tests for `speak`
    // TODO - Create tests for `setBirthDate(Date birthDate)`
    // TODO - Create tests for `void eat(Food food)`
    // TODO - Create tests for `Integer getId()`
    // TODO - Create test to check Animal inheritance; google search `java instanceof keyword`
    // TODO - Create test to check Mammal inheritance; google search `java instanceof keyword`

    @Test
    public void testSpeak(){
        //given
        Date givenDate = new Date();
        String givenName = "Tim";
        Integer givenId = 7;
        Cat cat = new Cat(givenName, givenDate, givenId);

        //expected
        String expected = "meow!";
        String actual = cat.speak();
        //test
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testBirthdate(){
        Date givenDate = new Date();
        String givenName = "Tim";
        Integer givenId = 7;

        Cat cat = new Cat(givenName, givenDate, givenId);

        Date expected = givenDate;
        Date actual = cat.getBirthDate();
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
        Cat cat = new Cat(givenName, givenDate, givenId);
        cat.eat(pizza);
        cat.eat(candy);

        //expected
        Integer expected = 2;
        Integer actual = cat.getNumberOfMealsEaten();
        //test
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void testId() {
        Date givenDate = new Date();
        String givenName = "Tim";
        Integer givenId = 7;
        Cat cat = new Cat(givenName, givenDate, givenId);

        Integer expected = givenId;
        Integer actual = cat.getId();
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void testAnimal() {
        Date givenDate = new Date();
        String givenName = "Tim";
        Integer givenId = 7;
        Cat cat = new Cat(givenName, givenDate, givenId);

        boolean expected = true;
        boolean actual = cat instanceof Animal;
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void testMammal() {
        Date givenDate = new Date();
        String givenName = "Tim";
        Integer givenId = 7;
        Cat cat = new Cat(givenName, givenDate, givenId);

        boolean expected = true;
        boolean actual = cat instanceof Mammal;
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void constructorTest() {
        // Given (cat data)
        String givenName = "Zula";
        Date givenBirthDate = new Date();
        Integer givenId = 0;

        // When (a cat is constructed)
        Cat cat = new Cat(givenName, givenBirthDate, givenId);

        // When (we retrieve data from the cat)
        String retrievedName = cat.getName();
        Date retrievedBirthDate = cat.getBirthDate();
        Integer retrievedId = cat.getId();

        // Then (we expect the given data, to match the retrieved data)
        Assert.assertEquals(givenName, retrievedName);
        Assert.assertEquals(givenBirthDate, retrievedBirthDate);
        Assert.assertEquals(givenId, retrievedId);
    }

}
