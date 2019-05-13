package com.hlife.form_designer.dao.impl;

import com.hlife.form_designer.dao.IStudentMapper;
import com.hlife.form_designer.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Repository;

@Repository
public class StudentMapperImpl implements IStudentMapper {
    @Autowired
    private MongoTemplate mongoTemplate;

    @Override
    public Student findStudentByName(String name) {
        Query query = new Query(Criteria.where("name").is(name));
        return mongoTemplate.findOne(query , Student.class);
    }
}
