import threading
import socket

host = '127.0.0.1'
# host = '192.168.56.1'
port = 55555
nick_name = input("Enter your name:")

try:
    client = socket.socket(socket.AF_INET, socket.SOCK_STREAM)
    client.connect((host, port))
except Exception as e:
    print(e)
    exit()


def receive():
    while True:
        try:
            message = client.recv(1024).decode('ascii')
            if message == 'NICK':
                print(nick_name)
                client.send(nick_name.encode('ascii'))
                pass
            else:
                print(message)
        except Exception as e:
            print("Error occurred!", e)
            client.close()
            break


def write():
    while True:
        try:
            message = f'{nick_name}:{input("")}'
            client.send(message.encode('ascii'))
        except Exception as e:
            print(e)
            break


if __name__ == '__main__':
    receive_thread = threading.Thread(target=receive)
    receive_thread.start()
    write_thread = threading.Thread(target=write)
    write_thread.start()
