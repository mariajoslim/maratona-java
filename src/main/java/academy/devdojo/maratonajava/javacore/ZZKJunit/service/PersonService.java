package academy.devdojo.maratonajava.javacore.ZZKJunit.service;

import academy.devdojo.maratonajava.javacore.ZZKJunit.dominio.Person;

import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class PersonService {
    public boolean isAdult(Person person){
       // Objects.requireNonNull(person, "Pessoa não é aduçta");
        if(person == null){
            throw new IllegalArgumentException();
        }
        return person.getAge()>=21;

    }
    public List<Person> filterRemovingNotAdult(List<Person>personList){
        return personList.stream().filter(this::isAdult.collect(Collectors.toList());
    }
}
