class Palindrome{







	public static void main(String[] args){
	
	    String text = "madam";
	    String temp = "";
	   
		for (int i=text.length()-1; i>=0; i--)	
          temp = temp + text.charAt(i);
		
		if(text.equals(temp)){
			System.out.println("is Palindrome");
	}
		
		else{
			System.out.println("not palindrome");
	}
	}
	}
