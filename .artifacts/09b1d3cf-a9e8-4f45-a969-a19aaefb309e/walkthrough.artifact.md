# Walkthrough - Atualização de Imagens e Jogos

As imagens e nomes dos jogos foram atualizados com sucesso na tela principal.

## Alterações Realizadas

### Layout
- **Imagem de Destaque**: O card "Fortnite: Chapter 5" agora carrega a imagem `@drawable/fortnite` diretamente pelo XML.
- **Seção Tendências**: Os itens genéricos foram substituídos pelos jogos solicitados:
    - **Rocket League** com imagem `@drawable/rocketleague`.
    - **Fall Guys** com imagem `@drawable/fallguys`.
    - **Hogwats Legacy** com imagem `@drawable/hogwarts`.

### Código
- **MainActivity.java**: O código que carregava a imagem via Glide foi removido, simplificando a lógica e utilizando os recursos locais do projeto.

## Verificação

### Visual
As alterações foram aplicadas ao arquivo [activity_main.xml](file:///Users/senai/AndroidStudioProjects/atividadefabri/app/src/main/res/layout/activity_main.xml). Você pode visualizar as mudanças no Preview do Android Studio.

### Código
O arquivo [MainActivity.java](file:///Users/senai/AndroidStudioProjects/atividadefabri/app/src/main/java/com/example/atividadefabri/MainActivity.java) foi limpo e está pronto para execução.
