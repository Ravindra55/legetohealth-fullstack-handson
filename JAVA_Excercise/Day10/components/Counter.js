import React,{component} from 'react';
import Button from './Button';



export class Counter extends React.component{
    constructor(props){
        super(props)
        //intialize the states
        this.state={likes:0,dislikes:0};
    }
    likesCounter=(event)=>{
        this.setState(prevState=>({likes:prevState.likes+1}));
    }
    dislikesCounter=(event)=>{
        this.setState(prevState=>({didlikes:prevState.dislikes+1}));
    }
    render(){
        return(<div>
            <h2>counter components</h2>
            <p>Like(s):{this.state.likes}</p>
            <p>Dislikes:{this.state.dislikes}</p>
            <button onClick={this.likesCounter}>Likes</button>
            <button onClick={this.dislikesCounter}>Dislikes</button>

        </div>)

    }
}
export default Counter;