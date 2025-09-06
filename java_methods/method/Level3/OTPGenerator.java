import java.util.Arrays;

public class OTPGenerator {

    
    public static int generateOTP() {
       
        return 100000 + (int)(Math.random() * 900000);
    }

   
    public static boolean areUnique(int[] otps) {
        for (int i = 0; i < otps.length; i++) {
            for (int j = i + 1; j < otps.length; j++) {
                if (otps[i] == otps[j]) {
                    return false; // Duplicate found
                }
            }
        }
        return true; 

    }
    public static void main(String[] args) {
        int[] otpArray = new int[10];

        
        for (int i = 0; i < otpArray.length; i++) {
            otpArray[i] = generateOTP();
        }

       
        System.out.println("Generated OTPs: " + Arrays.toString(otpArray));

       
        if (areUnique(otpArray)) {
            System.out.println(" All OTPs are unique!");
        } else {
            System.out.println(" Duplicate OTPs found!");
        }
    }
}
