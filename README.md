

importar o banco clientdb no postgres

url base:http://127.0.0.1:8080/client/api/client/client
Segue url dos serviços:

Adiciona clientes
metodo : post
url :http://127.0.0.1:8080/client/api/client/add/{clientName}/{clientEmail}     

obs: clientName e clientEmail são Strings
Lista todos os clientes
metodo : get
url :http://127.0.0.1:8080/client/api/client/listall
Lista cliente pelo id
metodo : get
url :http://127.0.0.1:8080/client/api/client/listclientbyid/{clientId} 
obs: Não da erro mas não retorna dados =(
obs: (clientIdé um int)
deleta um cliente
metodo : delete
url :http://127.0.0.1:8080/client/api/client/remove/{clientId}" 

obs: (clientIdié um int)
