import {useEffect, useState} from 'react';



const CardListItem = ({omenCard}) => {

    return (
        <div>
            <p>{omenCard.name}</p>
            <p>{omenCard.flavourText}</p>


        </div>
    )
}

export default CardListItem;