public class Name {
    private String lastName;
    private String firstName;
    private String middleName;

    public Name(String lastName, String firstName, String middleName) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.middleName = middleName;
    }

    @Override
    public String toString() {
        StringBuilder fullName = new StringBuilder();

        if (lastName != null && !lastName.isEmpty()) {
            fullName.append(lastName);
        }

        if (firstName != null && !firstName.isEmpty()) {
            if (fullName.length() > 0) fullName.append(" ");
            fullName.append(firstName);
        }

        if (middleName != null && !middleName.isEmpty()) {
            if (fullName.length() > 0) fullName.append(" ");
            fullName.append(middleName);
        }

        return fullName.toString();
    }
}