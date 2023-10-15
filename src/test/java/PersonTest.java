import nl.novi.jp.Person;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PersonTest {

    @Test
    void nameShouldNotBeChangedDuringCreation() {
        //arrange
        Person person = new Person("Dana");
        //act
        //assert
        assertEquals("Dana", person.getName());
    }

    @Test
    void personWithoutNameShouldBeNamedJohn() {
        //arrange
        Person person = new Person();
        //act
        //assert
        assertEquals("John", person.getName());
    }

    @Test
    void ageShouldAddOneYear() {
        //arrange
        Person person = new Person();
        person.setAge(20);
        //act
        person.age();
        //assert
        assertEquals(21, person.getAge());
    }

    @Test
    void lastNameShouldStartWithUpperCaseWhenLowercaseGiven() {
        //arrange
        Person person = new Person("Nigel");

        //act
        person.setLastName("harle");
        //assert
        assertEquals("Harle", person.getLastName());
    }

    @Test
    void lastNameShouldStartWithUpperCase() {
        //arrange
        Person person = new Person("Birgit");

        //act
        person.setLastName("Snellens");
        //assert
        assertEquals("Snellens", person.getLastName());
    }
    @Test
    void givenAPartnerHasPartnerShouldReturnTrue() {
        //arrange
        Person wife = new Person();
        Person man = new Person();
        //act
        man.setPartner(wife);
        wife.setPartner(man);
        //assert
        assertTrue(wife.hasPartner());
        assertTrue(man.hasPartner());

    }

    @Test
    void givenNoPartnerHasPartnerShouldReturnFalse() {
        //arrange
        Person alone = new Person();
        //act
        //assert
        assertFalse(alone.hasPartner());
    }
    @Test
    void childShouldBeAddedToList() {
        //arrange
        Person person = new Person();
        Person child = new Person();
        //act
        person.addChild(child);
        //assert
        assertEquals(1, person.getChildren().size());
        assertEquals(child.getName(), person.getChildren().get(0).getName());
    }

    }


