import re
import random
#---------------------------------PART 2------------------------------
#for this to work file downloaded should be named dictionary.txt, therefore the thesaurus dictionary given in part 2 should be renamed to this - dictionary.txt
f = open('dictionary.txt', 'r') #opens the file
thesaurus = {} #created a dictionary named thesaurus
for line in f: #on every line of the file
    list = line.split(','); # get a list by splitting on every coma
    k = list[0]; # we know that first element is the key
    list.pop(0); #lets delete the first element so only values are left
    values = list; #values will be equal to list
    thesaurus[k] = values #and the key that we just got will be equal to values that we also jsut got

f.close() #close the file and go on with program

#the variable will hold the value of user input
userInput = input("Please enter a sentence to be manipulated: \n");

#print (userInput); if you want to see what it holds uncomment
#sub will make sure that punctuation characters dont mess with the words
#split will split the string anywhere it sees whitespace
words = re.sub("[^\w]", " ",  userInput).split();
sentenceToPrint='';
# for each word in the line:
for word in words:
  # check is the word in lower case letters is included in the thesaurus keys
  if word.lower() in thesaurus:
    #print the value in uppercase
    upper =  (len(thesaurus[word.lower()])); #upper limit for given key value number
    #random integer from 0 to upper limit(not inclusive! very important!)
    randomNumber = random.randint(0,upper-1);
    #print (randomNumber);
    #We do this because I did not want it to switch the lines, but it still does
    #+= sign adds to the already existing sentence 
    sentenceToPrint+= thesaurus.get(word.lower())[randomNumber].upper()+" ";
  else:
    #print the word in the sentence as it is
    sentenceToPrint+= word+" ";
print (sentenceToPrint);
    
