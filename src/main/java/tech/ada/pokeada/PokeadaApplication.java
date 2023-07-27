package tech.ada.pokeada;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tech.ada.pokeada.model.Pokemon;
import tech.ada.pokeada.repository.PokemonRepository;

import java.util.Arrays;
import java.util.Optional;

@SpringBootApplication
public class PokeadaApplication implements CommandLineRunner {

	private final PokemonRepository repository;

	public PokeadaApplication(PokemonRepository repository) {
		this.repository = repository;
	}

	public static void main(String[] args) {
		SpringApplication.run(PokeadaApplication.class, args);
	}


	@Override
	public void run(String... args) throws Exception {
		/* Teste seu método aqui
			repository.find... */

		// Listar Pokémons que a defense maior que o valor informado.
		//System.out.println(repository.findByDefenseGreaterThanEqual(110));

		//Listar Pokémons que o firstType entre uma lista de tipos informados.
		//System.out.println(repository.findByFirstTypeIn(Arrays.asList("grass", "fire")));

		//Listar Pokémons que o specialAttack está entre dois valores informados.
		//System.out.println(repository.findBySpecialAttackBetween(135, 154));

		//Listar Pokémons que o specialAttack é maior ou igual que o valor informado.
		//System.out.println(repository.findBySpecialAttackGreaterThanEqual(135));

		//Escreva também buscas utilizando query nativa na interface PokemonRepository:
		//Obter Pokémon pelo nome.
		System.out.println(repository.findByNameNative("caterpie"));
		System.out.println("---------");
		System.out.println(repository.findByNameJPQL("caterpie"));
	}
}
