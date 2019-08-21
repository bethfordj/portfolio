let allItemsIncomplete = true;
const pageTitle = 'My Shopping List';
const groceries = [
  { id: 1, name: 'Oatmeal', completed: false },
  { id: 2, name: 'Milk', completed: false },
  { id: 3, name: 'Banana', completed: false },
  { id: 4, name: 'Strawberries', completed: false },
  { id: 5, name: 'Lunch Meat', completed: false },
  { id: 6, name: 'Bread', completed: false },
  { id: 7, name: 'Grapes', completed: false },
  { id: 8, name: 'Steak', completed: false },
  { id: 9, name: 'Salad', completed: false },
  { id: 10, name: 'Tea', completed: false }
];

/**
 * This function will get a reference to the title and set its text to the value
 * of the pageTitle variable that was set above.
 */
function setPageTitle() {
  const title = document.getElementById('title');
  title.innerText = pageTitle;
}

function completedClicks() {
  const groceryList = document.querySelector('.shopping-list ul');

  groceryList.addEventListener('click', () => {
    event.target.classList.add('completed');
  });

  groceryList.addEventListener('dblclick', () => {
    event.target.classList.remove('completed');
  });
}

function markAll() {
  let clicks = 0;
  const theButton = document.getElementById('toggleAll');
  const allGroceriesOnList = document.querySelectorAll('li');

  theButton.addEventListener('click', () => {
    clicks++;


    if(clicks % 2 === 0) {
      for(let i = 0; i < allGroceriesOnList.length; i++) {
        allGroceriesOnList[i].classList.remove('completed');
        theButton.innerText = 'Mark All Complete';
      }
    }
    else {
      for(let i = 0; i < allGroceriesOnList.length; i++) {
        allGroceriesOnList[i].classList.add('completed');
        theButton.innerText = 'Mark All Incomplete';
    }
  }

  });
}


/**
 * This function will loop over the array of groceries that was set above and add them to the DOM.
 */
function displayGroceries() {
  const ul = document.querySelector('ul');
  groceries.forEach((item) => {
    const li = document.createElement('li');
    li.innerText = item.name;
    const checkCircle = document.createElement('i');
    checkCircle.setAttribute('class', 'far fa-check-circle');
    li.appendChild(checkCircle);
    ul.appendChild(li);
  });
}

setPageTitle();
displayGroceries();
completedClicks();
markAll();