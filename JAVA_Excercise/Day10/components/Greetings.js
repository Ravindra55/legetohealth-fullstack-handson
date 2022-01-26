import React,{component} from 'react';

export class Hello extends React.component{
    constructor(props){
        super(props);
    }
    render(){
        return(<div>
            <p>Hello{this.props.name}</p>
        </div>)
    }
}
export class Greetings extends React.component{
    constructor(props){
        super(props);
    }
    render(){
        return(<div>
            <p>Greetings{this.props.firstame} {this.props.lastname}</p>
        </div>)
    }
  
}
export default Greetings;