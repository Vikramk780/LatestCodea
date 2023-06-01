Feature: Integrtion Modeller
Scenario: verify modeller integration creation
Given user visits integration modeller
Then user creates integrtion with username  "admin" password "x4W@HmmX=xL2" and url "dev129330.service-now.com" and curl "curl -XPOST -H "Content-type: application/json" -d '{"description":"Test Description"}' 'https://$servicenow_instance/api/now/table/incident' -u $username:'$password'" username "admin" servicenow_instance "129330.service-now.com" password "x4W@HmmX=xL2"