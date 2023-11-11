package jdbc.service;

import jdbc.model.Person;

public interface PersonService {
    String savePerson(Person person);
    Person getPerson(long id);
    Person updatePerson(Person person);
}
