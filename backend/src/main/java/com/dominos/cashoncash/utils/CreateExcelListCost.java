package com.dominos.cashoncash.utils;

import java.io.File;
import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import com.dominos.cashoncash.entities.Cost;
import com.dominos.cashoncash.entities.Store;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class CreateExcelListCost {

  private String filePath;

  public CreateExcelListCost(String filePath) {
    this.filePath = filePath;
  }

  public String getFilePath() {
    return filePath;
  }

  public void setFilePath(String filePath) {
    this.filePath = filePath;
  }

  public List<Cost> readFileExcel(List<Store> ListStore) {

    List<Cost> list = new ArrayList<>();

    try {

      File fileNamePath = new File(filePath);

      FileInputStream file = new FileInputStream(fileNamePath);

      XSSFWorkbook workbook = new XSSFWorkbook(file);
      XSSFSheet sheet = workbook.getSheetAt(0);

      Iterator<Row> rowIterator = sheet.iterator();
      rowIterator.next();

      while (rowIterator.hasNext()) {

        Row row = rowIterator.next();
        Iterator<Cell> cellIterator = row.iterator();

            Cost cost = new Cost();
            list.add(cost);
            while (cellIterator.hasNext()) {

              Cell cell = cellIterator.next();

              switch (cell.getColumnIndex()) {
                  case 0:
                    cost.setDate(cell.getDateCellValue());
                    break;
                  case 1:
                    cost.setAmount(cell.getNumericCellValue());
                    break;
                  case 2:
                    cost.setIdPulse((long) cell.getNumericCellValue());
                    Store newStore = ListStore.stream().filter(s -> s.getIpPulse() == cell.getNumericCellValue()).findFirst().orElse(null);
                    cost.setLoja(newStore);
                    break;

              }

              
            }
      }

      workbook.close();
      file.close();

    } catch (Exception e) {
      e.printStackTrace();
      System.out.println("Arquivo Excel não encotrado!");
    } finally {

    }

    if (list.size() == 0 ) {
      System.out.println("Nenhum valor encontrado!");
    }
    return list;
  }
}
