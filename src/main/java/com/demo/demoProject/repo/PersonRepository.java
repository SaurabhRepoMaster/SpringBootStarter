package com.demo.demoProject.repo;

import com.demo.demoProject.model.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.Collection;
import java.util.List;

public interface PersonRepository extends JpaRepository<Person,Integer> {

    //custom finder method that will fetch values by name;
    public List<Person> findByName(String name);
    public List<Person> findByNameAndRollNumber(String name,int rollNumber);
    public List<Person> findByNameStartingWith(String prefix);
    public List<Person> findByNameEndingWith(String suffix);
    public List<Person> findByNameContaining(String word);
    public List<Person> findByNameLike(String likePattern);
    public List<Person> findByNameOrderByName(String name);

    public List<Person> findByRollNumberLessThan(int number);
    public List<Person> findByRollNumberGreaterThanEqual(int number);
    public List<Person> findByRollNumberIn(Collection<Integer> ages);

    @Query("select p from Person p")
    public List<Person> getAllPersons();

    @Query("select p from Person p where p.name = :n")
    public List<Person> getPersonByName(@Param("n") String name);

    @Query(value = "select * from Person",nativeQuery = true)
    public List<Person> getPersons(@Param("n") String name);


}
