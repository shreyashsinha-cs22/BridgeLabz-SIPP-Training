import java.util.HashSet;

public class GenerateUniqueOTP {

    // Generate a 6-digit OTP
    static int generateOTP() {
        return (int) (Math.random() * 900000) + 100000;
    }

    // Check if all OTPs are unique
    static boolean isUnique(int[] otps) {
        HashSet<Integer> set = new HashSet<>();
        for (int otp : otps) {
            if (set.contains(otp)) {
                return false;
            }
            set.add(otp);
        }
        return true;
    }

    public static void main(String[] args) {
        int[] otps = new int[10];
        for (int i = 0; i < otps.length; i++) {
            otps[i] = generateOTP();
        }

        // Display the generated OTPs
        System.out.println("Generated OTPs:");
        for (int otp : otps) {
            System.out.println(otp);
        }

        // Check for uniqueness
        if (isUnique(otps)) {
            System.out.println("All OTPs are unique.");
        } else {
            System.out.println("Some OTPs are duplicated.");
        }
    }
}
