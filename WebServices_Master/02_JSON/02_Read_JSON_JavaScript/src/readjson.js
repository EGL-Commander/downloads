const fs = require("fs");
const student = JSON.parse(fs.readFileSync("data.json", "utf8"));
console.log("ID:", student.id);
console.log("Name:", student.name);
console.log("Course:", student.course);
