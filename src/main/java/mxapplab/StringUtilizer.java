package mxapplab;

public class StringUtilizer {

	public String toInitialNaming(String fullname) {
		
		String[] names = fullname.split(" ");
		
		if(names.length == 1) {
			return capitalCase(names[0]).trim();
		}else {
	
			String mname = "";
			for(int i = 0; i <= names.length-2; i++) {
				
				mname += capitalCase(names[i]);
			}
			return mname
					+names[names.length-1].substring(0, 1).toUpperCase()
					+names[names.length-1].substring(1, names[names.length-1].length()); 
					
		}

	}
	
	public String capitalCase(String name) {
		return name.substring(0, 1).toUpperCase()+". ";
	}
}
