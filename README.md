# microservices-gateway-architecture
This is a microservices communication between two companies Developed By **Gbenga Ogunkuade**


## Functionality

CompanyA
- Has an internal Discovery service running that does service discovery for all internal microservices
- Has an API Gateway that protects the identity of the internal microservices
- The API Gateway routes both internal and external API request to the appropriates internal microservices
- CompanyB can only connect directly to the API Gateway and not the internal microservices 

CompanyB
- Also has similar architecture
- An internal Discovery service running that does service discovery for all its internal microservices

Other features to be added...




