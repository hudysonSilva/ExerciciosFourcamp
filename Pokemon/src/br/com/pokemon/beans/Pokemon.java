package br.com.pokemon.beans;

public class Pokemon {

    int nivel = 1;
    int idPokemon;
    String nome;
    Tipo tipo;
    //vetor de 18 casas vai do "0" ao "17"

    //String[]tipo = {"normal","fire","water","eletric","grass","ice","fighting","poison","ground","flying","psychic","bug","rock","ghost","dragon","dark","steel","fairy",""};


    String[] ataque = new String[4];
    Genero genero;
    Pokebola pokebola;

    public void CadastroPokemon (){
        Utils util = new Utils();

        //this.idPokemon = util.lerInteiro("ID do pokemon");
        //this.nome = util.lerSring("nome do Pokemon");
        //this.ataque = util.lerVetor(ataque.length /*Tamanho do vetor*/);
        //this.genero =blablabla;
        //this.pokebola = ainda não sei array;
    }
    public Pokemon Bulbasauro(Pokemon pokemon){
        this.nivel = 1;
        this.idPokemon  = 1;
        this.nome = "Bulbasauro";
        this.tipo = tipo.GRASS;

        return pokemon;
    }
    public void Squirtle(){
        this. nivel = 1;
        this.idPokemon  = 4;
        this.nome = "Squirtle";
        this.tipo = tipo.WATER;

    }


}
