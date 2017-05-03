import re
#---------------------------------PART 0------------------------------
#dictionary - needed to find the synonyms 
thesaurus = {
              "happy": "glad",
              "sad"  : "bleak"
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
    print (thesaurus.get(word.lower()).upper());
  else:
    #print the word in the sentence as it is
    print (word);
    
