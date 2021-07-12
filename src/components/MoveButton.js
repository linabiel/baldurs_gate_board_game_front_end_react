import React, {useState, useEffect} from 'react';

function MoveButton({clickLeftButton, clickRightButton, clickDownButton, clickUpButton}) {


    return (
        <>
            <button onClick={clickLeftButton} className="button">Left</button>
            <button onClick={clickRightButton} className="button" >Right</button>
            <button onClick={clickUpButton} className="button">Up</button>
            <button onClick={clickDownButton} className="button">Down</button>
        </>
    )


}

export default MoveButton;