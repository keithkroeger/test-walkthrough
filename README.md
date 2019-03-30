# Test Example

## General Areas

This repository shows different mechanisms that I've used for testing:
1. Controller class offers a /testLocal uri 
   This is used for Gherkin-based acceptance testing
   The controller utilizes a service to provide data.
   
2. BasicStubUserController is used to call a service provided
   through my actuator-demo project.  (Pretending to use as a consumer of that project.)
   
   The class StubVerifier uses this controller and the
   actuator-demo stubs stored in the 'libs' folder.
   
   You can run the StubVerifier class and see how the
   producer class is stubbed.

## Links
* https://www.baeldung.com/spring-cloud-contract
* https://cloud.spring.io/spring-cloud-static/Finchley.SR2/multi/multi__spring_cloud_contract_stub_runner.html
