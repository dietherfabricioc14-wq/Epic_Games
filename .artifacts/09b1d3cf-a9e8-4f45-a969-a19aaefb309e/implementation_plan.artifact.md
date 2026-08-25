# Atualizar Imagens e Textos na Activity Principal

Este plano descreve as alterações necessárias para atualizar o layout da atividade principal com as imagens locais e os nomes dos jogos corretos na seção de tendências.

## Mudanças Propostas

### Layout

#### [MODIFY] [activity_main.xml](file:///Users/senai/AndroidStudioProjects/atividadefabri/app/src/main/res/layout/activity_main.xml)
- Adicionar `android:src="@drawable/fortnite"` ao `ImageView` do card de destaque.
- Substituir os 3 `include` de `item_game_simple` pela implementação direta do card, personalizada para cada jogo:
    - **Rocket League**: Imagem `@drawable/rocketleague`, texto "Rocket League".
    - **Fall Guys**: Imagem `@drawable/fallguys`, texto "Fall Guys".
    - **Hogwats Legacy**: Imagem `@drawable/hogwarts`, texto "Hogwats Legacy".

### Código Java

#### [MODIFY] [MainActivity.java](file:///Users/senai/AndroidStudioProjects/atividadefabri/app/src/main/java/com/example/atividadefabri/MainActivity.java)
- Remover o carregamento da imagem de destaque via Glide, pois agora ela será carregada diretamente pelo XML a partir dos recursos locais, conforme solicitado.

## Plano de Verificação

### Verificação Manual
- Abrir o layout no Android Studio Preview ou executar o app para garantir que:
    - A imagem de destaque (Fortnite) está aparecendo.
    - A lista de tendências exibe Rocket League, Fall Guys e Hogwarts Legacy com suas respectivas imagens.
