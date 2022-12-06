import threading
import socket

host = '192.168.149.222'
# host = '127.0.0.1'
port = 55555

server = socket.socket(socket.AF_INET, socket.SOCK_STREAM)
server.bind((host, port))
server.listen()

clients = []
nick_names = []


def broadcast_msg(message):
    for client in clients:
        client.send(message)


def handle(client):
    while True:
        try:
            message = client.recv(1024)
            broadcast_msg(message)
        except Exception:
            index = clients.index(client)
            clients.remove(client)
            client.close()
            nick_name = nick_names[index]
            broadcast_msg(f'{nick_name} left'.encode('ascii'))
            nick_names.remove(nick_name)
            break


def receive():
    while True:
        try:
            client, address = server.accept()
            print(f'connected to {str(address)}')

            client.send('NICK'.encode('ascii'))
            nick_name = client.recv(1024).decode('ascii')
            nick_names.append(nick_name)
            clients.append(client)

            print(f'nick name: {nick_name}')
            broadcast_msg(f'{nick_name} joined the chat'.encode('ascii'))
            client.send("connected to server".encode('ascii'))
            thread = threading.Thread(target=handle, args=(client,))
            thread.start()
        except Exception as e:
            print(e)


if __name__ == '__main__':
    print(f"server is running on {host}:{port}   ...")
    receive()
    pass
