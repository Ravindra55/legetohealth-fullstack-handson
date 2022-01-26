/*const { on } = require('events');
const { isObject } = require('util');*/

let app=require('express')();
//load the http module to connect the express with server property
let http=require("http").Server(app);
//load the socket.io module & connect with  http using app(line 1)
let io=require("socket.io")(http);
//load the client http and connet to this server
app.get('/',(request,response)=>{
    response.sendFile(__dirname+"/socket_client.html");
})
http.listen(9090,()=>console.log("server running in 9090"));
//handle the messages from client and also send recieve to theclient
io.on("connection",(socket)=>{
    console.log("client is connected to te server:"+socket.connected);
    //socket wants to send the data to client
    socket.on("client message",(msg)=>{
        socket.emit("message key",msg);
    });
});
