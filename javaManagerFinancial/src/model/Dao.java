package model;

import controll.DataPersonal;


public class Dao {
	
	
	DataPersonal personal = new DataPersonal();
	
	
	 private String id , name ;
	
	
	
	
	
      public String logar () {   
    	  
    	        personal.setId("E$76h_9");
    	        id = personal.getId();      
    	  
    	        personal.setName("Ronaldo Fagundes");       	 
    	        name= personal.getName(); 
    	        
    	        return " id nº "+id+" user  "+name;
      }
   
      
      
      

}
