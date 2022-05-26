public class MyClass {
    public static void main(String args[]) {
        String message = checkGrade(60);
        System.out.println(message);
    }
    
    private static String checkGrade(int val) {
        if(val < 60) {
           return "Mahasiswa ini mendapatkan Grade E";
        } else {
            if(val >= 90) {
                return "Mahasiswa ini mendapatkan Grade A";
            } else {
                if(val >= 80) {
                    return "Mahasiswa ini mendapatkan Grade B";
                } else {
                    if(val >= 70) {
                        return "Mahasiswa ini mendapatkan Grade C";
                    } else {
                         return "Mahasiswa ini mendapatkan Grade D";
                    }
                }
            }
        }
    }
}
