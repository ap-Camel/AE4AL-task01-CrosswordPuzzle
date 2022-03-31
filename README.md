# task 01

## task description

Create a program, which will generate crossword puzzle.

The program will work with any word list, e.g.:

https://raw.githubusercontent.com/dwyl/english-words/master/words.zip

It will read the word list into a dynamic data structure, ideally a dynamic array.

Then it will select random word from the word list. This word will be the "solution".

Let's suppose the solution word has N characters.

So your program will then select another N random words, each containing another character from solution.

These words will be used as rows in your crossword puzzle.

Example:



This is a crossword - complete solution.

   |a|way
key|b|oard
  p|o|ke
  s|u|n
   |t|ime

You can think also about generating the final form of the crossword, which would look like this:

   |.|...  to or at a distance from a particular place, person, or thing.
...|.|.... a panel of keys that operate a computer or typewriter.
  .|.|..    (etc.)
  .|.|.
   |.|...

