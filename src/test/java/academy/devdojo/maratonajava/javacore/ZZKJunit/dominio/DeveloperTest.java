package academy.devdojo.maratonajava.javacore.ZZKJunit.dominio;

import junit.framework.TestCase;
import org.junit.Test;

public class DeveloperTest {


    @Test
    public void instanceOf_ExecuteChildClassMethod_WhenObjectIsOfChildType(){
        Employee employeeDeveloper  = new Developer("1","Java");
        if(employeeDeveloper instanceof Developer){
            Developer developer = (Developer) employeeDeveloper;
            Assertions.assertEquals("Java", developer.getMainLanguage());
        }
        if(employeeDeveloper instanceof Developer developer){
            Assertions.assertEquals("Java", developer.getMainLanguage());

    }

}