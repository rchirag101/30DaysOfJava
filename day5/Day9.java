class Day9 {
    public static void main(String[] args) {
        
        String strNoTrim = "**Life is GOOD***";
        String strTrim = "  ABCD  ";
        
        System.out.println("Trimmed by Condition :'" + strNoTrim + "'");
        System.out.println("Trimmed by Condition :" + strNoTrim.length());
        
        System.out.println("Trimmed by Condition :'" + strTrim + "'");
        System.out.println("Trimmed by Condition :" + strTrim.length());
        
    //         removing trailing and starting '*' or anything as definded
        strNoTrim = checkTrimStr(strNoTrim);

        System.out.println("Trimmed by Condition :'" + strNoTrim + "'");
        System.out.println("Trimmed by Condition :" + strNoTrim.length());
        System.out.println("Trimmed by Condition :'" + strTrim.trim() + "'");
        System.out.println("Trimmed by Condition :" + strTrim.length());
        System.out.println("Trimmed by Condition :" + strTrim.trim().length());
    
    }

    
    // string = "**Life is Good***";
    // function to remove starting and trailing space ' ' or star '*' or anything else
    public static String checkTrimStr(String str) {

    //     if                   Condition to check if there is a '*' at starting index or index 0
    //     else if              Condition to check if there is a '*' at ending index or index length-1
    //     else                 Condition to return str after the every condition fails.
    //     checkTrimStr(str)    recursive function to continuously check for multiple times so no any '*' lefts at starting or ending
    
        if ( str.charAt(0) == '*' ) { // '*' == '*' True => '*' == '*' True => 'L' == '*' False
        
            str = str.substring(1); // "*Life is Good***" <-- "Life is Good***" x
            
            System.out.println("Substring from 0th index :'" + str + "'");
    
    //      Final string when this if condition gives false
    //             string = "Life is GOOD***"; // length = 15
            
            
        }else if( str.charAt(str.length()-1) == '*' ) { // 14 '*' == '*' True => 13 '*' == '*' True => 12 '*' == '*' True => 11 'd' == '*'  False
        
            str = str.substring(0, str.length()-1); // "Life is Good**" <-- "Life is Good*" <-- "Life is Good" 
            
            System.out.println("Substring from " + (str.length()-1) + "th index :'" + str + "'");
            
    //      Final String when this else if condition gives false
    //              string = "Life is GOOD"; // length = 12
            
        }else {
            return str;
        }
        str = checkTrimStr(str);
        return str;
    }
    
}
