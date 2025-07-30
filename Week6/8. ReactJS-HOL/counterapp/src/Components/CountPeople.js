import React from "react";

class CountPeople extends React.Component {
    constructor() {
        super();
        this.state = {
            entrycount: 0,
            exitcount: 0,
            c: 0
        };
    }
    updateEntry() {
        this.setState((prevState, props) => {
            return { entrycount: prevState.entrycount + 1 }
        });
    }
    updateExit() {
        this.setState((prevState, props) => {
            return { exitcount: prevState.exitcount + 1 }
        });
    }
    render() {
        const { entrycount, exitcount } = this.state;

        const boxStyle = {
            display: 'flex',
            justifyContent: 'center',
            alignItems: 'center',
            height: '70vh',
            fontFamily: 'Arial',
            gap: '100px',
        }

        const sectionStyle = {
            padding: '20px',
            textAlign: 'center',
        }

        const buttonStyle = {
            marginRight: '10px',
            padding: '10px 20px',
            backgroundColor: 'lightgreen',
            cursor: 'pointer',
        }

        return (
            <div style={boxStyle}>
                <div style={sectionStyle}>
                    <button style={buttonStyle} onClick={() => this.updateEntry()}>Login</button>
                    <span>{entrycount} People Entered!!!</span>
                </div>
                <div style={sectionStyle}>
                    <button style={buttonStyle} onClick={() => this.updateExit()}>Exit</button>
                    <span>{exitcount} People Left!!!</span>
                </div>
            </div>
        );
    }
}

export default CountPeople;