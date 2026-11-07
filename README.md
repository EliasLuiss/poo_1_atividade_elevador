# Elevador (Java POO)

Simulação de um elevador no console, feita para praticar Programação Orientada a Objetos em Java.

## O que o programa faz

O elevador começa no 1º andar, com a porta aberta, e tem 8 andares. Pelo menu é possível:

1. Subir de andar
2. Descer de andar
3. Abrir a porta
4. Fechar a porta
5. Ver o andar atual
6. Ver o status da porta
7. Sair

Regras implementadas:
- O elevador só sobe ou desce com a porta fechada.
- Não sobe além do 8º andar nem desce abaixo do 1º.
- Avisa quando a porta já está aberta ou fechada.

## Conceitos praticados

- Classe `Elevador` com atributos (`andar`, `porta`) e métodos que controlam o estado
- Classe `Main` com menu interativo (`Scanner`, `switch` e `while`)
- Condicionais para validar cada ação

## Como executar

Requer o JDK instalado.

```bash
cd Poo_atividade_elevador/src
javac *.java
java Main
```

Também é possível abrir a pasta `Poo_atividade_elevador` no IntelliJ IDEA e executar a classe `Main`.

## Autor

Elias Luís dos Santos Bierhals · [LinkedIn](https://www.linkedin.com/in/elias-bierhals)
