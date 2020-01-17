# properties-files-task
Our programs will regularly need external information. Sometimes because this information is not available when writing the code, and sometimes because it makes more sense. An example of the latter is configuration. If you put the configuration in the code, you would need to open the project, make changes and recompile the program to change it. You are not able to recompile The Witcher 4 on your computer, but you are able to change the value in some text file that the Witcher reads. Configuration such as graphic settings can be placed in a text file (or database or other external source) and read in the program. Here we will read the data from the external .properties file.

You can read a lot about .properties files on the internet (do it). The subject is simple. The properties file is a simple text file that you save with the extension .properties instead of .txt. Changing the extension does not make this file something else, it is only a sign for the system that we are not talking about any text file. Thanks to this, we can open .txt files automatically in a notebook and .properties files, for example in IntelliJ. In .properties files should be stored in a specific way:

key = value

Sample .properties file:


That's all you need to know about .properties files. You can (and should) create such a file in any text editor. The purpose of this format is easy reading and interpretation of this data by the program, so we will write a program that will read such a file and write its data in a list / table / map.


Create a new project and publish it on Github,
In the project, create a Main class (where everything will happen) and a .properties file with such data as the sample file above. Save it as data.properties.
Create the MyFileReader class in the 'reader' package. This class has one method:
public List <String> readFileLinesList (String path)
This method is to take the path to your .properties file and return a list of lines of text in this file. This can be difficult for you, especially since there are Exceptions. I recommend trying it yourself (Googling 'how to read all file lines in Java'), and if you can't do it, copy this class from the repository where I solved this task (link at the end of the task).
In the Main class in the main method, create a MyFileReader object and use it to read the line from your .properties file. Then read the value of the field from each line (i.e. the value after the '=' sign). Write it down in a letter or table, and if you are ambitious then in the map (HashMap). You can use here methods of the String class such as:
indexOf () - returns the position of a given character / text fragment in this String. You will use this to find where the equals sign is in the line,
substring () - returns a new String that is part of the one on which you call this method. Remember that this method does not modify the String on which you will use it. She only returns a new string with this clipping. In the simplest variant, this method takes the index of the element from which it should cut the text from the original String. Example:
"01234567". Substring (4) will return "4567".
Finally, in the main method, write the values ​​of the extracted data to the console, commemorate the changes and push them to the repo. The link to solve the task will be below (try not to use it unless you really get stuck).
Asterisk quest *. Read about the Properties class on the internet and use it to do the same.

https://github.com/mpowloka/properties

Protip: You will have to enter the file path in this task. You can use an absolute (or full) path such as "C: \\ ProgramFiles \\ mpowloka \\ data.properties" or a relative path (that is, starting from the folder where your project is). The first solution is simpler, but worse because after downloading the code on another computer will break (the path will be different there). If you put the data.properties file in the project folder (just like I put in the solution) then the relative path will in fact be the name of the file "data.properties".
