public class TestDriver {
    public static void main(String[] args) {

        Stack<String> Test = new Stack<String>();
        Test.push("1st Node");
        Test.push("2nd Node");
        Test.push("3rd Node");
//        for(int i=0; i<3;i++){ //push works
//            System.out.println(Test.size());
//            System.out.println(Test.pop());
//        }

        System.out.println("Must Print out 3");
        System.out.println(Test.size());

        System.out.println("must print out the 3rd node");
        System.out.println(Test.pop());

        System.out.println("Must print out the 2nd node");
        System.out.println(Test.peek());

        System.out.println("Should Print false");
        System.out.println(Test.isEmpty());
    }
}
