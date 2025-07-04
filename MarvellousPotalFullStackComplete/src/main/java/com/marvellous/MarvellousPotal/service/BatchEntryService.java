package com.marvellous.MarvellousPotal.service;

import com.marvellous.MarvellousPotal.Entity.BatchEntry;
import com.marvellous.MarvellousPotal.Repository.BatchEntryRepository;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class BatchEntryService
{
    @Autowired
    private BatchEntryRepository batchEntryRepository;

    //C : Create
    //POST
    public void saveEntry(BatchEntry batchEntry)
    {
        batchEntryRepository.save(batchEntry);
    }

    //R: Read
    //Get
    public List<BatchEntry>getAll()
    {
        return batchEntryRepository.findAll();
    }

    //R: Read
    //Get
    public Optional<BatchEntry> findById(ObjectId id)
    {
        return  batchEntryRepository.findById(id);
    }

    //D: Delete
    //Delete
    public void deleteById(ObjectId id)
    {
        batchEntryRepository.deleteById(id);
    }
}
