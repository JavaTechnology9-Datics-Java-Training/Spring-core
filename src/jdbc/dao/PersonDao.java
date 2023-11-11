package jdbc.dao;

import jdbc.model.Person;
import org.springframework.jdbc.core.JdbcTemplate;

public class PersonDao {
    private JdbcTemplate jdbcTemplate;
    private  final String INSERT_QUERY="insert into person(id,name,address,email) values(?,?,?,?)";

    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public String savePerson(Person person) {
        int update = jdbcTemplate.update(INSERT_QUERY, person.getId(), person.getName(), person.getAddress(), person.getEmail());
        return update>0?"Record Inserted successfully":"While inserting the record got the exception";
    }


    public Person getPerson(long id) {
        return null;
    }


    public Person updatePerson(Person person) {
        return null;
    }
}
