package com.infodales.aem.core.configurations;


import org.osgi.service.metatype.annotations.AttributeDefinition;
import org.osgi.service.metatype.annotations.AttributeType;
import org.osgi.service.metatype.annotations.ObjectClassDefinition;
import org.osgi.service.metatype.annotations.Option;

@ObjectClassDefinition(name = "Student Details", description = "Enter your Student Details here")
public @interface StudentConfig {

    @AttributeDefinition(name = "Student Name",
                         type = AttributeType.STRING,
                         description = "Enter the name here")
    public String getStudentName() default "Om";

    @AttributeDefinition(name =  "Roll Number", type = AttributeType.INTEGER,
            description = "Enter Roll Number here")
    public int getRollNumber() default 1;

    @AttributeDefinition(name =  "Student Grade", type = AttributeType.STRING,
            description = "Enter Roll Grade here")
    public String getStudentGrade() default "Grade";

    @AttributeDefinition(name =  "Course", type = AttributeType.STRING,
            description = "Select your Course",
            options = {
                    @Option(label = "BCA", value = "bca"),
                    @Option(label = "MCA", value = "mca"),
                    @Option(label = "BTech", value = "btech"),
                    @Option(label = "MTech", value = "mtech")
            })
    public String getCourses() default "Course";
}
