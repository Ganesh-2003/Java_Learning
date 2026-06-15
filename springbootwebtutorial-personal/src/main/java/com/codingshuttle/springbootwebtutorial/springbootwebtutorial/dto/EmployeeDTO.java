package com.codingshuttle.springbootwebtutorial.springbootwebtutorial.dto;

import com.codingshuttle.springbootwebtutorial.springbootwebtutorial.annotations.EmployeeRoleValidation;
import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.validation.constraints.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class EmployeeDTO {

    private Long id;
    @NotBlank(message= "Required field in Employee: name")
    @Size(min = 3, max = 10, message = "Number of characters should be in the range (3-10)")
    private String name;
    @Email(message = "Email should be valid")
    private String email;

    @Max(value = 80, message = "Age of employee cannot be greater than 80")
    @Min(value = 18, message = "Age cannot be less than 18")
    private Integer age;

//    @NotBlank(message = "The role of Employee cannot be Blank")
//    @Pattern(regexp = "^(ADMIN|USER)$", message = "The role of Employee can either be User or Admin")
    @EmployeeRoleValidation //Custom defined annotation
    private String role; //Admin, User

    @NotNull(message = "The salary cannot be null") @Positive(message = "Salary of the employee should be positive")
    @Digits(integer = 6, fraction = 2, message = "Salary should be xxxxxx.yy")
    private Double salary;

    @PastOrPresent
    private LocalDate dateOfJoining;

    @JsonProperty("isActive")
    @AssertTrue(message = "Employee isActve must be true")
    private Boolean isActive;

}
