# InterviewQuestion
=================
Hello!  Welcome to the Comcast Silicon Valley Test Engineering interview question repo.  Your task is to pick whichever of the interview questions below suits your interest and code up a working solution within 24hrs.  Your instructions are as follows

# Instructions
=================
1. Create a new repo under your personal org in github with the name / number of the question you choose to implement in the name of the org
2. Implement the solution in whatever language you want (we prefer Java but if you are more comfortable in another language please feel free)
3. Submit the URL of the repo to your comcast recruiters for review by our team
 
# Questions
=================
## 1 - Stock Trader app
Create a stock trader application which buys and sells fixed amounts of stock at random intervals from a fictitious REST-ful endpoint (please define the endpoint as you see fit in order to make your application work - bonus points for using RAML)
## 2 - Meme sorter and scorer
Read in a list of internet memes from a json file on the classpath (you choose the memes!).  Create one method which takes the list of memes and sorts them by name.  Create a second method which associates a "lulz" score (from 1-10) with each meme and writes the updated values to the same json file. 
## 3 - Taxperson
Calculate the total cost of an item including tax based on whether it is considered a necessary or luxury item. The tax rate for basic necessities is 1%, the tax rate for luxury items is 9%. For simplicity of implementation, all transactions are measured in cents (pennies).
## 4 - Better File System
Create a program that will mimic a file system.Your file system should be capable of performing the following tasks:
 1. Create a new folder - Takes a parameter of absolute folder path
 2. Create a new file - Take a parameter of absolute file path
 3. Add content to a file - Take 2 parameters: Content to append to a file; Absolute path to a file
 4. Copy files - Takes 2 parameters: Absolute path to a source file; Absolute path to a destination file (NOTE: If destination file exists, it will be overwritten)
 5. Display file contents - Takes absolute path to a file as an input; Prints out file contents as an output
 6. List folder contents - Takes absolute path to a folder as an input; Prints out folder contents as an output
 7. Search for a file by name - Takes name of a file to find; Prints out list of absolute paths to files with matching names
 8. Search for a file by name - Takes 2 parameters: Absolute path to a starting folder and file name; Outputs list of absolute paths to files with matching names
 9. (Optional) Copy folders - Takes 2 parameters: Absolute path to source folder, Absolute path to destination folder
 
Your program should be capable of executing commands similar to this:
 1. mkdir /someName
 2. create /file1
 3. create /someName/file1
 4. write "Some text" /file1
 5. cat /file1
 6. cp /file1 /someName/file2
 7. find file2 (Should return all found locations for file2)
 8. find /someName file2
 9. ls /someName
 10. cp /someName /copyFolder
 
Your program should also handle error cases. Here are some examples:
 1. Creating a file in a non-existent folder
 2. Appending text to a non-existent file
