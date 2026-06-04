# Sistema de Processamento de Pedidos com Threads

## Sobre o Projeto

Este projeto foi desenvolvido durante meus estudos de Java Multithreading com o objetivo de praticar conceitos fundamentais de concorrência e paralelismo utilizando a API de Threads do Java.

A aplicação simula uma cozinha de restaurante onde diversos pedidos são processados simultaneamente por cozinheiros representados por Threads.

## Conceitos Praticados

* Thread
* Runnable
* ExecutorService
* FixedThreadPool
* Concorrência
* Processamento assíncrono
* Simulação de tarefas paralelas

## Funcionamento

Cada pedido possui:

* ID
* Nome do prato
* Nome do cliente

Os pedidos são enviados para uma cozinha que possui um número limitado de cozinheiros (Threads).

Quando um pedido chega:

1. Um cozinheiro disponível inicia o preparo.
2. O sistema simula o tempo de preparo.
3. Após a conclusão, o pedido é finalizado.
4. Caso todos os cozinheiros estejam ocupados, o pedido aguarda na fila.

## Tecnologias Utilizadas

* Java
* ExecutorService
* FixedThreadPool
* Programação Concorrente

## Exemplo de Saída

pool-1-thread-1 iniciou o preparo do pedido 1 de David

pool-1-thread-2 iniciou o preparo do pedido 2 de Maria

pool-1-thread-1 finalizou o pedido 1

pool-1-thread-2 finalizou o pedido 2

pool-1-thread-1 iniciou o preparo do pedido 3 de João

pool-1-thread-1 finalizou o pedido 3

## Próximos Passos

Pretendo evoluir este projeto adicionando:

* Callable
* Future
* invokeAll()
* invokeAny()
* BlockingQueue
* SynchronousQueue
* Tratamento avançado de concorrência
* Relatórios de processamento

## Sobre Mim

Sou estudante de Java focado em desenvolvimento Back-End.

Tenho dedicado meus estudos à construção de uma base sólida em:

* Programação Orientada a Objetos
* Estruturas de Dados
* Java Core
* Concorrência e Multithreading
* Boas práticas de desenvolvimento

Este repositório faz parte da minha jornada de aprendizado e evolução constante como desenvolvedor.
