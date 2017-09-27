package com.filecomparator.function;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import com.filecomparator.function.domain.ComparatedList;
import com.filecomparator.function.domain.exceptions.NameListClosedException;

public class FileReader {
	public ComparatedList loadListFromFile(String fileLocationName) throws FileNotFoundException{
		ComparatedList clTemp = new ComparatedList(fileLocationName);
		File file = new File (fileLocationName);
		Scanner scr = new Scanner(file);
		try{
			while (scr.hasNext()){
				clTemp.addName(scr.next());
			}
			scr.close();
			clTemp.closeList();
		}catch(NameListClosedException nlce){
			nlce.printStackTrace();
		}
		return clTemp;
	}

}
