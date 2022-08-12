# Shered Preferences
Atividade proposta na aula de Android para aprimoramento dos conhecimentos em Kotlin utilizando Shared Preferences.

No Android, existem diversas opções de armazenamento, conhecidas como Storage Options, dentre essas opções, temos a Shared Preferences que nos permite armazenar valores primitivos, como por exemplo, booleans, floats, ints, longs e Strings a partir de uma chave, por exemplo: chave: ja_abriu_app, valor: true.

- Na 1° Tela foi criado uma tela de login. Caso o valor de login seja diferente de AlunoCotemig e a senha diferente de 987654 apresentará uma mensagem de erro limpando os campos e focando no campo de login para adicionar novos valores. Caso os valores inseridos passem na condicional irá chamar a segunda tela.

- A 2° tela é uma tela de cadastro onde ao clicar no botão "ADD" os valores inseridos serão salvos no shared preferences e clicando no botão "LOAD" os ultimos dados cadastrados serão retornados nos textviews do canto inferior da tela.