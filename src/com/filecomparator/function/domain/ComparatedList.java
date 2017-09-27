package com.filecomparator.function.domain;

import java.util.Iterator;
import java.util.TreeSet;

import com.filecomparator.function.domain.exceptions.NameListClosedException;

public class ComparatedList {
	private final TreeSet<String> nameList;
	private String fileLocationName;
	private boolean listClosed;
	public ComparatedList(String fileLocationName){
		nameList=new TreeSet<String>();
		this.fileLocationName = fileLocationName;
	}
	public Boolean findName(String name){
		Boolean bool = nameList.contains(name);
		return bool;
	}
	public void addName(String newName) throws NameListClosedException{
		if(listClosed){
			throw new NameListClosedException("This name list is closed, so no more name can be add to it.");
		}
		nameList.add(newName);
	}
	public String getFileLocationName(){
		return fileLocationName;
	}
	public Iterator<String> getInterator(){
		return nameList.iterator();
	}
	public int getListSize(){
		return nameList.size();
	}
	public void closeList(){
		this.listClosed = true;
	}
	
}
