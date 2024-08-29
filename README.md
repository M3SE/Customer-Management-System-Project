# Customer-Management-System-Project

## Requirements:

1. Project Setup:
- Use the Spring Initializr to create a new Spring project.
- Choose either Maven or Gradle as your build tool. Explain your choice in a README.md file.
- Set up the necessary dependencies for Spring Core, Beans, Context, and Expression Language.

2. Designing the System:
- Create a Customer class with attributes like id, name, email, and contactNumber.
- Annotate the Customer class to make it a Spring bean.

3. IoC and Dependency Injection:
- Create an interface named CustomerService with methods like addCustomer, getCustomer, updateCustomer, and deleteCustomer.
- Implement the interface with a class named CustomerServiceImpl.
- Inside the service, create a mock database using a List<Customer>. (In a real-world scenario, this would be replaced with an actual database).
- Use setter injection to inject the Customer bean into the service.
- Additionally, create another service named NotificationService that will be responsible for sending email notifications. Use constructor injection to inject this into the CustomerServiceImpl.
- Use the @Autowired annotation for dependency injection where needed.

4. Testing the System:
- Create a MainApp class with the main method.
- Use the Spring IoC container to retrieve your CustomerService bean.
- Perform CRUD operations (Create, Read, Update, Delete) on the Customer objects using the service.
- Ensure that when a new customer is added, the NotificationService sends an email (this can be a simple print statement for the sake of this project).

5. Documentation:

- I decided to go with Maven because it was something I've worked with before and know that I will work more efficiently with.
