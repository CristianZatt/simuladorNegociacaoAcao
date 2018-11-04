# Simulador de Negociações de Ações


## Frontend Vue:

Vue2.js (Vue CLI 3)
Vuetify (visual)
Axios (chamadas de WS)

## Backend Java + Spring boot:

Projeto maven gerado por https://start.spring.io com spring boot 2.1.0 e as dependências Web e JPA


## Estrutura do projeto
SimuladorNegociacaoAcao
├─┬ backend     → modulo backend com spring boot
│ ├── src
│ └── pom.xml
├─┬ frontend    → modulo frontend com vue2.js
│ ├── src
│ └── pom.xml
└── pom.xml     → Maven parent gerenciando os modulos




## Compilar e rodar localmente no Windows
Primeiro instalar o node 11  https://nodejs.org/en/download/

```
npm install --global vue-cli
npm install mvn -g
```

#### Configurar o projeto

```
git clone https://github.com/CristianZatt/simuladorNegociacaoAcao

npm install //instala as dependencias
```

#### Rodando localmente

```
mvn clean install
```

Rodar o app completo (front + back)

```
mvn --projects backend spring-boot:run
```

Em http://localhost:8088/ temos o frontend vue.
Em http://localhost:8080/ temos o backend.


## Desenvolvimento rápido do frontend

Utilizando das ferramentas fornecidas pelo Vue CLI é possível rodar o frontend desacoplado, em um servidor local com hotdeploy para um desenvolvimento mais ágil.

```
cd frontend
npm run dev
```



