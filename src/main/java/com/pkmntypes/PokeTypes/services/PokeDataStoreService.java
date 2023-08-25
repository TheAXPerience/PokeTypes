package com.pkmntypes.PokeTypes.services;

import java.time.YearMonth;
import java.util.List;
import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pkmntypes.PokeTypes.dataobjects.PokemonResponse;
import com.pkmntypes.PokeTypes.models.PokeDataStore;

import jakarta.transaction.Transactional;

@Service
public class PokeDataStoreService {
  @Autowired PokeDataStoreRepository pokeDataStoreRepository;
  
  @Transactional
  public List<PokemonResponse> getAllByName(String name) {
    List<PokeDataStore> results = pokeDataStoreRepository.findAllBySpecies(name);
    List<PokemonResponse> ret = new ArrayList<PokemonResponse>();
    if (results == null) return new ArrayList<PokemonResponse>();
    for (PokeDataStore store : results) {
      // if the data is from before the start of the month, delete it
      if (store.getDateCreated().isBefore(YearMonth.now().atDay(1).atStartOfDay())) {
        pokeDataStoreRepository.deleteAllInBatch(results);
        return new ArrayList<PokemonResponse>();
      }
      ret.add(store.getResponse());
    }
    return ret;
  }
  
  @Transactional
  public void saveAll(List<PokemonResponse> responses, String name) {
    List<PokeDataStore> stores = new ArrayList<PokeDataStore>();
    for (PokemonResponse response : responses) {
      stores.add(new PokeDataStore(response, name));
    }
    pokeDataStoreRepository.saveAllAndFlush(stores);
  }
}
