package com.gl.sowmya.emailapp.service;

import com.gl.sowmya.emailapp.model.Employee;

public interface CredentialService {
 public String passwordGenerator();
 public String emailGenerator(Employee employee, String department);
 public void displayCredentials(Employee employee, String department);
}
