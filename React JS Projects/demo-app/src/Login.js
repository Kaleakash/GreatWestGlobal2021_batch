import React from "react";
class Login extends React.Component {
    constructor(props){
        super(props);
        this.state = {user:"",pass:""}
    }
    changeValue=(event)=> {
        let name = event.target.name;
        let value = event.target.value;
       // console.log(name+" "+value);
       this.setState({[name]:value});   // change user and password 
    }
    checkValue = (event)=> {
        event.preventDefault();     // disable action of form
        //console.log("event fired")
        let user = this.state.user;
        let pass = this.state.pass;
        if(user=="Raj" && pass =="123"){
            console.log("Successfully Login")
        } else {
            console.log("Failure try once again")
        }
        
    }
    render() {
        return(
            <div>
                <h2>Login Page</h2>
                <form onSubmit={this.checkValue}>
                 <label>UserName</label>
                 <input type="text" name="user" onChange={this.changeValue}/><br/>
                 <label>Password</label>
                 <input type="password" name="pass" onChange={this.changeValue}/><br/>
                <input type="submit" value="submit"/>
                <input type="reset" value="reset"/>
                </form>
            </div>
        )
    }
}

export default Login;