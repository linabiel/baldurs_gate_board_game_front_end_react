import React from 'react';

function MoveButton({clickLeftButton, clickRightButton, clickDownButton, clickUpButton}) {


    return (
        <>
            <button onClick={clickLeftButton} className="btn-grad">Left</button>
            <button onClick={clickRightButton} className="btn-grad" >Right</button>
            <button onClick={clickUpButton} className="btn-grad">Up</button>
            <button onClick={clickDownButton} className="btn-grad">Down</button>
        </>
    )


}

export default MoveButton;