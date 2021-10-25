import './App.css';

import React from 'react'
class App extends React.Component {


  render() {

    return(
      <div className="container">
        <h2>Welcome to React JS with bootstrap</h2>
        <p>Welcome to Simple HTML Web Page</p>
        <input type="button" value="Click Here"/>
        <input type="button" value="Click Here" style={{"background-color":"red"}}/>
        <input type="button" value="Click Here" className="buttonClass"/>
        <input type="button" value="Click Here" className="btn"/>
        <input type="button" value="Click Here" className="btn btn-success"/>
        <input type="button" value="Click Here" className="btn btn-primary"/>
        <input type="button" value="Click Here" className="btn btn-secondary"/>
        <input type="button" value="Click Here" className="btn btn-info"/>
        <input type="button" value="Click Here" className="btn btn-warning"/>
        <input type="button" value="Click Here" className="btn btn-dark"/>
        <br/>
        <form className="form-group">
          <label>UserName</label>
          <input type="text" name="user" className="form-control"/><br/>
          <label>Password</label>
          <input type="password" name="pass" className="form-control"/><br/>
          <input type="submit" value="submit" className="btn btn-success"/>
          <input type="reset" value="reset" className="btn btn-info"/>
        </form>
        <br/>
        <table class="table table-striped">
  <thead>
    <tr>
      <th scope="col">#</th>
      <th scope="col">First</th>
      <th scope="col">Last</th>
      <th scope="col">Handle</th>
    </tr>
  </thead>
  <tbody>
    <tr>
      <th scope="row">1</th>
      <td>Mark</td>
      <td>Otto</td>
      <td>@mdo</td>
    </tr>
    <tr>
      <th scope="row">2</th>
      <td>Jacob</td>
      <td>Thornton</td>
      <td>@fat</td>
    </tr>
    <tr>
      <th scope="row">3</th>
      <td>Larry</td>
      <td>the Bird</td>
      <td>@twitter</td>
    </tr>
  </tbody>
</table>
      </div>
    )
  }
}

export default App;