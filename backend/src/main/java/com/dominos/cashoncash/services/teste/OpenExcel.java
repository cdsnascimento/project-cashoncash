package com.dominos.cashoncash.services.teste;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import com.dominos.cashoncash.entities.Cost;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class OpenExcel {
  
  public static void main(String[] args) throws IOException {


    List<Cost> listCosts = new ArrayList<>();

    try {

      File file = new File("src/main/resources/basecoc.xlsx");

      FileInputStream workSheet = new FileInputStream(file);
      
      XSSFWorkbook workbook = new XSSFWorkbook(workSheet);
      
      XSSFSheet sheetCost = workbook.getSheetAt(0);

      Iterator<Row> rowIterator = sheetCost.iterator();

      while (rowIterator.hasNext()) {

        Row row = rowIterator.next();
        
        Iterator<Cell> cellIterator = row.iterator();

        Cost cost = new Cost();
        listCosts.add(cost);

        while (cellIterator.hasNext()) {

          Cell cell = cellIterator.next();

          switch (cell.getColumnIndex()) {
            case 0:
              cost.setIdPulse((int) cell.getNumericCellValue());
              break;
            case 1:
              cost.setDtCompetencia(cell.getDateCellValue());
              break;
            case 2:
              cost.setAmount(cell.getNumericCellValue());
              break;
          }
        }
      }

      workbook.close();

      workSheet.close();
      
    } catch (Exception e) {
      e.printStackTrace();
      System.out.println("Arquivo Excel não encotrado!");
    }

    if (listCosts.size() == 0) {
      System.out.println("Nenhum valor encontrado!");
    } else {
      for (Cost cost : listCosts) {
        System.out.println(cost.getIdPulse() + " | " + cost.getDtCompetencia() + " | " + cost.getAmount());
      }
    } 
  }
}
