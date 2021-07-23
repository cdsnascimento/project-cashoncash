package com.dominos.cashoncash.config;


import java.util.List;

import com.dominos.cashoncash.entities.Cost;
import com.dominos.cashoncash.entities.Store;
import com.dominos.cashoncash.repositories.CostRepository;
import com.dominos.cashoncash.repositories.StoreRepository;
import com.dominos.cashoncash.utils.CreateExcelListCost;
import com.dominos.cashoncash.utils.CreateExcelListStore;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {

  @Autowired
  private StoreRepository storeRepository;

 @Autowired
 private CostRepository  costRepository;

  @Override
  public void run(String... args) throws Exception {

    CreateExcelListStore imp = new CreateExcelListStore("C:\\ws\\dominos\\dados\\Stores.xlsx");
    List<Store> listStore = imp.readFileExcel();
    
    storeRepository.saveAll(listStore);

    CreateExcelListCost impCost = new CreateExcelListCost("C:\\ws\\dominos\\dados\\Costs.xlsx");
    List<Cost> listCost = impCost.readFileExcel(listStore);

    costRepository.saveAll(listCost);
    
  }
}


