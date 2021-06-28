# Introduction

Project FruitionConsult was developed to give an overview of what test automation framework POC can look like.

# Setup
This framework and test can be set via the following;
1. Zipped file - Download and unzip the file to any folder location of choice. Then using IntelliJ, open the project from the folder location where the project was unzipped to.
2. Github - Access the github url detailed below. Then either download the project or fork the project or request access to clone the project. Save the project into a folder location and use IntelliJ to open the project from that location.
    ```https://github.com/sayoiam/FruitionConsult```
   
# Running the project
This project can be run in any of the twos highlighted below;
1. Using IntelliJ, expand the project structure on the LHS and right-click on the ```Runner``` class and run OR
2. Using the command prompt, ```cd``` to the root of the project in the folder location. Then run the following commands;
   
    a. If one wants to run the project without specifying any environment (This will run the tests in production);
   
   ```mvn test -Dtest=Runner```
   
    b. If one wants to run the project specifying an environment. -Denvironment can take values like ```prod, test, staging```;

   ```mvn test -Dtest=Runner -Denvironment=prod```

# Report

The report of each test run can be viewed online through the url displayed after each run. Copy the url displayed after each run and launch the url in any browser of choice
   
