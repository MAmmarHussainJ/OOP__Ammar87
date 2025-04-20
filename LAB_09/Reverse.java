class Reverse{









	public static void main(String[] args){

		String text = "computer";
		String rev = "";
		for(int j=text.length()-1; j>=0; j--){
          rev = rev + text.charAt(j);
        
		}
            System.out.println(rev);

	}
	}