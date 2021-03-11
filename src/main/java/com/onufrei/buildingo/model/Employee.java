package com.onufrei.buildingo.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDate;
import java.time.LocalDateTime;

/** The representation of Employee
 * @author Artem Onufrei
 * @version 1
 * @since 03.03.2021
 */


@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Employee {
    @Id
    private String id;
    private String name;
    private String surname;
    private String phoneNumber;
    private String email;
    private String homeAddress;
    private String resumeUrl;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate dateOfBirth;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate hireDate;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate firedDate;
    private EmployeeSpecification specification;
    @DateTimeFormat(pattern = "yyyy-MM-dd'T'HH:mm")
    private LocalDateTime created_at;
    @DateTimeFormat(pattern = "yyyy-MM-dd'T'HH:mm")
    private LocalDateTime modified_at;
}
