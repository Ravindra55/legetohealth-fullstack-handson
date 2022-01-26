let express=require("express")
let app=express();
//let app=require(`app`)
let port=9090;
app.get('/',(reqest,response)=>{
    response.send("get method will exeeecutd")
});
app.post('/',(request,response)=>{
    response.send("post method will be executed")
});
app.put('/',(equest,response)=>{
    response.send("put method will be executed")
});
app.delete('/',(request,response) =>{
    response.send("dlete method will be executed")
});
app.listen(port,()=>console.log("listen to port:"+port))

