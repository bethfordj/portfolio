document.addEventListener("DOMContentLoaded", () => {
    const button = document.getElementById("btnSave");
    button.addEventListener("click", addReview);
});

function addReview(event) {
    event.preventDefault();

    const title = document.getElementById("title");
    const reviewer = document.getElementById("reviewer");
    const rating = document.getElementById("rating");
    const review = document.getElementById("review");

    const titleResult = document.querySelector(".titleResult");
    const reviewerResult = document.querySelector(".reviewerResult");
    const ratingResult = document.querySelector(".ratingResult");
    const reviewResult = document.querySelector(".reviewResult");

    titleResult.innerText = title.value;
    reviewerResult.innerText = reviewer.value;
    ratingResult.innerText = rating.value;
    reviewResult.innerText = review.value;
}