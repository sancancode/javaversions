# javaversions


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
