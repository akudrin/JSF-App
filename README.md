# JSF-Database-App

Java Server Faces Web Application that connects to a Database through Java Database Connectivity (JDBC) 

Based on Udemy course by Chad Darby

IDE: Netbeans 8.2
Language: Java
Framework: JSF
Database: MySQL

This web application can be deployed to many application servers. I deployed it to Payara. In order to deploy it to Tomcat context.xml (see below) file should be created together with META-INF folder where it should be saved.
```Java
<Context>

  <Resource name="jdbc/student" 
  			auth="Container" type="javax.sql.DataSource"
               maxActive="20" maxIdle="5" maxWait="10000"
               username="demo" password="demo" 
               driverClassName="com.mysql.jdbc.Driver"
               url="jdbc:mysql://localhost:3306/student_tracker"/>

</Context>
```

Project is using Data Accessor Object (DAO) and Singleton design patterns. DAO pattern is used to encapsulate the database code to one specific class. This design promotes object reuse so other applications can make use of this helper class. Also it helps to keep database specific code in one place (high cohesion and low coupling). Singleton pattern is a software design pattern that restricts the instantiation of a class to one object. This is useful when exactly one object is needed to coordinate actions across the system.
