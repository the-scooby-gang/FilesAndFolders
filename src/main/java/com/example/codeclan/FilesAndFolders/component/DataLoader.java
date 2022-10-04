package com.example.codeclan.FilesAndFolders.component;

import com.example.codeclan.FilesAndFolders.model.File;
import com.example.codeclan.FilesAndFolders.model.Folder;
import com.example.codeclan.FilesAndFolders.model.Person;
import com.example.codeclan.FilesAndFolders.repositories.FileRepo;
import com.example.codeclan.FilesAndFolders.repositories.FolderRepo;
import com.example.codeclan.FilesAndFolders.repositories.PersonRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Profile("!test")
@Component
public class DataLoader implements ApplicationRunner {


    @Autowired
    FileRepo fileRepo;
    @Autowired
    FolderRepo folderRepo;
    @Autowired
    PersonRepo personRepo;

    public DataLoader(){}

    @Override
    public void run(ApplicationArguments args) throws Exception {

        Person aimee = new Person("Aimee");
        personRepo.save(aimee);

        Folder folder1 = new Folder("folder1", aimee);
        folderRepo.save(folder1);

        Folder folder2 = new Folder("folder2", aimee);
        folderRepo.save(folder2);

        File file1 = new File("file1", ".exe", 1, folder1);
        fileRepo.save(file1);

        File file2 = new File("file2", ".doc", 2, folder1);
        fileRepo.save(file2);

        File file3 = new File("file3", ".exe", 3, folder2);
        fileRepo.save(file3);

        File file4 = new File("file4", ".png", 4, folder2);
        fileRepo.save(file4);
    }
}
