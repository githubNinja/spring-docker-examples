# spring-docker-examples
  ## Run the below command to generate the artifact
 *mvn clean package
 
 
 
 ### Steps to setup workspace for this repository
 ## -t flag denotes a docker tag which in this case it's 1.0-SNAPSHOT
  * docker build -t imageName:1.0-SNAPSHOT
 
 
 ### Run the docker container with the below command, -d option is to tell the container to run in background ( detach mode).
  * docker run -d -p 8080:8080 imageName
 
 ### After the container is running execute the below command to test the spring boot app.
 
 * [Run] (http://localhost:8080)
 

      
      
