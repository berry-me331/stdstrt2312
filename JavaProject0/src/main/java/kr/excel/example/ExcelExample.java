package kr.excel.example;

import org.apache.poi.ss.usermodel.*;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class ExcelExample {
    public static void main(String[] args) {
        try{
            FileInputStream file=new FileInputStream(new File("example.xlsx"));
            //파일에서 읽어와야됨. 파일이름 적어줘야됨. 실제 엑셀파일
            //실제 엑셀파일을 메모리에 있는 가상의 엑셀로 만들어야되는데  Workbook이라고 함
            Workbook workbook= WorkbookFactory.create(file);
            Sheet sheet=workbook.getSheetAt(0);
            for(Row row: sheet){
                for(Cell cell: row){
                    System.out.print(cell+"\t");
                }
                System.out.println();//줄바꿈
            }
            file.close();
            System.out.println("엑셀에서 데이터 읽어오기 성공");
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}
