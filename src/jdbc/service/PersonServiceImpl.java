package jdbc.service;

import jdbc.dao.PersonDao;
import jdbc.model.Person;

public class PersonServiceImpl implements PersonService{
    private PersonDao personDao;

    public void setPersonDao(PersonDao personDao) {
        this.personDao = personDao;
    }

    @Override
    public String savePerson(Person person) {
        return personDao.savePerson(person);
    }

    @Override
    public Person getPerson(long id) {
        return personDao.getPerson(id);
    }

    @Override
    public Person updatePerson(Person person) {
        return personDao.updatePerson(person);
    }
}
