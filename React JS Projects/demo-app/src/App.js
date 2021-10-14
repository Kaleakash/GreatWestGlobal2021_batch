import React from 'react';
import Header from './Header';
import Footer from './Footer'
import Employee from './Employee';
import Login from './Login';
import ProductRetreive from './ProductRetreive';
import ProductStore from './ProductStore';
class App extends React.Component{


  render() {


    return(
      <div>
        {/* <Header></Header>
          <div>Welcome to Simple React JS Application</div>
          <Employee></Employee>
        <Footer></Footer> */}
        {/* <Login></Login> */}
        {/* <ProductRetreive></ProductRetreive> */}
        <ProductStore></ProductStore>
      </div>
    )
  }
}

export default App;

