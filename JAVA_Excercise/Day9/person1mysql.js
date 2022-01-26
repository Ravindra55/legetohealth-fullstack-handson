let app = require("express")();
let bodyParser = require('body-parser');
const { request, response } = require("express");
let mysql = require("mysql");
app.use(bodyParser.json());
let mysqlConnection = mysql.createConnection('mysql://root:root@Localhost:3306/expressCRUD_db?debug=true&charset=BIG5_CHINESE_CI&timezone=-0700');
let port = 9090;
app.listen(port, () => console.log(`Server Running on port : ${port}`));
app.get('/person', (request, response) => {
mysqlConnection.connect((err) => {
if (!err) {
mysqlConnection.query('select * from person', (err, rows, fields) => {
if (!err) {
response.json(rows);
}
else {
console.log(err);
}
});
}
})
});
app.post('/person', (request, response) => {
let data = {id:request.body.id, name: request.body.name, salary: request.body.salary };
mysqlConnection.connect((err) => {
if (!err) {
mysqlConnection.query(`insert into person set ?`, data, (err, rows, fields) => {
if (err) {
throw err;
}
else {
response.json("Inserted successfully");
}
})
}
})
})
app.put('/person/.id', (request, response) => {
mysqlConnection.connect((err) => {
if (!err) {
//let sqlquery = "update person set name = '" + request.body.name + "', salary = '" + request.body.salary + " 'where id =" + request.params.id;
//let sqlquery="UPDATE items SET title='"+req.body.name+"', body='"+req.body.salary+"' WHERE id="+req.params.id;
mysqlConnection.query('update person set name = ?, salary = ? where id = ?',[ request.params.id,request.body.name, request.body.salary], (err, rows, fields) => {
if (err) {
throw err;
}
else {
response.json('Updated');
}
})
}
})
})
app.delete('/person/:id', (request, response) => {
// let id = request.params.id;
mysqlConnection.connect((err) => {
if (!err) {
mysqlConnection.query(`delete from person where id = ?`, [request.params.id], (err, rows, fields) => {
if (err) {
throw err;
}
else {
response.json('Deleted');
}
})
}
})
})

