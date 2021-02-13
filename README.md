# spring-docker-examples
 Run the below command to generate the artifact
 mvn clean package
 
 -t flag denotes a Docker tag which in this case it's 1.0-SNAPSHOT
 
 ### Steps to setup workspace for this repository
 docker build -t imageName:1.0-SNAPSHOT
 
 
 ### Run the docker container with the beloww command , -d option is to tell the container in background ( detach mode).
 
 docker run -d -p 8080:8080 imageName
 
 ### After the container is running execute the below command to test the spring boot app.
 
 http://localhost:8080
 

      
      
