
package test.academy.devdojo.maratonajava.javacore.ZZKJunit.service;

import academy.devdojo.maratonajava.javacore.ZZKJunit.dominio.Person;
import academy.devdojo.maratonajava.javacore.ZZKJunit.service.PersonService;
import junit.framework.TestCase;
import org.junit.Test;
import org.junit.Before; 
import org.junit.After;

import java.util.List;

/** 
* PersonService Tester. 
* 
* @author <Authors name> 
* @since <pre>abr 21, 2022</pre> 
* @version 1.0 
*/ 
public class PersonServiceTest { 
private Person adult;
private Person notAdult;
private PersonService personService;
@BeforeEach
public void setUp(){
    adult = new Person(18);
    adult = new Person (15);
    personService = new PersonService();
} 

@Test
@DisplayName("a pessoa te menos de 18 anos")
   void isAdult_ReturnFalse_WhenAgeIsLowerThan18() {


    Assertions.assertFalse(false, personService.isAdult(adult));
}

    @Test
    @DisplayName("a pessoa te maior de 18 anos")
    void isAdult_ReturnTrue_WhenAgeIsGreaterOrEqualsThan18() {
    PersonService personService = new PersonService();
    Assertions.assertTrue(true, personService.isAdult(notAdult));
    }

    @DisplayName("Shoudl return lidt with only adults")
    void isAdult_ThrowException_WhenPersonIsNull  () {
        Assertions.assertThrows(IllegalArgumentException.class,()-> personService.isAdult(null),"Personcan't  be null");
    }

    @DisplayName("Shoudl return lidt with only adults")
    void filterRemovingNotAdult_ReturnWithAduktOnly_WhenPersonListOfPersonWithAdultIsPassed () {
    Person person1 = new Person(170);
    Person person2 = new Person(15);
    Person person3 = new Person(21);
    List<Person> personList = List.of(person1, person2, person3);
        Assertions.assertEquals(2, personService.filterRemovingNotAdult(personList));
    }
//TODO: Test goes here... 
} 


} 
