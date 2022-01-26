const { response } = require("express");
let express=require("express");
let app=express();
let port=9090;
let bodyparser=require("body-parser");
//to extract text and json file to body of the request
app.use([bodyparser.text(),bodyparser.json()]);
app.get('/api/employee:id',(request,response)=>{
    console.log(request.params.id)
    let employee={id:100,name:"ravindra",salary:2000}
    response.json(employee);

});
app.post('/employee',(request,response)=>{
    let p=request.params;//extract from the path..
    let employee={id:p.id,name:p.name,salary:p.salary}
});
app.put('/',(request,rsponse)=>{
    let employee={id:100,name:"ravindra",salary:2000}
    response.json(employee)
});
app.delete('/',(request,resonse)=>{
    let employee={id:100,name:"ravindra",salary:2000}
    response.json(employee)
});
app.listen(port,()=>console.log("listing port number:"+port));
