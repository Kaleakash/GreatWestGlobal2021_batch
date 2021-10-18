import logo from './logo.svg';
import './App.css';
import React from 'react';
import { Link, Switch,Route } from 'react-router-dom';
import Login from './Login';
import AboutUs from './AboutUs';
import ContactUs from './ContactUs';
import Home from './Home';

class App extends React.Component {
  constructor(props){
    super(props);
  }
  render(){
    return(
      <div>
        <h2>React Router Example!</h2>
        <Link to="login">Login Page</Link>
        <Link to="aboutus">About Us</Link>
        <Link to="contactus">Contact Us</Link>
        <hr/>
        <Route path="/login" component={Login}></Route>
        <Route path="/aboutus" component={AboutUs}></Route>
        <Route path="/contactus" component={ContactUs}></Route>
        <Route path="/home" component={Home}></Route>
      </div>
      

    )
  }
}

export default App;
