class strings {
    public static void main(String[] args) {
        String str1 = "amIT SriVAStaVA";
        // uppercase and lowercase
        System.out.println(str1.toUpperCase());
        System.out.println(str1.toLowerCase());
        String str2 = "amIT SriVAStaVA";
        // making substrings
        System.out.println(str2.substring(0, 4));
        System.out.println(str2.substring(5, 15));
        // converting A and S to uppercase
        System.out.println(str2.substring(0, 1).toUpperCase());
        System.out.println(str2.substring(5, 6).toUpperCase());
        // convering A_mit S_rivastava to lowercase
        System.out.println(str2.substring(1, 5).toLowerCase());
        System.out.println(str2.substring(6, 15).toLowerCase());
        // storing Amit and srivastava in particuler string
        String str3 = (str2.substring(0, 1).toUpperCase() + str2.substring(1, 5).toLowerCase());
        System.out.println(str3);
        String str4 = (str2.substring(5, 6).toUpperCase() + str2.substring(6, 15).toLowerCase());
        System.out.println(str4);
        // **-------final result-------**
        System.out.println("the required sequence is " + str3 + str4);
    }
}