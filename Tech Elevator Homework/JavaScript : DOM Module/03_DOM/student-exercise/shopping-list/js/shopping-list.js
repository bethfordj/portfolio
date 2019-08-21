// add pageTitle
const pageTitle = 'My Shopping List';

// add groceries
const groceries = ['lemon juice','kale','1 green apple','1 tart pear','craisins','candied pecans','goat cheese','squash','pork shoulder','cider'];

/**
 * This function will get a reference to the title and set its text to the value
 * of the pageTitle variable that was set above.
 */
function setPageTitle() {
  const title = document.getElementById('title');
  title.innerText = pageTitle;
}
/**
 * This function will loop over the array of groceries that was set above and add them to the DOM.
 */
function displayGroceries() {

   const ul = document.querySelector('.shopping-list ul');
   
   groceries.forEach(groceryItem => {
       const groceryLi = document.createElement('li');
       groceryLi.innerText = groceryItem;

       ul.insertAdjacentElement('beforeend', groceryLi);
});
}
/**
 * This function will be called wh4en the button is clicked. You will need to get a reference
 * to every list item and add the class completed to each one
 */
function markCompleted() {
  const ul = document.querySelector('.shopping-list ul');

  let currentChild = ul.querySelector('li');
  while(currentChild.nextElementSibling !== null){
    currentChild.setAttribute('class', 'completed');
    currentChild = currentChild.nextElementSibling;
  }
  currentChild.setAttribute('class', 'completed');
}

setPageTitle();

displayGroceries();

// Don't worry too much about what is going on here, we will cover this when we discuss events.
document.addEventListener('DOMContentLoaded', () => {
  // When the DOM Content has loaded attach a click listener to the button
  const button = document.querySelector('.btn');
  button.addEventListener('click', markCompleted);
});
