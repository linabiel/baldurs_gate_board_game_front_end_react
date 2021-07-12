import {useEffect, useState} from 'react';



const ListItem = ({hero}) => {

    return (
        <>
            <li className="text">{hero.name}</li>
            {/* <li>{hero.might}</li>
        <li>{hero.sanity}</li>
        <li>{hero.knowledge}</li>
        <li>{hero.race}</li>
        <li>{hero.age}</li> */}

        </>
    )
}

export default ListItem;