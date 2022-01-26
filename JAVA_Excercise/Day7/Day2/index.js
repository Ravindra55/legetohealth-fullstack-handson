console.log("hello node its entry point ")
console.log(`bye node exit`)
console.log("nodmon is used to run this program: nodemon indexjs")
let http=require(`http`)
let url=require(`url`)
let port=9090;
let server=http.createServer((request,response)=>{
    //incase if we get "undefined undefined or favicon.ico,then we use if condition...
    if(request.url !=`/favicon.ico`){
      let urlObject=url.parse(request.url,true)
    console.log(urlObject.query.username,urlObject.query.age)
    response.writeHead(200,{"content-type":"text/html"});
    response.write("<h2>welcome to we application</h2>")
    response.end();
    }
    
});
server.listen(port, ()=> console.log(`server started here in ${port}`));
//server.listen(port , ()=> console.log("server started here ${port}"));
