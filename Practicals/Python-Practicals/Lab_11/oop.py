# Lab 11 : Python Mini project to demonstrate use of OOPs concept in Python.
# Title should be different for every individual.

class Library:
    def __init__(self, book_list, name):
        self.booksList = book_list
        self.name = name
        self.lendDict = {}

    def displayBooks(self):
        print(f"We have following books in our library {self.name}")
        for book in self.booksList:
            print(book)

    def lendBook(self, user, book):
        if book not in self.lendDict.keys():
            self.lendDict.update({book: user})
            print("Book database has been updated. You can take the book...")
        else:
            print(f"Book is already being used by {self.lendDict[book]}")

    def addBook(self, book):
        self.booksList.append(book)
        print("Book has been added to the book list")

    def returnBook(self, book):
        self.lendDict.pop(book)


if __name__ == '__main__':
    book_l = Library(['Python', 'Rich Daddy Poor Daddy', 'Matrix', 'C++', 'JAVA'],
                     "Aftab")

    while True:
        print(f"Welcome to the {book_l.name} library. Enter your choice to continue")
        print("1. Display Books")
        print("2. Lend a Book")
        print("3. Add a Book")
        print("4. Return a Book")
        user_choice = input()
        if user_choice not in ['1', '2', '3', '4']:
            print("Please enter a valid option")
            continue

        else:
            user_choice = int(user_choice)

        if user_choice == 1:
            book_l.displayBooks()

        elif user_choice == 2:
            book = input("Enter the name of the book you want to lend:")
            user = input("Enter your name")
            book_l.lendBook(user, book)

        elif user_choice == 3:
            book = input("Enter the name of the book you want to add:")
            book_l.addBook(book)

        elif user_choice == 4:
            book = input("Enter the name of the book you want to return:")
            book_l.returnBook(book)

        else:
            print("Not a valid option")

        print("Press q to quit and c to continue")
        user_choice2 = ""
        while user_choice2 != "c" and user_choice2 != "q":
            user_choice2 = input()
            if user_choice2 == "q":
                exit()

            elif user_choice2 == "c":
                continue
