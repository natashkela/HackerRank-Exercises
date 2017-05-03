import re
import random
#---------------------------------PART 1------------------------------
#dictionary - needed to find the synonyms 
thesaurus = {
              "happy":["glad",  "blissful", "ecstatic", "at ease"],
              "sad"  :["bleak", "blue",     "depressed"]
            }
#the variable will hold the value of user input
userInput = input("Please enter a sentence to be manipulated: \n");

#print (userInput); if you want to see what it holds uncomment
#sub will make sure that punctuation characters dont mess with the words
#split will split the string anywhere it sees whitespace
words = re.sub("[^\w]", " ",  userInput).split();

# for each word in the line:
for word in words:
  # check is the word in lower case letters is included in the thesaurus keys
  if word.lower() in thesaurus:
    #print the value in uppercase
    upper =  (len(thesaurus[word.lower()])); #upper limit for given key value number
    #random integer from 0 to upper limit(not inclusive! very important!)
    randomNumber = random.randint(0,upper-1);
    #print (randomNumber);
    print (thesaurus.get(word.lower())[randomNumber].upper());
  else:
    #print the word in the sentence as it is
    print (word);
    
