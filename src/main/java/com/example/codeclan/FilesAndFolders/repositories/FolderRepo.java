package com.example.codeclan.FilesAndFolders.repositories;

import com.example.codeclan.FilesAndFolders.model.Folder;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FolderRepo extends JpaRepository<Folder, Long> {
}
