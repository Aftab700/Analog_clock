import packajlibrary.Books as book_l

# print(l.displayBooks())

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
