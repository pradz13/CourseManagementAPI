#Add course
Url : localhost:8080/courses
Request Type : POST
Body :
{
	"id":1,
	"title":"Java",
	"description":"Java course"
}

#Get course
Request Type : GET
Url : localhost:8080/courses

#Create Docker Image
docker build -t course-management-api .

#Show images
docker images

#Run image
docker run -p 80:80 course-management-api (use -p for detached)

#Check the list of conatiners
docker container list

#Check the logs of container
docker container logs course-management-ui

#Download Postgres image
docker pull postgres:alpine

#Run Postgres image
docker run --name postgres-2 -e POSTGRES_PASSWORD=password -d -p 5432:5432 postgres:alpine
