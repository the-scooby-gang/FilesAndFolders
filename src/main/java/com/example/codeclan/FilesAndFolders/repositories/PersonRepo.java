package com.example.codeclan.FilesAndFolders.repositories;

import com.example.codeclan.FilesAndFolders.model.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonRepo extends JpaRepository<Person, Long> {
}
