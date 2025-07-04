package com.marvellous.MarvellousPotal.Repository;

import com.marvellous.MarvellousPotal.Entity.BatchEntry;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface BatchEntryRepository extends MongoRepository<BatchEntry, ObjectId>
{
}
