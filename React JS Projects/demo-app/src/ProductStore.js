import React from "react";
import axios from 'axios';
class ProductStore extends React.Component {
    constructor(props){
        super(props);
        this.state = {pid:0,pname:"",price:0.0}
    }
    changeValue=(event)=>{
        let name = event.target.name;
        let value = event.target.value;
        this.setState({[name]:value});
    }
    storeProduct=(event)=> {
        event.preventDefault();
        console.log(this.state)
        console.log(this.state.pid)
        console.log(this.state.pname)
        console.log(this.state.price);
        let product = this.state;
        //console.log(product);
        axios.post("http://localhost:9090/storeProductInfo",product).
        then(result=>console.log(result)).
        catch(error=>console.log(error));
    }
    render(){
        return(
            <div>
            <h2>Store Product</h2>
            <form onSubmit={this.storeProduct}>
                <label>PId</label>
                <input type="text" name="pid" onChange={this.changeValue}/><br/>
                <label>PName</label>
                <input type="text" name="pname" onChange={this.changeValue}/><br/>
                <label>Price</label>
                <input type="text" name="price" onChange={this.changeValue}/><br/>
                <input type="submit" value="store Product"/>
            </form>
            </div>
        )
    }
}

export default ProductStore;