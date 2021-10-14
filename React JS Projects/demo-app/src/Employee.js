import React from 'react';
class Employee extends React.Component {

    constructor(props){
        super(props);
        this.state = {id:100,name:"Ravi",age:21}
        this.changeValue1= this.changeValue1.bind(this); //register 
    }
    changeValue1() {
       // alert("Event fired")
       this.setState({id:101,name:"Ramesh",age:23})
    }
    changeValue2=()=> {
        this.setState({id:102,name:"Raju",age:25})
    }
    render() {
        return(
            <div>
              <p> 
              Id is {this.state.id}, 
              Name is {this.state.name}
              Age is {this.state.age}
              </p>  
              <br/>
              <input type="button" value="Click Here - Normal fun" onClick={this.changeValue1}/>
              <input type="button" value="Click Here - arrow fun" onClick={this.changeValue2}/>
                
            </div>
        )
    }
}

export default Employee;