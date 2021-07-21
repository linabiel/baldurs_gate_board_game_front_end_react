import React from 'react';


const CharacterCard = ({heroes}) => {

    if(heroes.length === 0){
        return "loading cards";
    }
  
    const heroItems= heroes[0]

    return (

        <>
        <div id="stat-card">
            <p className="text-character">{heroItems.name}</p>
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