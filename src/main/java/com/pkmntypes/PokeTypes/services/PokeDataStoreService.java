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
  public List<PokeDataStore> getAllByName(String name) {
    List<PokeDataStore> ret = pokeDataStoreRepository.findAllByName(name);
    if (ret == null) return new ArrayList<PokeDataStore>();
    for (int i = ret.size() - 1; i >= 0; i--) {
      // if the data is from before the start of the month, delete it
      if (ret.get(i).getDateCreated().isBefore(YearMonth.now().atDay(1).atStartOfDay())) {
        pokeDataStoreRepository.deleteAllInBatch(ret);
        return new ArrayList<PokeDataStore>();
      }
    }
    return ret;
  }
  
  @Transactional
  public void saveAll(List<PokemonResponse> responses, String name) {
    List<PokeDataStore> stores = new ArrayList<PokeDataStore>();
    for (PokemonResponse response : responses) {
      response.setName(name);
      stores.add(new PokeDataStore(response));
    }
    pokeDataStoreRepository.saveAllAndFlush(stores);
  }
}
