# apiclientswagger
Swagger Client

Clone project from: https://github.com/swagger-api/swagger-codegen
Create .jar for modules/swagger-codegen-cli/target/swagger-codegen-cli
		(For example: mvn clean install)
Run the generator with this command:
	java -jar modules/swagger-codegen-cli/target/swagger-codegen-cli.jar generate \
  		-i {URL to swagger.json (/api-docs) Example:} http://petstore/v2/swagger.json \
  		-l {Language.  Example:} java \
  		-o {Directory for Swagger Client. Example:} samples/client/petstore/java
At the path will generate swagger cleint code.
