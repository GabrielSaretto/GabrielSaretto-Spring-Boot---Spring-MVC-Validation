package com.saretto.springdemo.mvc.validation;

import jakarta.validation.Constraint;
import jakarta.validation.Payload;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Constraint(validatedBy = CourseCodeConstraintValidator.class)
@Target({ElementType.METHOD, ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
public @interface CourseCode {

    // define default course code
    // define o código do curso padrão
    public String value() default "LUV";

    // define default error message
    // define a mensagem  de erro padrão
    public String message() default "must start with LUV";

    // define default groups
    // define grupos padrão
    public Class<?>[] groups() default {};

    // define default payloads
    // define payloads padrão
    public Class<? extends Payload>[] payload() default {};
}
