const { response } = require("express");
let express=require("express");
let app=express();
let port=9090;
let bodyparser=require("body-parser");
//to extract text and json file to body of the request
app.use([bodyparser.text(),bodyparser.json()]);
app.get('/employee/:id',(request,response)=>{
    console.log(request.params.id)
    let employee={id:100,name:"ravindra",salary:2000}
    response.json(employee);

});
app.post('/employee',(request,response)=>{
    console.log(request.body);
    let content=request.body;
    response.json(content);
});
app.put('/',(request,rsponse)=>{
    let employee={id:100,name:"ravindra",salary:2000}
    response.json(employee)
});
app.delete('/',(request,resonse)=>{
    let employee={id:100,name:"ravindra",salary:2000}
    response.json(employee)
});
app.listen(port,()=>console.log("startig port in:"+port));
