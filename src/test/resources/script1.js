const waitPrimaryButton = document.querySelector(".primary");
const LoadButton = document.querySelector(".Load");
const cover = document.querySelector(".cover");
const DisabledButton = document.querySelector(".disabled");
const waitSecondaryButton = document.querySelector(".secondary");

waitPrimaryButton.style.display = "none";
cover.style.display = "none";
waitSecondaryButton.style.display = "none";

setTimeout(() => {
  waitPrimaryButton.style.display = "block";
}, 3000);

waitPrimaryButton.addEventListener("click", () => {
  waitPrimaryButton.style.display = "none";
  cover.style.display = "block";
  waitSecondaryButton.style.display = "block";

  setTimeout(() => {
    cover.style.display = "none";
    }, 3000);
});

waitSecondaryButton.addEventListener("click", () => {
  alert("Secondary button is clicked");
});
