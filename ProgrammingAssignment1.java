class SY2022bit048 {
    public static void main(String[] args) {
        int count=0;{
        String arr1 = "2022bit048";
        int result1 = getValidRegistrationsCount(arr1);
        

        if (result1 == 1) {
            count=count+1;
        } else {
            System.out.println("Registration number is not valid");
        }

        String arr2 = "2022bcs073";
        int result2 = getValidRegistrationsCount(arr2);
        {

        if (result2 == 1) {
            count=count+1;
        } else {
            System.out.println("Registration number is not valid");
        }

        String arr3 = "2022bme045";
        int result3 = getValidRegistrationsCount(arr3);

        if (result3 == 1) {
            count=count+1;
        } else {
            System.out.println("Registration number is not valid");
        }

        String arr4 = "2022bch035";
        int result4 = getValidRegistrationsCount(arr4);

        if (result4 == 1) {
             count=count+1;
        } else {
            System.out.println("Registration number is not valid");
        }

        String arr5 = "2022bel027";
        int result5 = getValidRegistrationsCount(arr5);

        if (result5 == 1) {
            count=count+1;
        } else {
            System.out.println("Registration number 2022bel027 is not valid");
        }
            System.out.println(count);
        }
    }
    }

    static int getValidRegistrationsCount(String arr) {
        for (int i = 0; i < 4; i++) {
            if (Character.isDigit(arr.charAt(i))) {
                continue;
            } else {
                return 0;
            }
        }

        if (arr.charAt(4) == 'b') {
            if (arr.charAt(5) == 'i' || arr.charAt(5) == 'm' || arr.charAt(5) == 'c') {
                if (arr.charAt(6) == 't' || arr.charAt(6) == 's' || arr.charAt(6) == 'e' || arr.charAt(6) == 'h') {
                    for (int k = 7; k < 10; k++) {
                        if (Character.isDigit(arr.charAt(k))) {
                            return 1;
                        } else {
                            return 0;
                        }
                    }
                }
            }
        }

        return 0;
    }
}

