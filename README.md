# Lab 7 - Composição de Classes 

## Aplicações Java 

:dart: Desenvolva os seguintes programas com recurso ao IDE `IntelliJ IDEA`.

:warning: Crie os diferentes exercícios em projetos separadas.

:warning: Não se esqueça de guardar o seu trabalho!  

## Exercícios :pen:

1. Desenvolva um sistema de descontos para um salão de beleza, que fornece serviços e vende produtos de beleza. O salão oferece 3 tipos de membros: *Premium*, *Gold* e *Silver*que usufruem de um desconto de 20%, 15% e 10%, respetivamente, para todos os serviços fornecidos. Clientes que não são membros não têm qualquer tipo de desconto. Todos os membros têm 10% de desconto nos produtos de beleza. 

    O sistema deve permitir calcular o valor total da conta (gastos com produtos e serviços), durante uma visita ao salão.


   - Considerando o diagrama de classes UML abaixo crie a definição das classes correspondentes em código Java.
   
      ![](https://github.com/estsetubal-ipoo-2024-25-labs/Lab7/blob/main/Diagrama_UML.png)
      
      - :warning: A classe `DiscountRate` só contém variáveis e métodos de classe. Fornece os descontos de produtos e serviços para cada tipo de cliente;
      
      - :warning: Considere `typeMember`um valor enumerado que representa o tipo de membros `MemberType`. Os valores possíveis são: `NONE`, `PREMIUM`, `GOLD`, `SILVER`. Inicialmente o valor deste atributo é `NONE`.    
      
      

   - Crie um pequeno programa de teste que teste a estrutura de classes criada e seu funcionamento. Faça variar o tipo de cliente e visualize os diferentes descontos sobre produtos e serviços. 

---

2. Desenvolva um sistema para a gestão de um jornal digital (`Newspaper`). Este sistema deverá permitir, a quem o gere, realizar operações básicas com as notícias, tais como: criar notícia, alterar o conteúdo da noticia, publicar uma notícia, mostrar as notícias que já se encontram publicadas e mostrar as notícias de determinado autor.

   - Crie a classe `News` que representa uma notícia:
   
      **Atributos** (escolha nomes e tipos apropriados):
      
      - ID da notícia (id numérico automático e auto-incrementado);
      - nome do autor;
      - titulo;
      - texto da notícia;
      - data de criação;
      - publicada (sim/não).

      **Métodos**:

     - Construtor com parâmetros para inicializar a instância da notícia. 
        - Qualquer notícia é sempre instanciada _por publicar_.
        - Efetue as validações que considere necessárias.
     - _Getters_ para todos os atributos;
     - _Setters_ para o título e texto da notícia;
     - Um método que represente a ação de publicar a notícia (uma vez publicada, mantém-se publicada);
     - Método `toString`;

   - Crie a classe `Newspaper` que representa um jornal (com um nome) e que armazena as notícias num *array* com um tamanho pré-determinado, definido numa constante (`MAX_NEWS`). Deverá também manter registo do número de notícias efetivamente adicionadas ao array (`size`).

      - Crie um método _privado_ (auxiliar) `News findNewsById(int)`, que retorna uma notícia recebendo como parâmetro o ID  da notícia; se a notícia não existir, retorna `null`. A notícia é pesquisada no *array* de notícias existente. Faça uso deste método nas funcionalidades abaixo, sempre que necessário.

      - Métodos / funcionalidades (métodos que retornam um *booleano*, representam o sucesso da operação):

        - `boolean add(News)` - adicionar uma nova notícia, se houver capacidade para mais notícias;

        - `boolean updateTitle(int, String)` - alterar o título de uma notícia, recebendo como parâmetro o seu ID e o novo título; 

        - `boolean updateText(int, String)` - alterar o texto de uma notícia, recebendo como parâmetro o seu ID e o novo texto;  

        - `boolean publish(int)` - publica uma notícia, dado o seu ID;

        - `Strint toString()` - devolve uma representação textual do jornal, indicando o nome do jornal, o total de notícias e quantas notícias estão publicadas;

        - `String publishedNews()` - devolve o conteúdo do jornal, i.e., as notícias que já foram publicadas. Se não existirem notícias, devolve `"(sem notícias publicadas)"`;

        - `String allNews()` - devolve todas as notícias, quer tenham sido publicadas, ou não. Se não existirem notícias, devolve `"(sem notícias)"`;

        - `String newsByAuthor(String)` - devolve as notícias de um determinado autor, dado o seu nome. Se não existirem notícias desse autor, devolve `"(sem notícias do autor <autor>)"`;

   - O método `main` deverá permitir testar todas as funcionalidades definidas anteriormente; complete o código disponibilizado (ficheiro `Main.java` disponível neste repositório).

---
paula.miranda@estsetubal.ips.pt e bruno.silva@estsetubal.ips.pt

