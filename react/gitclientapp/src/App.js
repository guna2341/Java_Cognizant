import React, { Component } from "react";
import GitClient from "./GitClient";

class App extends Component {
  constructor(props) {
    super(props);

    this.state = {
      repositories: []
    };
  }

  componentDidMount() {
    GitClient.getRepositories("techiesyed")
      .then((response) => {
        this.setState({
          repositories: response.data
        });
      })
      .catch((error) => {
        console.log(error);
      });
  }

  render() {
    return (
      <div>
        <h2>GitHub Repositories</h2>

        <ul>
          {this.state.repositories.map((repo) => (
            <li key={repo.id}>{repo.name}</li>
          ))}
        </ul>
      </div>
    );
  }
}

export default App;