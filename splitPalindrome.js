/*
    This problem was asked by Google.
    Given a string, split it into as few strings as possible such that each string is a palindrome.
    For example, given the input string racecarannakayak, return ["racecar", "anna", "kayak"].
    Given the input string abc, return ["a", "b", "c"].
*/

let splitPalindrome = (str) => {
    var Arr = [];
    var j = 0;
    for (let i = j+1; i < str.length; i++){
        let char = str[j];
        //console.log(j); 
        if (char === str[i]){
            console.log(i);
            Arr.push(str.substr(j, i+1));
            console.log(j); 
             j = i + 1;
        }
    }

   // console.log(Arr);
};

splitPalindrome("racecarannakayak");
splitPalindrome("abc");