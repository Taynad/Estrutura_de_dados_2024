//para exibir no terminal chamamos o node e o nome do arquivo
//exemplo: node app.ks
console.log("Olá Mundo!");

//variáveis em JS não precisa declarar o tipo pois ele já interpreta
let nome = "Tayna";
let idade = 20;
let altura = 1.58;
let vazio

//criando objeto dentro do JS
let objeto = {
    "nome": "Tayna Santos",
    "idade": 20,
    "altura": 1.58
}

let objeto2 ={
    nome,
    idade,
    altura
}

//vazio o valor fica indefinido, o null é nulo pois é um tipo de declaração
console.log("-----------------------------------------------");
console.log(nome, idade, altura, vazio, null, objeto, objeto2);

//usando conchetes VETORES
let modelos = ['Gol', 'Corsa', 'Fusca'];

//usando construtor Array () não fica limitado
let marcas = Array('Chevrolet', 'Ford', 'Fiat');

//definindo um valor fixo através de Array, limitado
let acessorios = new Array (5);

//criando um vetor vazio
let cores = [];

//ou pode ser:
let categoria = new Array();

console.log("-----------------------------------------------");
console.log(modelos);
console.log(marcas);
console.log(acessorios);
console.log(cores);
console.log(categoria);

//exibindo ou recuperando o elemento do vetor
console.log("-----------------------------------------------")
console.log(modelos[0]);
console.log(modelos[1]);
console.log(modelos[2]);

//colocando o vetor dentro da variável
let nome_modelos = modelos[0];
console.log("-----------------------------------------------")
console.log(nome_modelos);

//adiciona um novo elemento no final do vetor PUSH
modelos.push('HB20');
console.log("-----------------------------------------------")
console.log(modelos);

//adicionar um elemento no início do vetor UNSHIFT
modelos.unshift('Logan');
console.log("-----------------------------------------------")
console.log(modelos);

//para remover um elemento que está no início da array SHIFT
modelos.shift()
console.log(modelos);

//para remover um elemnto que está no fim da array POP
modelos.pop();
console.log(modelos);

//junta os vetores CONCAT
let frutas = ['Laranja', 'Melância', 'Morango'];
let vegetais = [ 'Batata doce', 'Cenoura', 'Milho'];
let feira = frutas.concat(vegetais);
//exibindo valor
console.log("-----------------------------------------------")
console.log(feira);

//copia superficial da array SLICE
//entra o número anterior EXEM: elemento = 1 e < 3
console.log("-----------------------------------------------")
let frutas_ = ['Laranja', 'Melância', 'Morango', 'Cajú', 'Uva'];
let frutas_sel = frutas_.slice(1,3);
console.log(frutas_sel)

//alterando ou removendo um elemento SPLICE
//o primeiro 1 indica a posição onde o elemento vai ficar
//o segundo é quantos elmentos vai remover 
frutas_.splice(1,1, 'Manga');
console.log(frutas_);

//verificação se todos os elementos existem

let frutas2 = ['Larnja', 'Melancia', 'Morango', 'Uva', 'Cajú']
let existe = frutas.includes('Morango');
 console.log(existe);
