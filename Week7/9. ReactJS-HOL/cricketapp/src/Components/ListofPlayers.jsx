import React, { Component } from "react";

export class ListofPlayers extends Component {
  render() {
    return (
      <div>
        <h1>List of Players</h1>
        <ul>
          {this.props.players.map((player, index) => (
            <li key={index}>
              Mr. {player.name} {player.score}
            </li>
          ))}
        </ul>
      </div>
    );
  }
}

export class Scorebelow70 extends Component {
  render() {
    return (
      <ul>
        {this.props.players
          .filter(player => player.score < 70)
          .map((player, index) => (
            <li key={index}>
              Mr. {player.name} {player.score}
            </li>
          ))}
      </ul>
    );
  }
}
