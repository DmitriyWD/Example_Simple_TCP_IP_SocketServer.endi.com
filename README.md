# Example_Simple_TCP_IP_SocketServer.endi.com

Java Project.
For test TCP/IP connection with client and server

                                                   English

This project - a simple example of a client-server communication over TCP / IP protocol. The project demonstrates how work a simple web application (web server). The project is compiled based on Maven.
Interaction between the client and the server through the library:
-java.net.ServerSocket, java.net.Socket;
-java.io; the variant through (java.nio);

Example run under WINDOWS:

Download the latest version of Java (jre) on your computer.
1. Download the two files to your computer in any folder:
   -Example_Simple_TCP_IP_SocketEchoServer.jar;
   -Example_Simple_TCP_IP_SocketEchoClient.jar;
2. Open this folder.
3. In this folder -> click Shift and without releasing the button Shift -> click on the right mouse button -> and you should see a menu window.
4. select the item "Open command window here".
5. then write the following text at the command prompt (cmd.exe): java -jar Example_Simple_TCP_IP_SocketEchoServer.jar and press ENTER.
6. As a result of a successful launch server writes a message "SERVER RUN".
7. Tezhe actions proceed towards Example_Simple_TCP_IP_SocketEchoClient.jar file, it is important that the client and server are running in separate command prompt windows.
8. As a result of the successful launch of the client writes a message "The server waits for messages from the client" and "Write a message and wait for a server response". Now write the message to the server, and press ENTER server responds to you.

                                                            Russian

Этот проект - простой пример клиент-серверного взаимодействия по протоколу TCP/IP. Проект демонстрирует работу веб приложения (сервера). Проект собран на основе Maven. 
Взаимодействие между клиентом и сервером через библиотеки :
-java.net.ServerSocket, java.net.Socket;
-java.io; возможен вариант через (java.nio);

ПРИМЕР ЗАПУСКА ПОД WINDOWS :

Загрузите последную версию Java (jre) на свой компьютер.
1. Скачайте из папки проекта к себе на компьютер в произвольную папку 2 файла :
   -Example_Simple_TCP_IP_SocketEchoServer.jar;
   -Example_Simple_TCP_IP_SocketEchoClient.jar;
2. Откройте папку с файлами.
3. удерживая Shift нажмите на папке на правую кнопку мыши и вам должно открыться окно меню.
4. выберете пункт "Open command window here".
5. затем в окне командной строки (cmd.exe) напишите следующий текст: java -jar Example_Simple_TCP_IP_SocketEchoServer.jar и нажмите ENTER.
6. Врезультате удачного запуска сервер напишет сообщение "SERVER RUN". 
7. Теже действия проделайте по отношению к файлу Example_Simple_TCP_IP_SocketEchoClient.jar, важно чтобы клиент и сервер были запущены в отдельных окнах командной строки.
8. В результате удачного запуска клиент напишет сообщение "The server waits for messages from the client" и "Write a message and wait for a server response". Теперь пишите сообщение серверу нажимаете ENTER и сервер вам отвечает.







