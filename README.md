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
Run the application:

mvn spring-boot:run
Open a web browser and go to http://localhost:8096 to view the Login page.

The page will prompt you to enter an earlier version number to view the features of that version and the subsequent versions up to the latest version.

To log in to the application, click on the "Login" link in the navigation bar and enter the credentials for the pre-configured user.

Username: user
Password: password
Once you're logged in, you can view the Java version features page.

To log out, click on the "Logout" link in the navigation bar.

License
This project is licensed under the MIT License. See the LICENSE file for more information.

Acknowledgments
This project was inspired by the Spring Boot Thymeleaf Tutorial on Baeldung.
The security configuration was adapted from the Spring Security Form Login Example on Baeldung.

About the project : 

        This project is to show differences between two java versions.

Built with : 

        JDK 11, Spring Boot, Maven, Git, Eclipse, ReST, Junit, Mockito, sl4j, jacoco

About the API : 

          URL

                http://localhost:8080/versionchanges/{versionEarlier}/{versionLater}
          Method:

                GET 

          URL Params

      
                  Required:

                  versionEarlier=[String]

                  versionLater=[String]


          Success Response:

                 New features added description
                  Code: 200
          

Building,  running tests and test coverage :

    Build with Maven. Use command 'mvn clean install'
    
  

     Tests run with command 'mvn  test'.
