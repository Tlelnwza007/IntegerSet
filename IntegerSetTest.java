public class IntegerSetTest {
    public static void main(String[] args) {
        System.out.println("--- Starting CharSet Manual Tests ---");
        int passed = 0;
        int failed = 0;

        // Test 1: การสร้าง, เพิ่มข้อมูล, และการเรียงลำดับ
        System.out.println("\n--- Testing add() remove sorting ---");
        IntegerSet a = new IntegerSet() ;
        a.add(10);
        a.add(9);
        a.add(11);
        String s = "[9, 10, 11]" ;
        if (a.toString().equals(s)){
             System.out.println("Pass");
            passed++ ;
        }else {
            System.out.println("Fail" + a.toString());
            failed ++ ;
        }
        
        // Test 2: การลบข้อมูล
        System.out.println("\n--- Testing add() and sorting ---");
        a.remove(10);
         String expected2 = "{9, 11}";
        String s2 = "[9, 11]" ;
        if (a.toString().equals(s2)){
             System.out.println("Pass");
            passed++ ;
        }else {
            System.out.println("Fail" + a.toString());
            failed ++ ;
        }
        
        // Test 3: การตรวจสอบข้อมูล (contains)
        System.out.println("\n--- Testing contains() ---");
        if (a.contains(9) && ! a.contains(10)){
             System.out.println("Pass");
            passed++ ;
        }else {
            System.out.println("Fail" + a.contains(9));
            failed ++ ;
        } 
        System.out.println("\n--------------------");
        System.out.println("--- Test Summary ---");
        System.out.println("Passed: " + passed + ", Failed: " + failed);
        if (failed == 0) {
            System.out.println("Excellent! All tests passed!");
        } else {
            System.out.println("Some tests failed.");
        } 
        
    }
}
