import mysql.connector

DataBase = mysql.connector.connect(
    host="localhost",
    user="root",
    password="Name@1234",
    database="rsu1916041"
)

# print(DataBase)

Cursor = DataBase.cursor()

# Cursor.execute("CREATE DATABASE rsu1916041")

TableName = '''CREATE TABLE Student
                (
                    Name VARCHAR(255),
                    Mark int
                );'''
# Cursor.execute(TableName)
sql = "INSERT INTO Student (Name, Mark) VALUES (%s, %s)"
val = ("Pushpa", "85")

# Cursor.execute(sql, val)
# DataBase.commit()

sql1 = "INSERT INTO Student (Name, Mark) VALUES (%s, %s)"
val1 = ("Pushpa raj", "91")

# Cursor.execute(sql1, val1)
# DataBase.commit()

update = "UPDATE STUDENT SET Mark = 77 WHERE Name ='Pushpa'"

# Cursor.execute(update)
# DataBase.commit()

delete = "DELETE FROM STUDENT WHERE Name = 'Pushpa raj'"

# Cursor.execute(delete)
# DataBase.commit()

drop_t = "Drop Table if exists student"
# Cursor.execute(drop_t)
# DataBase.commit()

Cursor.execute("SELECT * FROM student")
# Cursor.execute("SELECT * FROM student WHERE Mark =91")

result = Cursor.fetchall()

for x in result:
    print(x)


DataBase.close()
