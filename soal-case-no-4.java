public class MyClass {
    public static void main(String args[]) {
        String phonenumber = "0811827698";
        int phonenumberLength = phonenumber.length();
        
        int sum = 0;
        
        for(int i = 0; i < phonenumberLength;i++) {
            char a = phonenumber.charAt(i);
            String phonenumber_string = String.valueOf(a);
            
            int curr = Integer.parseInt(phonenumber_string);
            sum += curr;
        }
        
        System.out.println("total : " + sum);
    }
    
    
}
