booksList = ['Python', 'Rich Daddy Poor Daddy', 'Matrix', 'C++', 'JAVA']
name = "Aftab"
lendDict = {}


def displayBooks():
    print(f"We have following books in our library {name}")
    for book in booksList:
        print(book)


def lendBook( user, book):
    if book not in lendDict.keys():
        lendDict.update({book: user})
        print("Book database has been updated. You can take the book...")
    else:
        print(f"Book is already being used by {lendDict[book]}")


def addBook(book):
    booksList.append(book)
    print("Book has been added to the book list")


def returnBook( book):
    lendDict.pop(book)
