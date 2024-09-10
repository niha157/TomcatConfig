<!-- Instructions:
Install and configure SSL/TLS support on Tomcat 10 and automate the configuration as much as possible using Java/Groovy.
Guidelines and Requirements
• The program should be written using Java 11/Groovy 4.0 or higher.
• Use a development environment (IDE, OS platform) of your choice.
• Please commit the solution to a public GIT repository (eg, GITHUB), and let us know the location of the repository (preferably one day prior to your scheduled interview).
Be prepared to
• Present your solution and walk through how you designed, implemented, and tested the program.
• Discuss assumptions you made and challenges you encountered.
A more comprehensive solution is preferred, but the focus is on how you demonstrate your understanding of the solution and defend your design and implementation decisions.
-->
1) Download tomcat 10.
2) Create keystore using the command in terminal
   `keytool -genkey -alias tomcat -keyalg RSA -keystore keystore.jks -storepass password -validity 365 -keysize 2048`
    Enter the requested details to generate keystore.
3) Update groovy script with the server.xml file path and keystore path and run groovy script to reflect server.xml.
4) Start tomcat
5) Deploy helloworld application and restart the server to validate the ssl configuration.

