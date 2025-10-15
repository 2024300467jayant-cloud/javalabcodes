public class NameIntegerSum {
    public static void main(String[] args) {
        String[] names = {"John123 Doe456", "Alice789 Smith012"};
        int numberToInsert = 99;

        for (String fullName : names) {
            String[] parts = fullName.split(" ");
            String firstName = parts[0];
            String lastName = parts[1];

            String modifiedName = firstName + numberToInsert + lastName;
            System.out.println(modifiedName);

            int sumFirstName = sumDigits(firstName);
            int sumLastName = sumDigits(lastName);
            int totalSum = sumFirstName + sumLastName;

            System.out.println(sumFirstName);
            System.out.println(sumLastName);
            System.out.println(totalSum);
        }
    }

    public static int sumDigits(String str) {
        int sum = 0;
        for (char ch : str.toCharArray()) {
            if (Character.isDigit(ch)) {
                sum += ch - '0';
            }
        }
        return sum;
    }
}
