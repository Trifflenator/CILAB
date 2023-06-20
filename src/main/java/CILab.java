public class CILab implements CILabInterface {
    private String myString;

    @Override
    public String getString() {
        return myString;
    }

    @Override
    public void setString(String string) {
        myString = string;
        
    }

    @Override
    public boolean detectCapitalUse() {
        int capitalCount = 0;
        boolean isFirstUpper = false;
        for(int index = 0; index < myString.length(); index++) {
        	if(Character.isUpperCase(myString.charAt(index))) {
        		if(index == 0) {
        			isFirstUpper = true;
            	}
        		capitalCount++;
        	}
        	
        }
        return (capitalCount == 0 || capitalCount == myString.length() || (isFirstUpper && capitalCount == 1));
    }

}

