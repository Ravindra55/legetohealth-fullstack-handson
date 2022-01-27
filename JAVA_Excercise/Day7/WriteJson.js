let fs=require("fs");
let users=require("./Users");
let newuser={
    name:"jaga",age:25
};

users.push(newuser);
fs.writeFile("Users.json",JSON.stringify(users),err =>{
    if(err) throw err;
    console.log("writing completed ");
});