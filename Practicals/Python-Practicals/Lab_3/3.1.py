# 3.1 creating python dictionary that represents book chapter ( 1 to 8) with nested items
#     representing sections of any book

dict_chapters = {"1 Introduction": ["1.1 Why this Book?",
                                    "1.2 About Real Python",
                                    "1.3 How to use this Book"],
                 "2 Setting Up Python": ["2.1 A Note on Python Versions",
                                         "2.2 Windows",
                                         "2.3 MacOS",
                                         "2.4 Ubuntu Linux"],
                 "3 Your First Python Program": ["3.1 Write a Python script",
                                                 "3.2 Mess thongs up",
                                                 "3.3 Create a Variable",
                                                 "3.4 Inspect values in the Interactive Window"
                                                 "3.5 Leave Yourself Helpful Note"],
                 "4 Strings and String Methods": ["4.1 What is String",
                                                  "4.2 Concatenation,Indexing and slicing",
                                                  "4.3 Manipulate Strings with Methods"],
                 "5 Numbers and Math": ["5.1 Integers and Floating-point numbers",
                                        "5.2 Arithmetic Operators and Expressions"],
                 "6 Functions and Loops": ["6.1 What is a function,Really?",
                                           "6.2 Write your own Function"],
                 "7 Finding and Fixing code Bugs": ["7.1 Use the Debug Control Window",
                                                    "7.2 Squash Some Bugs"],
                 "8 Conditional Logic and Control Flow": ["8.1 Compare values",
                                                          "8.2 Add Some Logic"],
                 "9 Tuples,Lists and Directories": ["9.1 Tuples are immutable Sequences",
                                                    "9.2 Lists are mutable Sequences"]

                 }
print("Book name : PYTHON BASICS\nChapters :\n")
for item in dict_chapters:
    print(item)
    # print("   ", dict_chapters[item])
    for item1 in dict_chapters[item]:
        print("    ", item1)
# print(dict_chapters)
