 
 
 
 function replaceNounPhrases(sentence, pronouns, dictionary){
    var finalSentence;
    var sentence = sentence.split(" ");
    var i = 0;   

    for (var j = 0; j < sentence.length; j++) {

        
        if (dictionary[sentence[j]] === 'aux' || dictionary[sentence[j]] === 'adj'){
           if (pronouns.length != 1)
               delete sentence[j];
           else {
              if ((dictionary[sentence[j+1]] === 'N' || dictionary[sentence[j+1]] === 'adj') && sentence[j] !== sentence[j-1])
                 delete sentence[j];
           }
        } 
        else if(dictionary[sentence[j]] === 'N' ){
            sentence[j] = (pronouns[i]);
            i++;
        }
        
    }
    finalSentence = sentence.filter(Element => typeof(Element) !== undefined);

    console.log(finalSentence.join(" "));

}





let dictionary = {
    'a': 'aux',
    'the': 'aux',
    'girl' : 'N',
    'cookie' : 'N',
    'big' : 'adj',
    'tall' : 'adj',
    'scary' : 'adj'
  }

  replaceNounPhrases("a girl", ["she"], dictionary);
  replaceNounPhrases("a girl ate the cookie", ["she", "it"], dictionary);
  replaceNounPhrases("a a a big big a cookie", ["it"], dictionary);
  replaceNounPhrases("a scary girl", ["she"], dictionary);
  replaceNounPhrases("a big tall scary girl ate the big cookie", ["she", "it"], dictionary);

//   describe("Sample tests", ()=> {
//     Test.assertEquals(replaceNounPhrases("a girl", ["she"], dictionary),"she");
//     Test.assertEquals(replaceNounPhrases("a girl ate the cookie", ["she", "it"], dictionary),"she ate it");
//     Test.assertEquals(replaceNounPhrases("a a a big big a cookie", ["it"], dictionary),"a a a big big it");
//     Test.assertEquals(replaceNounPhrases("a scary girl", ["she"], dictionary),"she");
//     Test.assertEquals(replaceNounPhrases("a big tall scary girl ate the big cookie", ["she", "it"], dictionary),"she ate it");
//   })