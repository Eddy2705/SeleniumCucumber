package com.apparel.qa.testData;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import com.apparel.qa.base.BasePage;

public class readExcel extends BasePage {

	public static List<Map<String,String>> readExcelData(String sheetName,int rowNo) throws IOException {
		//	public static void readExcelData(String sheetName,int rowNo) throws IOException {

		BasePage BP = new BasePage();

		String property = System.getProperty("user.dir");
		System.out.println(property);

		FileInputStream fileIO = new FileInputStream(propFile.getProperty("TestDataExcel"));
		XSSFWorkbook wb = new XSSFWorkbook(fileIO);
		Sheet works = wb.getSheet(sheetName);
		int rowNum = works.getLastRowNum();
		System.out.println(rowNum);
		int colNum = works.getRow(0).getLastCellNum();
		System.out.println(colNum);

		List<Map<String,String>> dataExcel = new ArrayList<Map<String,String>>();

		Map<String,String> cMap = new HashMap<String,String>();
		for(int j=0;j<=colNum-1;j++) {	
			String dataKey = works.getRow(0).getCell(j).getStringCellValue();

			String dataValue = works.getRow(rowNo).getCell(j).getStringCellValue();
			cMap.put(dataKey, dataValue);
		}
		dataExcel.add(cMap);
		
		for(Map<String,String> a: dataExcel) {
			System.out.println(a);
		}


		//----------------------test-------------------------
		//		for(int i=1;i<=rowNum;i++) {
		//			Map<String,String> dataMap = new HashMap<String,String>();
		//			for (int j=1;j<colNum;j++) {
		//				String dataKey = works.getRow(0).getCell(j).getStringCellValue();
		//
		//				String dataValue = works.getRow(i).getCell(j).getStringCellValue();	
		//				dataMap.put(dataKey, dataValue);
		//			}
		//			dataExcel.add(dataMap);
		//		}

		//		for(Map<String,String> a: exeFlg) {
		//			System.out.println(a);
		//		}
		//----------------------test-------------------------

		return dataExcel;

	}

//	public static void main(String[] args) throws IOException {
//		// TODO Auto-generated method stub
//		readExcelData("ContactUs",1);
//		readExcelData("ContactUs",2);
//	}

}
