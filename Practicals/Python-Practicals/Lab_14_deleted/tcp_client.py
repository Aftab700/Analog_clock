import socket as soc
import threading as thread
import os
import pyfiglet
os.system("cls")
os.system("color 6")
title = pyfiglet.figlet_format("TCP CHAT\n")
print(title)
# ip = input("ENTER THE YOUR IP ADDRESS HERE : ")
ip = "127.0.0.1"

# port = int(input("ENTER THE YOUR PORT NUMBER HERE : "))
port = 5501


skt1 = soc.socket(soc.AF_INET, soc.SOCK_STREAM)
# skt1.bind((your_ip, your_port))
# skt1.listen()

# client, address = skt1.accept()
skt1.connect((ip, port))

def recieve_msg():
    while True:
        os.system("color 5")
        msgRcv = skt1.recvfrom(1024)
        if msgRcv[0].decode() == "quit" or msgRcv[0].decode() == "bye bye" or msgRcv[0].decode() == "exit":
            print("NOW YOUR FRIEND GOES OFFLINE!")
            os._exit(1)
        print("\nYOUR FRIEND'S MSG: " + msgRcv[0].decode())


def send_msg():
    while True:
        data = input().encode()
        msgSent = skt1.send(data)
        print("You: ", data.decode())
        if data.decode() == "quit" or data.decode() == "bye bye" or data.decode() == "exit":
            os._exit(1)


t1 = thread.Thread(target=send_msg)

t2 = thread.Thread(target=recieve_msg)

t1.start()
t2.start()
