package com.example.codeclan.FilesAndFolders.repositories;

import com.example.codeclan.FilesAndFolders.model.File;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface FileRepo extends JpaRepository <File, Long> {
}
