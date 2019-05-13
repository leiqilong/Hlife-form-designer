package com.hlife.form_designer.dao;

import com.hlife.form_designer.model.Student;

public interface IStudentMapper {

    Student findStudentByName(String name);
}
