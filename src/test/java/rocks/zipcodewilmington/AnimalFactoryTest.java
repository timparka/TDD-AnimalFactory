package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Animal;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.Dog;
import rocks.zipcodewilmington.animals.animal_creation.AnimalFactory;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class AnimalFactoryTest {
    //TODO - Create Test for `Animal createDog(String name, Date birthDate)`
    //TODO - Create Test for `Animal createCat(String name, Date birthDate)`
    @Test
    public void testCreateDog(){
        String name = "Tim";
        Date date = new Date();
        Dog dog = AnimalFactory.createDog(name, date);

        Integer expected = 0;
        Assert.assertEquals(expected, dog.getId());
    }
    @Test
    public void testCreateCat(){
        String name = "Tim";
        Date date = new Date();
        Cat cat = AnimalFactory.createCat(name, date);

        Integer expected = 0;
        Assert.assertEquals(expected, cat.getId());
    }
}
