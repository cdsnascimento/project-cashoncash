package com.dominos.cashoncash.utils;

import java.io.File;
import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import com.dominos.cashoncash.entities.Store;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ImportExcel {
  
  private String  filePaht;

  public ImportExcel() {
  }

  public ImportExcel(String filePaht) {
    this.filePaht = filePaht;
  }

  public String getFilePaht() {
    return filePaht;
  }

  public void setFilePaht(String filePaht) {
    this.filePaht = filePaht;
  }

  public List<Store> listDataExcel() {

    List<Store> list = new ArrayList<>();

    try {

      File file = new File(filePaht);

      FileInputStream workSheet = new FileInputStream(file);
      
      XSSFWorkbook workbook = new XSSFWorkbook(workSheet);
      
      XSSFSheet sheetCost = workbook.getSheetAt(0);

      Iterator<Row> rowIterator = sheetCost.iterator();

      while (rowIterator.hasNext()) {

        Row row = rowIterator.next();
        Iterator<Cell> cellIterator = row.iterator();

        Store store = new Store();
        list.add(store);

        while (cellIterator.hasNext()) {

          Cell cell = cellIterator.next();

          switch (cell.getColumnIndex()) { 
            case 0:
              store.setIpPulse( (long) cell.getNumericCellValue());
              break;
            case 1:
              store.setNameStore(cell.getStringCellValue());
              break;
            case 2:
              store.setAmountCapexPreop(cell.getNumericCellValue());
          }
        }
      }

      workbook.close();
      workSheet.close();

    } catch (Exception e) {
      e.printStackTrace();
      System.out.println("Arquivo Excel não encotrado!");
    }

    if (list.size() == 0 ) {
      System.out.println("Nenhum valor encontrado!");
    }
    return list; 
  }
}
