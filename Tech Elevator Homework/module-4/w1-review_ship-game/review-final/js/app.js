/*
* Add Events and functions to move the Ship and Win the game
*/
// Creates the Grid -- this should only occur after the DOM loads
document.addEventListener('DOMContentLoaded', () => {
    createGrid();

    document.querySelector('body').addEventListener('keydown', (event) => {
        if (event.key === 'ArrowRight') {
            moveShipRight();
        }
        if (event.key === 'ArrowLeft') {
            moveShipLeft();
        }
        if (event.key === 'ArrowDown') {
            moveShipDown();
        }
        if (event.key === 'ArrowUp') {
            moveShipUp();
        }

    });

    document.getElementById('resetButton').addEventListener('click', event => {
        resetGame();
        event.preventDefault();
    });
});

function moveShipRight() {
    const ship = getShipLocation();
    const right = ship.nextElementSibling;
    moveShip(ship, right);
}

function moveShipLeft() {
    const ship = getShipLocation();
    const left = ship.previousElementSibling;
    moveShip(ship, left);
}

function moveShipDown() {
    const ship = getShipLocation();
    const down = getUpperOrLowerElementAtIndex(ship, ship.parentElement.nextElementSibling);
    moveShip(ship, down);
}

function moveShipUp() {
    const ship = getShipLocation();
    const up = getUpperOrLowerElementAtIndex(ship, ship.parentElement.previousElementSibling);
    moveShip(ship, up);
}

function moveShip(shipElement, newElement) {
    if (canMoveToElement(newElement)) {
        if (isWin(newElement)) {
            win();
        } else {
            shipElement.classList.remove('boat');
            newElement.classList.add('boat');
        }
    }
}

function win() {
    const announce = document.querySelector('.announce');
    announce.innerText = 'You Win!';
    announce.classList.add('winText');
    getShipLocation().classList.remove('boat');
}

function isWin(newElement) {
    return newElement.classList.contains('treasure');
}

function canMoveToElement(newElement) {
    return newElement && !newElement.classList.contains('pirate');
}

function getUpperOrLowerElementAtIndex(ship, newElement) {
    let elementAtIndex = null;
    if (newElement != null) {
        const index = Array.from(ship.parentNode.children).indexOf(ship);
        elementAtIndex = newElement.childNodes[index];
    }
    return elementAtIndex;
}

/**
 * Reset the Game
 */
function resetGame() {
    const ship = getShipLocation();
    if (ship != null) {
        ship.classList.remove('boat');
    }

    // Inform the user they can start
    const announce = document.querySelector('.announce');
    announce.innerText = 'Play!';
    announce.classList.remove('winText');

    // Set the starting location of the player and treasure
    const frame = document.getElementById('frame');
    frame.firstElementChild.firstElementChild.classList.add('boat');
    frame.lastElementChild.lastElementChild.classList.add('treasure');

}

function getShipLocation() {
    return document.getElementById('frame').querySelector('.boat');
}

/**
 * Creates the game grid
 */
function createGrid() {
    const frame = document.getElementById('frame');

    // Add Code to create the game grid
    for (let i = 0; i < 10 ; i++) {
        buildRow(frame); 
    }
    resetGame();
}

/**
 * Builds the grid rows
 * @param {element} frame 
 */
function buildRow(frame) {
    const row = document.createElement('div');
    row.classList.add('row');
    frame.insertAdjacentElement('beforeend', row);

   // Add code to create rows
    for (let i = 0; i < 10 ; i++) {
        buildSquare(row, i); 
    }    
}

/**
 * Builds the grid squares 
 * @param {element} row 
 * @param {int} count 
 */
function buildSquare(row, count) {
   // Add code to create the grid Squares
    const square = document.createElement('div');
    square.classList.add('square');
    // Randomly creates pirates, but not on the first elemment
    if (count > 1) {
        if ((Math.floor(Math.random() * 100) + 1) > 85) {
            // Add the pirates here
            square.classList.add('pirate');
        } 
    }
    row.insertAdjacentElement('beforeend', square);
    
}



