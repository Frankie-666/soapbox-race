# soapbox-race

to build need apache maven and jdk8

https://maven.apache.org/

http://www.oracle.com/technetwork/java/javase/downloads/



build:
mvn clean compile assembly:single

Tools
- linux
- eclipse mars j2ee
- oracle jdk8
- inst2xsd (xmlbeans ubuntu package)



###to run the server use:

###java -Djsse.enableCBCProtection=false -jar soapbox-race-version-jarname.jar your-ip-to-host-xmpp (optional)

example:

###java -Djsse.enableCBCProtection=false -jar soapbox-race-version-jarname.jar 127.0.0.1


to use the client run:


for user1:

soapbox.exe US http://localhost:1337/soapbox/Engine.svc a 1


for user2:

soapbox.exe US http://localhost:1337/soapbox/Engine.svc a 2


for user3:

soapbox.exe US http://localhost:1337/soapbox/Engine.svc a 3


for more users, insert userid in table user
