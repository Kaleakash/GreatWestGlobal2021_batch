import React from "react";
import axios from 'axios';      // we installed 
class ProductRetreive extends React.Component {
    constructor(props){
        super(props);
        this.state  = {products:[]}
    }
    loadProductInfo=()=> {
        axios.get("http://localhost:9090/allProducts").
        then(result=>{
            //console.log(result.data);
            this.setState({products:result.data})
        }).catch(error=>console.log(error));
    }
    render(){
        let productRec = this.state.products.map(p=><tr>
            <td>{p.pid}</td>
            <td>{p.pname}</td>
            <td>{p.price}</td>
        </tr>)
        return(
            <div>
                <input type="button" value="click here" onClick={this.loadProductInfo}/>
                <br/>
                <table border="1">
                <thead>
                    <tr>
                        <th>PId</th>
                        <th>PName</th>
                        <th>Price</th>
                    </tr>
                </thead>
                <tbody>
                    {productRec}
                </tbody>
                </table>
            </div>
        )
    }
}
export default ProductRetreive;