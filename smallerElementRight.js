/*
This problem was asked by Google.
Given an array of integers, return a new array where each 
element in the new array is the number of smaller elements 
to the right of that element in the original input array.
For example, given the array [3, 4, 9, 6, 1], return [1, 1, 2, 1, 0].
*/

let smallerElementRight = (Arr)  => {
        var temp = [];

        for(let i = 0; i < Arr.length; i++){
            let counter = 0
            if (i === Arr.length-1){
                temp.push(counter);
            }
            else{
              for (let j = i+1; j< Arr.length; j++){
                    if(Arr[i] > Arr[j]){
                        counter++;
                    }
                }
                
                temp.push(counter);
              }
        }
        console.log(temp)
};
Arr1 = [1,2,3,4,5,6,7,8,9];
Arr = [3,4,9,6,1];
smallerElementRight(Arr);
