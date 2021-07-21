package com.dominos.cashoncash.utils;

// import java.io.File;
// import java.io.FileInputStream;
// import java.util.ArrayList;
// import java.util.Iterator;
// import java.util.List;

// import com.dominos.cashoncash.entities.Cost;
// import com.dominos.cashoncash.entities.ListExcel;
// import com.dominos.cashoncash.entities.Store;

// import org.apache.poi.ss.usermodel.Cell;
// import org.apache.poi.ss.usermodel.Row;
// import org.apache.poi.xssf.usermodel.XSSFSheet;
// import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ImportExcel {
  
  // private String  filePaht;

  // public ImportExcel() {
  // }

  // public ImportExcel(String filePaht) {
  //   this.filePaht = filePaht;
  // }

  // public String getFilePaht() {
  //   return filePaht;
  // }

  // public void setFilePaht(String filePaht) {
  //   this.filePaht = filePaht;
  // }

  // public void listDataExcel() {

  //   List<? super ListExcel>  list = new ArrayList<>();

  //   try {

  //     File file = new File(filePaht);

  //     FileInputStream workSheet = new FileInputStream(file);
      
  //     XSSFWorkbook workbook = new XSSFWorkbook(workSheet);
      
  //     XSSFSheet sheetCost = workbook.getSheetAt(0);

  //     Iterator<Row> rowIterator = sheetCost.iterator();

  //     String fileName = file.getName();

  //     while (rowIterator.hasNext()) {

  //       Row row = rowIterator.next();
  //       Iterator<Cell> cellIterator = row.iterator();

  //       switch (fileName) {
  //         case "Store":

  //           Store store = new Store();

  //           list.add(store);

  //           while (cellIterator.hasNext()) {

  //             Cell cell = cellIterator.next();
    
  //             switch (cell.getColumnIndex()) { 
  //               case 0:
  //                 store.setIpPulse( (long) cell.getNumericCellValue());
  //                 break;
  //               case 1:
  //                 store.setNameStore(cell.getStringCellValue());
  //                 break;
  //               case 2:
  //                 store.setAmountCapexPreop(cell.getNumericCellValue());
  //                 break;
  //             }

  //           }
  //           break;
  //         case "Cost":

  //           Cost cost = new Cost();
          
  //           list.add(cost);

  //           while (cellIterator.hasNext()){

  //             Cell cell = cellIterator.next();

  //             switch (cell.getColumnIndex()) {
  //               case 0:
  //                 cost.setIdPulse( (long) cell.getNumericCellValue());
  //                 break;
  //               case 1:
  //                 cost.setDate(cell.getDateCellValue());
  //                 break;
  //               case 2:
  //                 cost.setAmount(cell.getNumericCellValue());
  //             }
  //           }
  //           break;
  //       }

  //     }

  //     workbook.close();
  //     workSheet.close();

  //   } catch (Exception e) {
  //     e.printStackTrace();
  //     System.out.println("Arquivo Excel não encotrado!");
  //   }

  //   if (list.size() == 0 ) {
  //     System.out.println("Nenhum valor encontrado!");
  //   }
    
  // }


  // public List<Store> returnListStore(List<? extends ListExcel> source, List<?> destiny){

  //   for (ListExcel list : source) {
  //     destiny.add(list)
  //   }

  //   return null;
  //}
}
