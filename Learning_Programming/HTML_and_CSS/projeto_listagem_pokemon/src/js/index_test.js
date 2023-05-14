/*
    O que precisamos fazer? - quando clicarmos no botão de troca de tema temos que alterar a 
    cor do tema da página para as cores do tema claro ou do tema escuro

    - objetivo 1 - quando clicar no botão de troca de tema, adicionar a classe modo-escuro no body pra que os estilos do modo escuro sejam aplicados e mudar a imagem pra lua:
        - passo 1 - pegar no JS o elemento HTML correspondente ao botão de troca de tema
        - passo 2 - dar um jeito de pegar no JS o elemento HTML corresponde ao body
        - passo 3 - dar um jeito de identificar o clique do usuário no botão de troca de tema
        - passo 4 - adicionar a classe modo-escuro no body
        - passo 5 - trocar a imagem do botão de alterar tema pra lua
    
    - objetivo 2 - quando clicar no botão de troca de tema, caso o body já tenha a classe modo-escuro, remover a classe pra mudar pro modo claro e mudar a imagem pro sol:
        - passo 6 - verificar se o body ja tem a classe modo-escuro.
        - passo 7 - remover a classe do modo-escuro do body
        - passo 8 - trocar a imagem do botão de alterar tema pra sol
*/
// objetivo 1 - quando clicar no botão de troca de tema, adicionar a classe modo-escuro no body pra que os 
//estilos do modo escuro sejam aplicados e mudar a imagem pra lua:

//- passo 1 - pegar no JS o elemento HTML correspondente ao botão de troca de tema
//console.log(document.getElementById("botao-alterar-tema"))
// criar variavel camelCase
// console.log(botaoAlterarTema);

const botaoAlterarTema = document.getElementById("botao-alterar-tema");

//- passo 2 - dar um jeito de pegar no JS o elemento HTML corresponde ao body
// seletor pode ser uma classe ou tag etc.
// so digitar log completa auto.
// console.log(body); so tem um body

const body = document.querySelector("body");

const imagemBotaoTrocaDeTema = document.querySelector(".imagem-botao");
// . representa classes, pode ser qualquer seletor e uma classe é um. acima parte do 5. 

//- passo 3 - dar um jeito de identificar o clique do usuário no botão de troca de tema
// () => {} arrow function, seta, () vazio, {} metodo com coisa,
botaoAlterarTema.addEventListener("click", () => {

    //- objetivo 2 - quando clicar no botão de troca de tema, caso o body já tenha a classe modo-escuro, 
    //remover a classe pra mudar pro modo claro e mudar a imagem pro sol:
    //- passo 6 - verificar se o body ja tem a classe modo-escuro.
    //console.log(body.classList.contains("modo-escuro"));

    const modoEscutoEstaAtivo = body.classList.contains("modo-escuro");

    //console.log(modoEscutoEstaAtivo);

    //substitui linhas em ambos if e else, refatorar: melhorar ele, mais legil, menos linhas. 1 faz depois refatora.
    body.classList.toggle("modo-escuro");

    if (modoEscutoEstaAtivo) {

        //- passo 7 - remover a classe do modo-escuro do body
        //body.classList.remove("modo-escuro")

        //- passo 8 - trocar a imagem do botão de alterar tema pra sol

        imagemBotaoTrocaDeTema.setAttribute("src", "./src/imagens/sun.png");

    } else {
        //- passo 4 - adicionar a classe modo-escuro no body
        //console.log(body.classList);

        //body.classList.add("modo-escuro");

        //- passo 5 - trocar a imagem do botão de alterar tema pra lua

        imagemBotaoTrocaDeTema.setAttribute("src", "./src/imagens/moon.png");

    }
    //Apos subir pq tem q ver primeiro em ordem de leitura pelo pc.
    //console.log("clickou no botão");
    //obj 2 subiu, mas estava aqui.
});