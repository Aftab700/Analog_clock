import json
import random
with open("data.json", 'r') as f:
    data = f.read()
    data = json.loads(data)

while True:
    a = input("You:")
    if a == "exit":
        break
    for i in data['intents']:
        # print(i)
        if a.lower() in str(i['patterns']).lower():
            print("Bot:", random.choice(i['responses']))
            break
