package com.hlife.form_designer.service.impl;

import com.hlife.form_designer.dao.IStudentMapper;
import com.hlife.form_designer.model.Student;
import com.hlife.form_designer.service.IStudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentServiceImpl implements IStudentService {
    @Autowired
    private IStudentMapper studentMapper;

    public Student findStudentByStudentName(String name) {
        return studentMapper.findStudentByName(name);
    }
}
