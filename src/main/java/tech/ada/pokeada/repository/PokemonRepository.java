package tech.ada.pokeada.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import tech.ada.pokeada.model.Pokemon;

import java.util.List;
import java.util.Optional;

@Repository
public interface PokemonRepository extends JpaRepository<Pokemon, Long> {

 /*
 * Escreva as seguintes buscas utilizando query methods na interface PokemonRepository:

        * Listar Pokémons que a defense maior que o valor informado.
        * Listar Pokémons que o firstType entre uma lista de tipos informados.
        * Listar Pokémons que o specialAttack está entre dois valores informados.
        * Listar Pokémons que o specialAttack é maior ou igual que o valor informado.

    * Escreva também buscas utilizando query nativa na interface PokemonRepository:

    * Obter Pokémon pelo nome.
 * */

    Optional<List<Pokemon>> findByDefenseGreaterThanEqual(Integer defense);

    Optional<List<Pokemon>> findByFirstTypeIn(List<String> FirstType);

    Optional<List<Pokemon>> findBySpecialAttackBetween(Integer de, Integer ate);

    Optional<List<Pokemon>> findBySpecialAttackGreaterThanEqual(Integer specialAttack);

    @Query(nativeQuery = true, value = "SELECT * FROM POKEMON P WHERE P.NAME = ?")
    Optional<List<Pokemon>> findByNameNative(String nome);

    @Query(nativeQuery = false, value = "SELECT P FROM Pokemon P WHERE P.name = :nome")
    Optional<List<Pokemon>> findByNameJPQL(String nome);




}
