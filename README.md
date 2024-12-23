# Aula4-POO
Armazenando alguns exercícios da faculdade ADS Uninter, Matéria Programação Orientada a Objetos em JAVA.

EXERCÍCIO 1
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

livroDigital.info(); 
Aplicações Didáticas
Este código é ideal para:

Estudantes que desejam praticar POO em Java.
Professores que buscam exemplos simples e didáticos de herança, encapsulamento e polimorfismo.
Desenvolvedores que procuram implementar um sistema básico de gerenciamento de livros e expandi-lo para atender a necessidades mais complexas.

Sinta-se à vontade para adaptar ou estender este projeto! 

EXERCÍCIO 2 - Projeto: Sistema de Ingressos para Eventos
Este projeto em Java implementa um sistema básico para gerenciamento de ingressos, incluindo ingressos comuns e ingressos VIP. O código explora conceitos de Programação Orientada a Objetos (POO), como herança e sobrescrita de métodos, de maneira prática e funcional.

Estrutura do Sistema
Classe Principal:

Contém o método main, que executa o sistema.
Cria instâncias de Ingresso e IngressoVip, exibe suas informações com base nos métodos das respectivas classes.
Classe Ingresso:

Representa ingressos básicos para eventos.
Atributos:
nomeEvento: Nome do evento.
valor: Valor do ingresso.
Métodos:
info(): Exibe os detalhes do ingresso, como nome do evento e valor​(Livro).
Classe IngressoVip:

Subclasse de Ingresso, representando ingressos VIP com valor adicional.
Atributos:
adicional: Valor adicional aplicado ao ingresso.
Métodos:
Sobrescreve o método info() para exibir detalhes do ingresso VIP, incluindo o valor adicional e o valor total​(Livro).
Como Utilizar Este Código
Criação de Objetos:

Instancie um objeto da classe Ingresso para representar ingressos básicos.
Instancie um objeto da classe IngressoVip para ingressos com valor adicional.

Aplicações Didáticas
Prática de POO: Explora herança e sobrescrita de métodos.
Exercício de Extensibilidade: Permite adicionar novos tipos de ingressos facilmente.
Simulação Realista: Demonstra como criar um sistema simples para venda de ingressos.
Sinta-se à vontade para expandir o sistema, adicionando funcionalidades como desconto, quantidade disponível ou integração com bases de dados.









