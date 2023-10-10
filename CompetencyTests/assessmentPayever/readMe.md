Esta API realiza operações de Inserção(POST), Deleção(DELETE), Seleção(GET);

 url  POST: http://localhost:3000/api/users
 url  GET: http://localhost:3000/api/user/:id
 url  DELETE: http://localhost:3000/api/user/:id

Nela inserimos um usuario com nome, senha e avatar(picture)...

Para realizar o insert é necessario selecionar o arquivo para inserir o avatar no user, isso no postman...

Quando inserimos um new user, a pasta de uploads recebe a imagem no qual o user escolheu..

Lembrando que para inserir um user, inserimos como form-data o campo key colocamos name, password e file, 
e seus respectivos Values como Text, Text e File

1 - POST /api/users ---- Task realizada
    On the request store the user entry in db. After the creation, send an email and rabbit event. Both can be dummy sending (no consumer needed).

2 - GET /api/user/{userId} ---- Task realizada
    Retrieves data from https://reqres.in/api/users/{userId} and returns a user in JSON representation.

3 - GET /api/user/{userId}/avatar ---- Task incompleta
    Retrieves image by 'avatar' URL.
    On the first request it should save the image as a plain file, stored as a mongodb entry with userId and hash. Return its base64-encoded representation.
    On following requests should return the previously saved file in base64-encoded. representation (retrieve from db).

4 - DELETE /api/user/{userId}/avatar ---- Task parcialmente realizada
    Removes the file from the FileSystem storage.
    Removes the stored entry from db.

Use prerequisites below:
- use TypeScript 3.4 and above. -- Não utilizei typeScript
- use NestJS Framework, https://docs.nestjs.com/ -- Não utilizei NestJs
- use MongoDB 4.4 and above -- Utilizei
- use RabbitMQ 3.7 and above -- Não utilizei RabbitMQ

Recursos utilizados:
- Node.js
- Express
- Mongoose
- Nodemon ("Para testes")
- Multer
- MongoDB ATLAS (lembrando que qualquer ip pode acessar o banco)

Para conectar no banco utilizei a string "mongodb+srv://kauaAlmeida:vsc3kZzudVMph7z4@apirestpayever.xw222qt.mongodb.net/?retryWrites=true&w=majority"
com o user: kauaAlmeida
e password: vsc3kZzudVMph7z4
nome do banco: apirestpayever

Para mais informações sobre recursos acesse o json "package.json"

Espero que gostem da API, acredito que provavelmente existem pontos a melhorar, e o motivo pelo qual não utilizei alguns recursos pedidos
foi por falta de experiência, mas não é algo que não possa ser resolvido com estudo e dedicação..

Estou aguardadando o retorno... Agradeço



