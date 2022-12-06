from pymongo import MongoClient

client = MongoClient("mongodb://localhost:27017/")

mydatabase = client["admin"]
# a = mydatabase.command("serverStatus")
# print(a)

rec = {
    'title': 'RSU1916041',
    'Name': 'Aftab Sama',
    'data': ['mongodb', 'database', 'NoSQL', "Pushpa"],
    'Lab': 17
}

mydatabase.RSU1916041.insert_one(rec)

mycollection = mydatabase["RSU1916041"]

# r = mycollection.find_one({'Lab': 17}).count()
# print(r)

for i in mycollection.find({'Lab': 17}):
    print(i)

list_of_db = client.list_database_names()
print(list_of_db)

rec1 = {
    'title': 'Doc1',
    'ID': 1
}
rec2 = {
    'title': 'Doc2',
    'ID': 2
}
mydatabase.d1.insert_one(rec1)
mydatabase.d2.insert_one(rec2)
print("Created collections d1,d1")

mydatabase.d1.drop()
mydatabase.d2.delete_many({"title": 'Doc2'})
print("d1 collection drop\nd2 Documents deleted")
rec3 = {
    'id': 12,
    'name': 'a',
    'data': 22
}
mydatabase.RSU1916041.insert_one(rec3)
print(mycollection.find_one({'id': 11}))
print("update ")
mycollection.update_one({'id': 11}, {'$inc': {'data': 22}})
print(mycollection.find_one({'id': 11}))

print("Filtering the Quantities less than 40 using query.")
c1 = mycollection.find({"data": {"$lt": 40}})
for i in c1:
    print(i)

# sorting function
s1 = mycollection.find().sort("data", -1)
for i in s1:
    print(i)

