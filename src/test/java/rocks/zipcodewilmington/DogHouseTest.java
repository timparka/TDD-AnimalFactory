package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.Dog;
import rocks.zipcodewilmington.animals.animal_creation.AnimalFactory;
import rocks.zipcodewilmington.animals.animal_storage.CatHouse;
import rocks.zipcodewilmington.animals.animal_storage.DogHouse;

import java.util.Date;
import java.util.List;

import static java.util.Arrays.asList;
import static org.junit.Assert.assertTrue;

/**
 * @author leon on 4/19/18.
 */
public class DogHouseTest {
    // TODO - Create tests for `void add(Dog dog)`
    // TODO - Create tests for `void remove(Integer id)`
    // TODO - Create tests for `void remove(Dog dog)`
    // TODO - Create tests for `Dog getDogById(Integer id)`
    // TODO - Create tests for `Integer getNumberOfDogs()`

    @Test
    public void testGetDog(){
        Date givenDate = new Date();
        String givenName = "Tim";
        Integer givenId = 7;
        Dog dog = new Dog(givenName, givenDate, givenId);
        DogHouse.add(dog);
        DogHouse.getDogById(givenId);

        Integer expected = 7;
        Integer actual = givenId;
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void testRemover() {
        Date givenDate = new Date();
        String givenName = "Tim";
        Integer givenId = 7;
        Dog dog = new Dog(givenName, givenDate, givenId);
        DogHouse.remove(dog);

        Integer expected = 1;
        Integer actual = DogHouse.getNumberOfDogs();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testAddDog(){
        Date givenDate = new Date();
        String givenName = "Tim";
        Integer givenId = 7;
        Dog dog = new Dog(givenName, givenDate, givenId);
        DogHouse.add(dog);

        Integer expected = 2;
        Integer actual = DogHouse.getNumberOfDogs();
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void testRemove(){
        Date givenDate = new Date();
        String givenName = "Tim";
        Integer givenId = 7;
        Dog dog = new Dog(givenName, givenDate, givenId);
        DogHouse.add(dog);
        DogHouse.remove(givenId);

        Integer expected = 3;
        Integer actual = DogHouse.getNumberOfDogs();
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void testGetNumberOfDogs() {
        // Given
        String name = "Trish";
        Date birthDate = new Date();
        Dog animal = AnimalFactory.createDog(name, birthDate);
        DogHouse.clear();

        // When
        DogHouse.add(animal);

        // Then
        DogHouse.getNumberOfDogs();
    }
}
