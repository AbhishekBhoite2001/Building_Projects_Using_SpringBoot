package com.marvellous.MarvellousPotal.controller;

import com.marvellous.MarvellousPotal.Entity.BatchEntry;
import com.marvellous.MarvellousPotal.service.BatchEntryService;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController
@RequestMapping("/batches")
public class BatchEntryController
{
    @Autowired
    private BatchEntryService batchEntryService;

    @GetMapping
    public List<BatchEntry> getAll()
    {
        return batchEntryService.getAll();
    }

    @PostMapping
    public String createEntry(@RequestBody BatchEntry myentry)
    {
        batchEntryService.saveEntry(myentry);
        return "Document inserted successfully";
    }

    @GetMapping("/id/{myid}")
    public Optional<BatchEntry> getBatchEntryById(@PathVariable ObjectId myid)
    {
        return batchEntryService.findById(myid);
    }

    @DeleteMapping("/id/{myid}")
    public boolean deleteEntryById(@PathVariable ObjectId myid)
    {
        batchEntryService.deleteById(myid);
        return true;
    }

    @PutMapping("/id/{myid}")
    public void updateEntryById(@PathVariable ObjectId myid,@RequestBody BatchEntry myentry)
    {
        BatchEntry old = batchEntryService.findById(myid).orElse(null);
        if(old != null)
        {
            old.setName(myentry.getName());
            old.setFees(myentry.getFees());

            batchEntryService.saveEntry(old);
        }
    }
}
