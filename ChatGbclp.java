public class ChatGbclp{
public static void main (String args[]){
          String strs[] = {"klower","rlow","light"};
       System.out.println(CommonLongestPrefix(strs));
}
public static String CommonLongestPrefix(String [] strs){
      
	   String str = strs[0];
	   String temp = "";
	   String pref = "";
	   for(int i =0 ;i< str.length();i++){
	     temp = temp + str.charAt(i);
		 boolean isContain = true;
		 for(int j = 1;j<strs.length;j++){
		          if(strs[j].contains(temp)){
				   isContain = true;
				   System.out.println(pref);
				  }
				  else{
				  isContain = false;
				  return pref;
				  }
		 }
		 if(isContain){
		      pref = temp;
		 }
	   }
     	 return pref;
 }

}

