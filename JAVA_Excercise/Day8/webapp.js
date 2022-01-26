let http=require(`http`)
let port=9090;
let server=http.createServer((request,Response)=>{
    response.writeHead(200,{"content-type":"text/html"});
    response.write("<h2>welcome to we application</h2>")
    response.end();
   
});
server.listen(port , ()=> console.log("server started here ${port}"));
