# Aula4-POO
Armazenando alguns exercícios da faculdade ADS Uninter, Matéria Programação Orientada a Objetos em JAVA.

Aula 4, exercício 1:
Projeto: Sistema de Gerenciamento de Livros
Este projeto em Java foi desenvolvido para demonstrar e aplicar conceitos fundamentais de Programação Orientada a Objetos (POO) como herança, encapsulamento e polimorfismo. Ele simula um sistema de gerenciamento de livros, abrangendo tanto livros físicos quanto digitais, além de informações sobre seus respectivos autores.

Estrutura do Sistema
Classe Autor:

Representa os autores dos livros, armazenando informações como:
Nome.
Nacionalidade.
E-mail.
Métodos disponíveis:
info(): Exibe todas as informações do autor.
Getters e setters para manipular os atributos​(Autor).
Classe Livro (base):

Classe principal que define os atributos e métodos comuns a todos os livros:
Título.
Autor (associação com a classe Autor).
Gênero.
Edição.
Métodos disponíveis:
info(): Mostra as informações básicas do livro e do autor associado.
Getters e setters para manipular os atributos​(Livro).
Classe LivroDigital:

Herda da classe Livro e adiciona características específicas para livros digitais:
Número de downloads.
Tamanho do arquivo (em MB).
Sobrescreve o método info() para incluir informações adicionais específicas de livros digitais​(LivroDigital).
Classe LivroFisico:

Herda da classe Livro e adiciona atributos exclusivos de livros físicos:
Tiragem (número de cópias impressas).
Peso (em gramas).
Sobrescreve o método info() para incluir informações específicas de livros físicos​(LivroFisico).
Como Utilizar Este Código
Criação de Objetos:

Instancie um objeto da classe Autor para criar um autor com suas informações básicas.
Utilize as classes Livro, LivroDigital ou LivroFisico para criar livros, associando-os a um autor.
Personalização:

Modifique os atributos dos objetos criados utilizando os métodos setters.
Utilize o método info() para exibir os detalhes do autor e do livro.
Exemplo Prático:

java
Copiar código
Autor autor = new Autor("J.K. Rowling", "Britânica", "jkrowling@email.com");
LivroDigital livroDigital = new LivroDigital("Harry Potter", autor, "Fantasia", 1, 1000, 15.5);

livroDigital.info(); 
Aplicações Didáticas
Este código é ideal para:

Estudantes que desejam praticar POO em Java.
Professores que buscam exemplos simples e didáticos de herança, encapsulamento e polimorfismo.
Desenvolvedores que procuram implementar um sistema básico de gerenciamento de livros e expandi-lo para atender a necessidades mais complexas.

Sinta-se à vontade para adaptar ou estender este projeto! 









