import React from 'react';
import './App.css';
import Child1 from './Child1';
import Child2 from './Child2';

class App extends React.Component {
  constructor(props){
    super(props);
    this.state = {pname:"Raj Deep",childName:""};
  }
  callbackFun = (data)=> {
      this.setState({childName:data});
  }
  render(){
    return(
      <div>
        <h2>This is parent component</h2>
        <p>Parent Name is {this.state.pname}</p>
        <p>Child Name is parent component is {this.state.childName}</p>
        <hr/>
        <Child1 id="100" name={this.state.pname}
        child1ToParent={this.callbackFun}></Child1>
        <hr/>
        <hr/>
        <Child2 name={this.state.childName}></Child2>
        <hr/>
        <br/>
      </div>
    ) 
  }
}

export default App;
