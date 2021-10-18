import React from 'react';
class Login extends React.Component {
    constructor(props){
        super(props);
        this.state = {user:"",pass:""}
    }
    handleChange = (event)=> {
        let name  = event.target.name;
        let value = event.target.value;
        this.setState({[name]:value})
    }
    handleSubmit= (event)=> {
        event.preventDefault();
        let user = this.state.user;
        let pass = this.state.pass;
        if(user=="Raj" && pass =="123"){
                console.log("success")
                this.props.history.push("home");    // This code is use to move home component with conditions. 
        }else {
                console.log("failure")
        }
    }
    render() {

        return(
            <div>
                <h2>This is Login Component</h2>
                <form onSubmit={this.handleSubmit}>
                  <label>UserName</label>
                  <input type="text" name="user" onChange={this.handleChange}/><br/>
                  <label>Password</label>
                  <input type="password" name="pass" onChange={this.handleChange}/><br/>
                  <input type="submit" value="submit"/>
                  <input type="reset" value="reset"/>  
                </form>
            </div>
        )
    }
}

export default Login;