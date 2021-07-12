import React, {useState, useEffect} from 'react';
import ListItem from './ListItem';



const CharacterCard = ({heroes}) => {


    if(heroes.length == 0){
        return "loading cards";
    }
  
    const heroItems= heroes[0]

    // const heroItems = heroes.map((hero, index) => {
    //     return <ListItem hero={hero} key={index} />
    // })


    return (

        <>
        <div id = "stat-card">
            <p className = "text-character" id = "stat-card">{heroItems.name}</p>
            <p className="text-character">Might: {heroItems.might}</p>
            <p className="text-character">Speed: {heroItems.speed}</p>
            <p className="text-character">Sanity: {heroItems.sanity}</p>
            <p className="text-character">Knowledge: {heroItems.knowledge}</p>
            <p className="text-character">Race: {heroItems.race}</p>
            </div>
        
            
        </>
    )



}


export default CharacterCard;