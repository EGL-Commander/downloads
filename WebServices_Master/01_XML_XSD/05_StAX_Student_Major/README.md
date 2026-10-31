# Read XML using StAX

## Import into Eclipse
1. Extract this folder. 2. Eclipse: File → Import → General → Existing Projects into Workspace. 3. Select this folder and finish.

## Run
Run `ReadWithStAX.java`. It streams student IDs and major values without building a DOM tree.

## Notes
- Requires a compatible JDK (17 or newer unless noted).
- Keep the supplied data files in the project root unless the source says otherwise.
- If Eclipse shows build errors: check Project → Properties → Java Build Path and ensure the selected JDK is installed.
- For Maven projects, use Maven → Update Project; an internet connection is needed on first dependency download.
