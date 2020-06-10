function restaurant(a,b,t){
    let rejected = 0;
    let singles = [];
    let doubles = [];
  
    for (let i = 0; i < a; i++) {
      singles.push(1);
    }
    for (let i = 0; i < b; i++) {
      doubles.push(2);
    }
  
    t.forEach(customer => {
      if(customer === 1) {
        if(singles.length) {
          singles.pop()
        } else if (doubles.length) {
          doubles.pop()
          singles.push(1)
        } else {
          rejected = rejected + customer
        }
      }
      if(customer === 2){
        if(doubles.length){
           doubles.pop()
        }
        else{
            rejected = rejected + customer
        }
      }
      
    });
  
    //add error handling for edge case in array
  
    return rejected;
  }
  
  console.log(restaurant(1, 2, [1,2,1,1]));
  console.log(restaurant(1, 1, [1,1,2,1]));
  console.log(restaurant(97, 37, [1,1,2,2,1,2,2,2,2,2,2,2,2,2,2,2,2,2,1,2,2,1,2,1,2,2,1,1,2,2,1,2,1,1,1,2,2,1,1,1,1,1,2,1,2,2,1,1,1,2,2,1,1,1,1,2,2,2,1,2,2,1,2,1,2,2,2,2,2,1,1,1,2,1,2,1,1,2,2,1,1,1,2,2,2,1,2,2,2,1,2,2,1,1,1,2,1,2,1,2,1,1,1,2,2,2,2,1,2,2,1,2,2,2,2,2,1,2,2,1,1,1,2,1,2,1,2,2,1,1,2,1,2,2,2,2] ));
  console.log(restaurant(0, 2, [1,1,2]));
