# Corrigir Erros de Compilação e Visualização no Android

Este plano visa corrigir o erro de compilação que impede a execução do aplicativo e resolver problemas de imagens que não estão aparecendo.

## User Review Required

> [!IMPORTANT]
> A tela de detalhes (`DetailActivity`) estava falhando ao compilar porque o componente `Toolbar` foi removido do XML, mas continuava sendo referenciado no código Java. Vou restaurar o `Toolbar` no XML para manter a funcionalidade de navegação (botão voltar) e corrigir o erro.

##Proposed Changes

### Detalhes do Jogo

#### [MODIFY] [activity_detail.xml](file:///Users/senai/AndroidStudioProjects/atividadefabri/app/src/main/res/layout/activity_detail.xml)
- Restaurar o `Toolbar` dentro do `CollapsingToolbarLayout` para corrigir o erro de compilação e permitir o botão de voltar.

#### [MODIFY] [DetailActivity.java](file:///Users/senai/AndroidStudioProjects/atividadefabri/app/src/main/java/com/example/atividadefabri/DetailActivity.java)
- Remover o código do Glide que tenta carregar a imagem externa (que está dando erro 404). Isso garantirá que a imagem local `@drawable/fortnite` seja exibida corretamente.

### Perfil do Usuário

#### [MODIFY] [ProfileActivity.java](file:///Users/senai/AndroidStudioProjects/atividadefabri/app/src/main/java/com/example/atividadefabri/ProfileActivity.java)
- Remover o código do Glide que tenta carregar o avatar externo (também 404). Isso permitirá que a imagem local `@drawable/perfil` (já configurada no XML) apareça.

## Plano de Verificação

### Testes Automatizados
- Executar `gradle assembleDebug` para garantir que o projeto compile sem erros.

### Verificação Manual
- Abrir a tela de detalhes e verificar se a imagem do Fortnite e o botão de voltar aparecem.
- Abrir a tela de perfil e verificar se a foto do usuário aparece.
