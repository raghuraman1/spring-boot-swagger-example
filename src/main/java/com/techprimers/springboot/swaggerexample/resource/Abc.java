package com.techprimers.springboot.swaggerexample.resource;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotBlank;

import io.swagger.annotations.ApiModelProperty;

public class Abc {
	
	@NotNull
    private int id;

    @NotBlank
    @Size(min = 1, max = 20)
    private String firstName;

  /*  @NotBlank
    @Pattern(regexp ="[SOME REGULAR EXPRESSION]")
    private String lastName*/;

    @Min(0)
    @Max(100)
    private int age;

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@ApiModelProperty(required = true, value = "Nome da lista", 
		    dataType="java.lang.String", 
		    allowableValues="range[-infinity, 100]" )
	
	private String stringField;
	private int numberField;;
	public String getStringField() {
		return stringField;
	}
	public void setStringField(String stringField) {
		this.stringField = stringField;
	}
	public int getNumberField() {
		return numberField;
	}
	public void setNumberField(int numberField) {
		this.numberField = numberField;
	}
	
}
