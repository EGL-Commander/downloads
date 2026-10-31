# REST API with JSON CRUD

## Import into Eclipse
1. File → Import → Maven → Existing Maven Projects. 2. Select this folder and finish. 3. Right-click project → Maven → Update Project.

## Run
Run `StudentApplication.java` as a Java Application. API base URL: `http://localhost:8080/students`. Use browser for GET; use curl for POST, PUT, DELETE. Example: `curl -X POST http://localhost:8080/students -H "Content-Type: application/json" -d "{\"id\":3,\"name\":\"Neha\",\"course\":\"BCA\"}"`.

## Notes
- Requires a compatible JDK (17 or newer unless noted).
- Keep the supplied data files in the project root unless the source says otherwise.
- If Eclipse shows build errors: check Project → Properties → Java Build Path and ensure the selected JDK is installed.
- For Maven projects, use Maven → Update Project; an internet connection is needed on first dependency download.
