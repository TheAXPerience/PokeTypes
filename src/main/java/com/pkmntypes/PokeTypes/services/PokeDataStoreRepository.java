package com.pkmntypes.PokeTypes.services;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.pkmntypes.PokeTypes.models.PokeDataStore;

@Repository
public interface PokeDataStoreRepository extends JpaRepository<PokeDataStore, Long> {
  public List<PokeDataStore> findAllByName(String name);
}
