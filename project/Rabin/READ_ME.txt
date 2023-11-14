READ ME
1. Open All projects(driver,vehicle,schedule,core,eureka) in intellij 
2. build core project by using "mvn install" command
3. build other projects by using "mvn install" command
4. run eureka project for service registry and check wheather it is on port 8761 (localhost:8761)
6. run other projects and check on eureka registry by localhost:8761
	all with be running on different ports 8080, 8081, 8082
7. open postman and import json collections for each services or 
	for vehicle service can open swager url (localhost:8080/swagger-ui.html)
8. Test collections in postman by following order
	-Driver Collection
	-Vehicle Collection
	-Schedule Collection

Thanks 