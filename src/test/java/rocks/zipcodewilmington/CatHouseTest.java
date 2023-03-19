package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.Dog;
import rocks.zipcodewilmington.animals.animal_creation.AnimalFactory;
import rocks.zipcodewilmington.animals.animal_storage.CatHouse;
import rocks.zipcodewilmington.animals.animal_storage.DogHouse;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class CatHouseTest {
    // TODO - Create tests for `void add(Cat cat)`
    // TODO - Create tests for `void remove(Integer id)`
    // TODO - Create tests for `void remove(Cat cat)`
    // TODO - Create tests for `Cat getCatById(Integer id)`
    // TODO - Create tests for `Integer getNumberOfCats()`
    @Test
    public void testGetCat(){
        Date givenDate = new Date();
        String givenName = "Tim";
        Integer givenId = 7;
        Cat cat = new Cat(givenName, givenDate, givenId);
        CatHouse.add(cat);
        CatHouse.getCatById(givenId);

        Integer expected = 7;
        Integer actual = givenId;
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void testRemover() {
        Date givenDate = new Date();
        String givenName = "Tim";
        Integer givenId = 7;
        Cat cat = new Cat(givenName, givenDate, givenId);
        CatHouse.remove(cat);

        Integer expected = 1;
        Integer actual = CatHouse.getNumberOfCats();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testAddCat(){
        Date givenDate = new Date();
        String givenName = "Tim";
        Integer givenId = 7;
        Cat cat = new Cat(givenName, givenDate, givenId);
        CatHouse.add(cat);

        Integer expected = 2;
        Integer actual = CatHouse.getNumberOfCats();
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void testRemove(){
        Date givenDate = new Date();
        String givenName = "Tim";
        Integer givenId = 7;
        Cat cat = new Cat(givenName, givenDate, givenId);
        CatHouse.add(cat);
        CatHouse.remove(givenId);

        Integer expected = 3;
        Integer actual = CatHouse.getNumberOfCats();
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void testGetNumberOfCats() {
        // Given
        String name = "Trish";
        Date birthDate = new Date();
        Cat animal = AnimalFactory.createCat(name, birthDate);
        CatHouse.clear();

        // When
        CatHouse.add(animal);

        // Then
        CatHouse.getNumberOfCats();
    }
}
