package com.example.codeclan.FilesAndFolders.controller;

import com.example.codeclan.FilesAndFolders.model.Folder;
import com.example.codeclan.FilesAndFolders.repositories.FolderRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class FolderController {
    @Autowired
    FolderRepo folderRepo;

    @GetMapping(value="/folders")
    public ResponseEntity<List<Folder>> getAllFolders(){
        return new ResponseEntity<>(folderRepo.findAll(), HttpStatus.OK);
    }

    @GetMapping(value="/folders/{id}")
    public ResponseEntity getFolder(@PathVariable Long id){
        return new ResponseEntity(folderRepo.findById(id), HttpStatus.OK);
    }

    @PostMapping (value="/folders")
    public ResponseEntity<Folder> postFolder(@RequestBody Folder folder){
        folderRepo.save(folder);
        return new ResponseEntity<>(folder, HttpStatus.CREATED);
    }
}
