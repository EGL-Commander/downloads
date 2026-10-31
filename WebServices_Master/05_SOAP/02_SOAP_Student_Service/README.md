# SOAP student information service

## Import into Eclipse
1. File → Import → Maven → Existing Maven Projects. 2. Select this folder and finish. 3. Right-click project → Maven → Update Project.

## Run
Run `StudentServer.java`, then open `http://localhost:8081/students?wsdl`. This is a lightweight JAX-WS SOAP service that demonstrates the student-details service pattern; it avoids requiring a separately installed Tomcat/Axis2 server.

## Notes
- Requires a compatible JDK (17 or newer unless noted).
- Keep the supplied data files in the project root unless the source says otherwise.
- If Eclipse shows build errors: check Project → Properties → Java Build Path and ensure the selected JDK is installed.
- For Maven projects, use Maven → Update Project; an internet connection is needed on first dependency download.
