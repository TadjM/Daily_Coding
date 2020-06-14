function encode(string) {
    let a = [];

    for (let i = 0; i < string.length; i++){
        if(string[i] == 'a')
           a.push(1);
        else if(string[i] == 'e')
           a.push(2);
        else if(string[i] == 'i')
           a.push(3);
        else if(string[i] == 'o')
           a.push(4);
        else if(string[i] == 'u')
           a.push(5);
        else
           a.push(string[i])

    }
    return a.join('');
  }
  
  function decode(string) {

    let a = [];

    for (let i = 0; i < string.length; i++){
        if(string[i] == 1)
           a.push('a');
        else if(string[i] == 2)
           a.push('e');
        else if(string[i] == 3)
           a.push('i');
        else if(string[i] == 4)
           a.push('o');
        else if(string[i] == 5)
           a.push('u');
        else
           a.push(string[i])
    }
    return a.join('');
  }

  console.log(encode('hello'));
  console.log(decode('h2ll4'));
  console.log(encode('How are you today?'));