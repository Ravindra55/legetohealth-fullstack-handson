import React,{component} from 'react';
import { render } from 'react-dom';

export class Simple extends React.Component{
    handleButton=(event)=>{
        console.log("handle event");
        console.log(event);
    }
    render(){
        return(<div>
            <button onClick={(event)=>{console.log(event)}}>Simple Button</button>
            <button onClick={this.handleButton}>Second Button</button>
        </div>)
    }
}
export function Input(){
    render(<div>
        <input type="text" onChange={(event)=>{console.log(event)}}></input>
        <button onClick={(event)=>{console.log(event)}}>Click2</button>
    </div>)

}
function Button(){
    //call back would handle the event
    let handleClick=(event)=>{
        console.log(event);
    }
    return (<div>
        <button onClick={handleClick}>Clik</button>
    </div>)
}

export default Button;
