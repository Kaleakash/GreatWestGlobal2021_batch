import React from "react";
class Child1 extends React.Component {
        constructor(props){
            super(props);
            this.state = {cname:"Mahesh Kumar",age:21};
            this.props.child1ToParent(this.state.cname);
            // Child1 component set the value 
            sessionStorage.setItem("obj",this.state.age);
        }
        fun=()=> {
            this.props.child1ToParent(this.state.cname);
        }
        render(){

            return(
                <div>
                    <h2>This is child1 component</h2>
                    <p> Id is {this.props.id}</p>
            <p>Parent name is child component {this.props.name}</p>
            <p>Child name is child component is {this.state.cname}</p>
            <p>This is child1 age {this.state.age}</p>
                </div>
            )
        }
}


export default Child1;