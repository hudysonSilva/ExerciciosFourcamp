package br.com.pokemon.beans;

public class PokemonExemplo {

    int nivel = 1;
    int idPokemon;
    String nome;
    String tipo;
    String[] ataque = new String[4];
    Genero genero;
    Pokebola pokebola;

    public Pokemon Bulbasauro(Pokemon pokemon){
        this.nivel = 1;
        this.idPokemon  = 1;
        this.nome = "Bulbasauro";
        this.tipo = "Folha";
        //this.genero = "Masculino";
        //this.pokebola = ;

        return pokemon;
    }
    public Pokemon Squirtle(Pokemon pokemon){
        this. nivel = 1;
        this.idPokemon  = 4;
        this.nome = "Squirtle";
        this.tipo = "Agua";
        //this.genero = "Masculino";
        //this.pokebola = ;

        return pokemon;
    }
}