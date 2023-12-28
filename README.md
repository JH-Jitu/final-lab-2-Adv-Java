## Lab Task 2: User Management System with RESTful API

### Entities: User

**Attributes:**

1. **Id (int):**

   - Required
   - Not null

2. **Name (varchar2(100)):**

   - Required

3. **Email (varchar2(100)):**

   - Required
   - Should be a valid email address

4. **Date of Birth (date):**

   - Required
   - Must be 18 years old or above

5. **Gender:**

   - Required
   - Allowed values: MALE, FEMALE

6. **Quota (Checkbox):**

   - varchar2(10)
   - Required
   - Default value: "N/A"

7. **Country (Dropdown):**
   - varchar2(100)
   - Required
   - Default value: "Bangladeshi"

**Validation:**

- Use Hibernate Validator to validate all fields.

### RESTful API Endpoints:

1. **Add a New User:**

   - Endpoint: `/users`
   - Method: POST
   - Description: Add a new user.

2. **Update User Record:**

   - Endpoint: `/users`
   - Method: PUT
   - Description: Update user record.

3. **Get All Users:**

   - Endpoint: `/users`
   - Method: GET
   - Description: Get a list of all users.

4. **Get Total Number of Users:**

   - Endpoint: `/users/count`
   - Method: GET
   - Description: Get the total number of users.

5. **Get a Specific User:**

   - Endpoint: `/users/{id}`
   - Method: GET
   - Description: Get details of a specific user identified by `{id}`.

6. **Delete a User:**

   - Endpoint: `/users/{id}`
   - Method: DELETE
   - Description: Delete a specific user identified by `{id}`.

### Lab Task Report:

#### Lab Task Objective:

The objective of this lab task is to create a User Management System with RESTful API endpoints using Spring ORM, Hibernate Core, SpringTX, jackson-databind, and jackson-datatype-jsr310.

#### Implementation Details:

**1. User Entity:**

- Created a `User` entity class with the specified attributes.
- Utilized Hibernate Validator annotations for field validation.

**2. RESTful API Endpoints:**

- Implemented controllers for adding a new user, updating user record, getting all users, getting the total number of users, getting a specific user, and deleting a user.

**3. Validation:**

- Utilized Hibernate Validator for validating the `User` entity fields.

**4. Dependencies:**

- Incorporated Spring ORM, Hibernate Core, SpringTX, jackson-databind, and jackson-datatype-jsr310 for enhanced functionality.

**Conclusion:**

The User Management System with RESTful API endpoints has been successfully implemented. The use of Spring ORM, Hibernate Core, and additional dependencies demonstrates proficiency in building a scalable and efficient system. The RESTful API endpoints provide essential operations for managing user records, and validation ensures data integrity and reliability. This lab task showcases advanced skills in Java programming and the utilization of modern frameworks and libraries.
