FROM tomcat:8.0
MAINTAINER keydocker
ADD /usr/local/tomcat/webapps/Employee.war /usr/local/tomcat/webapps/
EXPOSE 8080
ENTRYPOINT ["catalina.sh", "run", "/usr/local/tomcat/webapps/Employee.war"]
