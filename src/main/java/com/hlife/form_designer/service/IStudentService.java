package com.hlife.form_designer.service;

import com.hlife.form_designer.model.Student;

public interface IStudentService {

    Student findStudentByStudentName(String name);
}
