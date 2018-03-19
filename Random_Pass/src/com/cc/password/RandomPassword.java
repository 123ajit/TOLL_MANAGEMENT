package com.cc.password;
import java.util.UUID;
public class RandomPassword 
{
  public String generatePassword(int n)
  {
	  String s="";
	  // spc= s+ch[i]
	  UUID uuid=UUID.randomUUID();
	  String pass=uuid.toString();
	  char ch[]=pass.toCharArray();
	  for(int i=0;i<pass.length();i++)
	  {
		  if(ch[i]>=65&&ch[i]<= 95)
		 {
			  
		  }
       }
	  	   	
	  return null;
  }
}
