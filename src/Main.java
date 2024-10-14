public class Main {
    private static final String API_URL = "https://jsonplaceholder.typicode.com/todos/1";
    public static void main(String[] args) {
        A a=new A();
        a.setAPI_URL("https://jsonplaceholder.typicode.com/todos/1");
        a.sendRequest();
        try {

                // Print the response
                String jsonResponse = a.sendRequest();
//                System.out.println("Response: " + jsonResponse);

                // Assertion (you can customize this part based on your requirements)
                if (jsonResponse.contains("\"userId\": 1")) {
                    System.out.println("Assertion passed: userID is 1");
                } else {
                    System.out.println("Assertion failed: userID is not 1");
                }
                if (jsonResponse.contains("\"id\": 1")) {
                    System.out.println("Assertion passed: ID is 1");
                } else {
                    System.out.println("Assertion failed: ID is not 1");
                }
                if (jsonResponse.contains("\"title\": \"delectus aut autem\"")) {
                    System.out.println("Assertion passed: title is delectus aut autem");
                } else {
                    System.out.println("Assertion failed: title is not delectus aut autem");
                }
                if (jsonResponse.contains("\"completed\": false")) {
                    System.out.println("Assertion passed: completed is false");
                } else {
                    System.out.println("Assertion failed: completed is not false");
                }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}