import logo from './logo.svg';
import './App.css';
import GameBox from './containers/GameBox';
import {useEffect, useState} from 'react';
import 'react-app-polyfill/stable'


function App() {

    return (
        <>
            <GameBox />
        </>
    );

}

export default App;
