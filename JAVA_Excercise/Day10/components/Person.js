import React,{Component} from "react";

class Person extends Component{
    constructor(props){
        super(props);
        this.state={name:"",age:'',phno:''}
       this.handleChange=this.handleChange.bind(this)
        this.handleSubmit=this.handleSubmit.bind(this)
    }
    handleSubmit(event){
        const {name,age,phno}=this.state 
        event.preventDefault()
        alert(`------your details------\n
         name:${name},age:${age},phno:${phno}`)
    }
    handleChange(event){
        this.setState({[event.target.name]:event.target.value})
    }
    render(){
        return (
            <form onSubmit={this.handleSubmit}>
                <div>
                   
                    <input type="text" name="name"
                        value={this.state.name}
                        onChange={this.handleChange}
                    />
                </div>
                <div>
                    
                    <input type="text" name="age"
                        value={this.state.age}
                        onChange={this.handleChange}
                    />
                </div>
                <div>
                   
                    <input type="text" name="phno"
                        value={this.state.phno}
                        onChange={this.handleChange}
                    />
                </div>
                <div>
                    <button>OK</button>
                </div>

            </form>
        )
    }

}

export default Person;