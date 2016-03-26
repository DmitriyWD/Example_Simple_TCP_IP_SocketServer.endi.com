# Example_Simple_TCP_IP_SocketServer.endi.com

Test Java Project.
For test TCP/IP connection with client and server

Этот проект - простой пример клиент-серверного взаимодействия по протоколу TCP/IP. Проект демонстрирует работу веб приложения (сервера). Проект собран на основе Maven. 
Взаимодействие между клиентом и сервером через библиотеки :
-java.net.ServerSocket, java.net.Socket;
-java.io; возможен вариант через (java.nio);

ПРИМЕР ЗАПУСКА ПОД WINDOWS :
ПЕРЕД ЗАПУСКОМ ПРОЕКТА ПРОВЕРЬТЕ НА ВАШЕМ КОМПЬЮТЕРЕ НАЛИЧИЕ jre ВЕРСИИ 1.8.0 И ВИШЕ;

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







