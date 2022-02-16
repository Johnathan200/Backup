
var testMessage = "Worked";
let score = 0;
let x = 200 ;
let y = 300;



class One {}
function call() {
    


    if (confirm(testMessage)) {
        alert("Thank you");
    } else {
        alert("Any Feedback?");
    }

}

function ScoreIncreases() {

    score = score + 1;
    console.log(score);

}

function scoreDisplay() {
    alert("your score is "+ score +".");
}


