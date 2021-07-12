import React, {useState, useEffect} from 'react';
import AttackButton from '../components/AttackButton';
import CharacterCard from '../components/CharacterCard';
import MoveButton from '../components/MoveButton';
import TextBox from '../components/TextBox';
import DiceRoll from '../components/DiceRoll';
import CharacterStats from '../components/CharacterStats';
import TileDisplayPic from "../components/TileDisplayPic";
import GameCard from "../components/GameCard";
import Board from "../components/images/Board_removebg.png";
import Logo from "../components/images/logo.png";
import "../components/css/main.css";
import "../components/css/text-box.css";


function GameBox() {

    const [heroes, setHeroes] = useState([])
    const [scroll, setScroll] = useState([])
    const [omenCardShuffle, setOmenCardShuffle] = useState([])
    const [startGame, setStartGame] = useState([])
    const [characterPosition, setCharacterPosition] = useState([])


    useEffect(() => {
        fetchHeroesApi()
        fetchScroll()
        fetchShuffledOmenCard()
        fetchStartGame()
    }, [])

    const fetchStartGame = function () {
        fetch("http://localhost:8080/api/start")
            .then(response => response.text())
            .then(startGame => setStartGame(startGame))
    }

    const fetchShuffledOmenCard = function () {
        fetch("http://localhost:8080/api/cards")
            .then(response => response.json())
            .then(omenCardShuffle => setOmenCardShuffle(omenCardShuffle))
    }

    const moveCharacterLeft = function () {
        fetch("http://localhost:8080/api/move/1")
            .then(response => response.text())
            .then(characterPosition => setCharacterPosition(characterPosition))
    }
    const moveCharacterRight = function () {
        fetch("http://localhost:8080/api/move/2")
            .then(response => response.text())
            .then(characterPosition => setCharacterPosition(characterPosition))
    }
    const moveCharacterUp = function () {
        fetch("http://localhost:8080/api/move/3")
            .then(response => response.text())
            .then(characterPosition => setCharacterPosition(characterPosition))
    }
    const moveCharacterDown = function () {
        fetch("http://localhost:8080/api/move/4")
            .then(response => response.text())
            .then(characterPosition => setCharacterPosition(characterPosition))
    }

    const clickLeftButton = function () {
        moveCharacterLeft();
        fetchShuffledOmenCard();
    }

    const clickRightButton = function () {
        moveCharacterRight();
        fetchShuffledOmenCard();
    }

    const clickUpButton = function () {
        moveCharacterUp();
        fetchShuffledOmenCard();
    }

    const clickDownButton = function () {
        moveCharacterDown();
        fetchShuffledOmenCard();
    }

    const fetchHeroesApi = function () {
        fetch("http://localhost:8080/api/heroes")
            .then(response => response.json())
            .then(heroes => setHeroes(heroes))
    }

    const fetchScroll = function () {
        fetch("http://localhost:8080/api/scroll")
            .then(response => response.text())
            .then(data => setScroll(data))
    }

    return (
        <>
            <main id="main">



                <div id="tile-display">
                    <img src ={Logo} alt="image of Betrayal at Baldurs Gate"></img>
                </div>

                <div id="middle-layer">
                    <TextBox characterPosition = {characterPosition} />
                    <CharacterCard heroes={heroes} />
                    <GameCard omenCardShuffle={omenCardShuffle} />
                </div>

                <div id="bottom-layer">
                    <MoveButton className="button" clickLeftButton={clickLeftButton} clickRightButton={clickRightButton} clickDownButton={clickDownButton} clickUpButton={clickUpButton} />
                    <AttackButton className="button" />
                    <DiceRoll id="dice-roll" />
                </div>

                <div>
                    <img src={Board} class = "map"></img>
                </div>

            </main>
        </>
    )

}

export default GameBox;