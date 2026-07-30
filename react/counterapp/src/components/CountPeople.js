import React, { Component } from "react";

class Counter extends Component {
    constructor(props) {
        super(props);

        this.state = {
            entryCount: 0,
            exitCount: 0
        };
    }

    login = () => {
        this.setState((prev, props) => {
           return {entryCount: prev.entryCount + 1}
        });
    };

    exit = () => {
        this.setState((prev, props) => {
            return {exitCount: prev.exitCount + 1}
        });
    };

    render() {
        return (
            <div
                style={{
                    display: "flex",
                    justifyContent: "space-around",
                    marginTop: "100px"
                }}
            >
                <div>
                    <button onClick={this.login}>Login</button>
                    <span> {this.state.entryCount} People Entered!!!</span>
                </div>

                <div>
                    <button onClick={this.exit}>Exit</button>
                    <span> {this.state.exitCount} People Left!!!</span>
                </div>
            </div>
        );
    }
}

export default Counter;