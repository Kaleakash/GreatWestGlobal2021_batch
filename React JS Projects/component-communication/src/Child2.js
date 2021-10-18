import React from "react";
class Child2 extends React.Component {
        constructor(props){
            super(props);

        }

        render(){

            return(
                <div>
                    <h2>This is child2 component</h2>
                    <p>This is child1 component value 
                        {this.props.name}
                    </p>
                    Child1 age in child2 component is 
                    {sessionStorage.getItem("obj")}
                </div>
            )
        }
}


export default Child2;