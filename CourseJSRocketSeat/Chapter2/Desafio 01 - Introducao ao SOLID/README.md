## Rotas da aplicação

### POST `/users` [x]

A rota deve receber `name`, e `email` dentro do corpo da requisição para que seja possível cadastrar um usuário.

### PATCH `/users/:user_id/admin` [x]

A rota deve receber, nos parâmetros da rota, o `id` de um usuário e transformar esse usuário em admin.

### GET `/users/:user_id` [x]

A rota deve receber, nos parâmetros da rota, o `id` de um usuário e devolver as informações do usuário encontrado pelo corpo da resposta.

### GET `/users` [x]

A rota deve receber, pelo header da requisição, uma propriedade `user_id` contendo o `id` do usuário e retornar uma lista com todos os usuários cadastrados. O `id` deverá ser usado para validar se o usuário que está solicitando a listagem é um admin. O retorno da lista deve ser feito apenas se o usuário for admin.