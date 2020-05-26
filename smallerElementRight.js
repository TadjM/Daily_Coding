
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
