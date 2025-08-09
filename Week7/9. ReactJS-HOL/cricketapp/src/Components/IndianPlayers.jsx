import React, { Component } from "react";

export default class IndianPlayers extends Component {
  render() {
    return (
      <ul>
        {this.props.players.map((player, index) => (
          <li key={index}>{player}</li>
        ))}
      </ul>
    );
  }
}


