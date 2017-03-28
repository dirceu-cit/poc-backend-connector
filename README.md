## USING SAP-CONNECTOR LIBRARY

Put your sap jars in the src/main/webapp/WEB-INF/lib directory and generate the war file with `mvn install` command, or run it with `mvn tomcat:run` command. After that you can exercise the StepByStepClient via a HTTP GET request accessing http://localhost:8080/SpringMVC/browse to test the connection.

Note: this is a just a poc to understand what we should do to eliminate the mulesoft layer from the architecture

Work in progress