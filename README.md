# spring-docker-examples
  ## Run the below command to generate the artifact
 *mvn clean package
 
 
 
 ### Steps to setup workspace for this repository
 * docker build -t imageName:1.0-SNAPSHOT
 *  [-t flag denotes a docker tag which in this case it's 1.0-SNAPSHOT]
  
  
 ### Run the docker container with the below command, -d option is to tell the container to run in background ( detach mode).
  * docker run -d -p 8080:8080 imageName
 
 ### After the container is running execute the below command to test the spring boot app.
 
 * [Run] (http://localhost:8080)

### Docker compose
To run using docker compose use the below commands to start the container
#### Check if docker compose config is correct
  *docker-compose config

#### Run docker-compose
  *docker-compose up --build


 

      
      
