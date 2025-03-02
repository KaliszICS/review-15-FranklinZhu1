[![Open in Codespaces](https://classroom.github.com/assets/launch-codespace-2972f46106e565e64193e422d61a12cf1da4916b45550586e14ef0a7c637dd04.svg)](https://classroom.github.com/open-in-codespaces?assignment_repo_id=18487652)
# Instructions  

  ## Question
Create a function called goodString.

A string is _good_ if it has the following properties:

    - The length of the string is >=2
    - The first and the last character of the string are identical. .

Your function will be given a string S of length N (N >=2) . You have to make it a _good_ string using the following operations. 

    - Remove a letter from the beginning of the string.
    - Remove a letter from the end of the string.

You can apply the either operation, or both on the string S. Now your task is to find out the minimum number of operations to make the string S a _good_ string.

**Sample Inputs**:

  abcda</br>
  abcdefghiab</br>
  pqr</br>
  bacdefghipalop</br>

**Sample Output**

0</br>
1</br>
-1</br>
4</br>

**Explanations:**

_For 1st test case:_</br>
The string is _abcda_, we don't need to do any operations as the the string is already satisfying the criteria.</br></br>
_For 2nd test case:_</br>
Here we have two options either remove the last _b_ and make the string _abcdefghia_, or remove the first a and make the original string _bcdefghiab_, hence we need only 1 operation.</br></br>
_For 3rd test case:_</br>
No _good_ string could be made</br></br>
_For 4th test case:_</br>
Remove the _b_ from the beginning, remove _p_ , _o_ , _l_ from the end to make the string _abdefghipa_ a _good_ string, hence total no of operations = $1 + 3 = 4$ . 