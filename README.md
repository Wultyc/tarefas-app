# tarefas-app
Componentes de um projeto para gerir as tarefas da casa

# Componentes
O projeto é definido por três componentes principais
 - `UI` construida com react, é responsável por apresentar a informação aos utilizadores
 - `API` construido em java, é responsável por funcionar como backend para a webui
 - `Base de Dados` servidor `PostgreSQL` que irá armazenar a informação persistente da aplicação

# Executar a aplicação
Antes de executar a aplicação necessário ter o `docker` e o `docker compose` instalados na maquina e garantir que existe um ficheiro `.env` na raiz do repositório com todas as variaveis necessários (verificar ficheiro `.env.example` para saber quais são as variaveis necessárias)

Para executar a aplicação utiliza-se o seguinte comando na raiz do repositório
```sh
./run.sh dev
```

Para parar a aplicação utiliza-se o seguinte comando na raiz do repositório
```sh
./run.sh stop
```