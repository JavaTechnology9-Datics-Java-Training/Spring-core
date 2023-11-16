package jdbc.dao;

import jdbc.model.Person;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;

public class PersonDao {
    //private JdbcTemplate jdbcTemplate;

    private NamedParameterJdbcTemplate namedParameterJdbcTemplate;
    private  final String INSERT_QUERY="insert into person(id,name,address,email) values(:id123,:name,:address,:email)";
    private final String LOAD_PERSON="select * from person where id=:id";
    private final String UPDATE_PERSON="update person set address=? where id=?";
    private final String DELETE_PERSON="delete from person where id=?";

    /*public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }*/

    public void setNamedParameterJdbcTemplate(NamedParameterJdbcTemplate namedParameterJdbcTemplate) {
        this.namedParameterJdbcTemplate = namedParameterJdbcTemplate;
    }
    /*
        JDBC Template Example
     */
    /*public String savePerson(Person person) {
        int update = jdbcTemplate.update(INSERT_QUERY, person.getId(), person.getName(), person.getAddress(), person.getEmail());
        return update>0?"Record Inserted successfully":"While inserting the record got the exception";
    }


    public Person getPerson(long id) {
        return jdbcTemplate.query(LOAD_PERSON, new ResultSetExtractor<Person>() {
            @Override
            public Person extractData(ResultSet resultSet) throws SQLException, DataAccessException {
                while(resultSet.next()) {
                    Person person = new Person();
                    person.setId(resultSet.getLong(1));
                    person.setName(resultSet.getString(2));
                    person.setAddress(resultSet.getString(3));
                    person.setEmail(resultSet.getString(4));
                    return person;
                }
                return null;
            }
        },new Object[]{id});
    }


    public Person updatePerson(Person person) {
        int update = jdbcTemplate.update(UPDATE_PERSON, person.getAddress(), person.getId());
        if(update>0) System.out.println("Person data is updated based on the id: " + person.getId());
        else System.out.println("No person data is found based on the id");
        return null;
    }
    public void deletePerson(long id){
        int update = jdbcTemplate.update(DELETE_PERSON, id);
        if(update>0) System.out.println("deleted the record based on this ID: " + id);
        else System.out.println("No data found");
    }*/

    /*
        NamedParameter JdbcTemplate Example
     */
    public String savePerson(Person person) {
        HashMap hashMap=new HashMap();
        hashMap.put("id123",person.getId());
        hashMap.put("name", person.getName());
        hashMap.put("address", person.getAddress());
        hashMap.put("email",person.getEmail());
        int update = namedParameterJdbcTemplate.update(INSERT_QUERY,hashMap);
        return update>0?"Record Inserted successfully":"While inserting the record got the exception";
    }


    public Person getPerson(long id) {
        HashMap hashMap=new HashMap();
        hashMap.put("id",id);
       return namedParameterJdbcTemplate.query(LOAD_PERSON, hashMap, new ResultSetExtractor<Person>() {
            @Override
            public Person extractData(ResultSet resultSet) throws SQLException, DataAccessException {
                while(resultSet.next()) {
                    Person person = new Person();
                    person.setId(resultSet.getLong(1));
                    person.setName(resultSet.getString(2));
                    person.setAddress(resultSet.getString(3));
                    person.setEmail(resultSet.getString(4));
                    return person;
                }
                return null;
            }
        });
    }


    public Person updatePerson(Person person) {
        /*int update = jdbcTemplate.update(UPDATE_PERSON, person.getAddress(), person.getId());
        if(update>0) System.out.println("Person data is updated based on the id: " + person.getId());
        else System.out.println("No person data is found based on the id");*/
        return null;
    }
    public void deletePerson(long id){
        /*int update = jdbcTemplate.update(DELETE_PERSON, id);
        if(update>0) System.out.println("deleted the record based on this ID: " + id);
        else System.out.println("No data found");*/
    }
}
