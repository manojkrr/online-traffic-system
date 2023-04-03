# Online Traffic System
This Spring Boot application is designed to simulate an online traffic system, with MySQL as the database management system.

## Prerequisites:

1. JDK 11 or later installed
2. Maven 3.0 or later installed
3. MySQL 5.6 or later installed

## Setup:
1. Clone this repository to your local machine.
2. Create a MySQL database using the provided SQL script in the database directory.
3. Configure the database connection by editing the application.properties file in the src/main/resources directory.
4. Build the application by running mvn package in the project directory.
5. Run the application using java -jar target/online-traffic-system-0.0.1-SNAPSHOT.jar

## Usage:
Open a web browser and navigate to http://localhost:8080.
1. The homepage will display a form to search for a vehicle by license plate number.
2. Enter a license plate number and click "Search".
3. If the vehicle is registered in the database, its information will be displayed.
4. If the vehicle is not registered, an error message will be displayed.
5. To register a new vehicle, click "Register Vehicle" on the homepage.
6. Enter the vehicle's information in the form and click "Submit".
7. The new vehicle will be added to the database and a success message will be displayed.
8. To view a list of all registered vehicles, click "View All Vehicles" on the homepage.
9. A table displaying all registered vehicles will be displayed.




