# Sistema de Cursos

Um sistema de cursos desenvolvido utilizando Java com Spring Boot para o backend e React para o frontend. O sistema permite a gestão de cursos, vídeo aulas, atividades e resultados de alunos e professores.

## Tecnologias Utilizadas

- **Backend**: 
  - Java 17
  - Spring Boot
  - H2 Database (para desenvolvimento e testes)
  - Jakarta Persistence (JPA)

- **Frontend**: 
  - React
  - Axios (para chamadas à API)
  - React Router (para gerenciamento de rotas)

## Funcionalidades

- **Gestão de Cursos**: Criação, leitura, atualização e exclusão de cursos.
- **Vídeo Aulas**: Adição e gerenciamento de vídeo aulas associadas a cursos.
- **Atividades**: Criação e avaliação de atividades para os alunos.
- **Resultados**: Armazenamento e consulta de resultados de atividades realizadas pelos alunos.

## Estrutura do Projeto

### Backend

```plaintext
src
└── main
    ├── java
    │   └── com
    │       └── example
    │           └── sistema_cursos
    │               ├── controller
    │               │   ├── ActivityController.java
    │               │   ├── ActivityResultController.java
    │               │   ├── CourseController.java
    │               │   ├── UserController.java
    │               │   └── VideoController.java
    │               ├── model
    │               │   ├── Activity.java
    │               │   ├── ActivityResult.java
    │               │   ├── Course.java
    │               │   ├── User.java
    │               │   └── Video.java
    │               ├── repository
    │               │   ├── ActivityRepository.java
    │               │   ├── ActivityResultRepository.java
    │               │   ├── CourseRepository.java
    │               │   ├── UserRepository.java
    │               │   └── VideoRepository.java
    │               └── service
    │                   ├── ActivityService.java
    │                   ├── ActivityResultService.java
    │                   ├── CourseService.java
    │                   ├── UserService.java
    │                   └── VideoService.java
    └── resources
        └── application.properties
FRONT END
src
└── components
    ├── Activity.js
    ├── Course.js
    ├── Login.js
    ├── Video.js
    └── App.js
public
├── index.html
└── favicon.ico
