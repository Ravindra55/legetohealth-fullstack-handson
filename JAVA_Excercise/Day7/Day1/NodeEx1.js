let x=10;
let y=20;
var z=x+y;
console.log(`z=${z}`);
setTimeout(()=>{
    console.log(`this is in side a timeout bock`);
},1000)
console.log(`last lne of program`);
setTimeout(()=>{
    console.log(`this is second timeout bloc`);
},100)
console.log(`this is also last line of this code`);