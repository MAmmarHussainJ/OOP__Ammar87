class Substring{





		public static void main(String[] args){
			String text = "abcdbadac";
		
			int stringlength= 0;
		



		for (int i=0; i<text.length(); i++){
		int count = 0;

		for (int j=i; j<text.length(); j++){
		char ch = text.charAt(j);
		boolean isRepeated = false;

		for (int k=i; k<j; k++){
		if(text.charAt(k)==ch){
		isRepeated = true;
		break;
	}
	}
	 		if(isRepeated){
	 		break;
	}
	 		else{
	 			count++;
	}
	}

				if(count>stringlength){
				stringlength=count;
	}
	}
					System.out.println("length: "+stringlength);
	}
	}