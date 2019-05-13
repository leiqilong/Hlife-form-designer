package com.hlife.form_designer.model;

import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
public class Student {
    private String id;
    private String name;
}
