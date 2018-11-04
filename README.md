# Simulador de Negociações de Ações


## Frontend Vue:

Vue2.js (Vue CLI 3)
Vuetify (visual)
Axios (chamadas de WS)

Vue é um framework javascript que vem ganhamdo muito mercado, dado a sua boa curva de aprendizagem bem como interessante estruturação com componentes, e um CLI bastante útil na geração de projetos frontend.

Vuetify é ma biblioteca desenvolvida para o vue que traz uma estilização maior. Poderia-se comparar a um bootstrap para vue.

Axios é uma biblioteca muito útil e recomendada pela comunidade Vue para executar requisições a WS


## Backend Java + Spring boot:

Projeto maven gerado por https://start.spring.io com spring boot 2.1.0 e as dependências Web, JPA e Rest Repositories

O JPA traz aqui uma integração interessante do projeto com o banco, pois utiliza o hibernate.

## Estrutura do projeto
```
SimuladorNegociacaoAcao
├─┬ backend     → modulo backend com spring boot
│ ├── src
│ └── pom.xml
├─┬ frontend    → modulo frontend com vue2.js
│ ├── src
│ └── pom.xml
└── pom.xml     → Maven parent gerenciando os modulos
```
Vale destacar também o frontend-maven-pluginqu auxilia na gerencia do projeto pelo maven naparte do frontend, uma vez que o Vue CLI não traz em seus padrões o maven como o start.spring.io faz.

## Banco de dados

É preciso ter um banco postgres rodando, com uma base simuladorNegociacaoAcao e com senha !testAPP@

Ao inicializar o prijeto ele irá criar as tabelas nescessárias para seu funcionamento

## Compilar e rodar localmente no Windows
Primeiro instalar o node 11  https://nodejs.org/en/download/
E o java JDK 8.

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

#### Em simuladorNegociacaoAcao\backend\target temos o .jar compilado para o servidor

## Desenvolvimento rápido do frontend

Utilizando das ferramentas fornecidas pelo Vue CLI é possível rodar o frontend desacoplado, em um servidor local com hotdeploy para um desenvolvimento mais ágil.

```
cd frontend
npm run dev
```



