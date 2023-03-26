# javaversions

Java Version Features
This project demonstrates how to use Thymeleaf to display the features of multiple Java versions and how to add Spring Security to authenticate access to the web page.

Technologies Used
Java 
Spring Boot 
Thymeleaf
Spring Security
Maven
Getting Started



To get started with this project, follow these steps:

Clone the repository:
git clone https://github.com/sancancode/javaversions.git
Open the project in your favorite IDE.
Build the project with 'mvn clean install'

Run the application:

mvn spring-boot:run

Open a web browser and go to http://localhost:8096 to view the Login page.


To log in to the application, click on the "Login" link in the navigation bar and enter the credentials for the pre-configured user.

Username: user
Password: password

Once logged in , The page will prompt you to enter an earlier version number and later version to view all the features added after earlier version upto latest version.

To log out, click on the "Logout" link in the navigation bar.


Acknowledgments
This project was inspired by the Spring Boot Thymeleaf Tutorial on Baeldung.
The security configuration was adapted from the Spring Security Form Login Example on Baeldung.
