package com.masai.service;

import java.util.List;

import com.masai.exception.DuplicateResourceException;
import com.masai.exception.ResourceNotFoundException;
import com.masai.exception.ValidationException;
import com.masai.model.Employee;

/**
 * The EmployeeService interface provides methods for managing employee records.
 * It defines operations for retrieving, creating, updating, and deleting
 * employee data.
 */
public interface EmployeeService {

	/**
	 * Retrieves a list of all employees.
	 *
	 * @return A list of Employee objects representing all employees.
	 */
	List<Employee> getAllEmployees();

	/**
	 * Retrieves an employee by their unique identifier (ID).
	 *
	 * @param id The ID of the employee to retrieve.
	 * @return The Employee object representing the specified employee.
	 * @throws ResourceNotFoundException If the employee with the given ID is not
	 *                                   found.
	 */
	Employee getEmployeeById(Long id) throws ResourceNotFoundException;

	/**
	 * Creates a new employee record.
	 *
	 * @param employee The Employee object representing the new employee to create.
	 * @return The Employee object representing the newly created employee.
	 * @throws DuplicateResourceException If an employee with the same email already
	 *                                    exists.
	 * @throws ValidationException        If there are validation errors in the
	 *                                    employee data.
	 */
	Employee createEmployee(Employee employee) throws DuplicateResourceException, ValidationException;

	/**
	 * Updates an existing employee record by their ID.
	 *
	 * @param id       The ID of the employee to update.
	 * @param employee The Employee object representing the updated employee data.
	 * @return The Employee object representing the updated employee.
	 * @throws ResourceNotFoundException If the employee with the given ID is not
	 *                                   found.
	 * @throws ValidationException       If there are validation errors in the
	 *                                   employee data.
	 */
	Employee updateEmployee(Long id, Employee employee) throws ResourceNotFoundException, ValidationException;

	/**
	 * Deletes an employee record by their ID.
	 *
	 * @param id The ID of the employee to delete.
	 * @throws ResourceNotFoundException If the employee with the given ID is not
	 *                                   found.
	 */
	void deleteEmployee(Long id) throws ResourceNotFoundException;
}
