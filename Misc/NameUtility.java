package Coding.Misc;

public class NameUtility {
    public static void main(String[] args) {
        System.out.println(convertNameToInitials("Sravanthi  Manddagaddi"));
        System.out.println(convertNameToInitials(" NivanVinoth"));
        System.out.println(convertNameToInitials("Aria J   Dennis"));
        System.out.println(convertNameToInitials(""));
        System.out.println(convertNameToInitials(" "));
    }
    public static String convertNameToInitials(String name) {
        if (name.isBlank() || name.isEmpty()) {
            return "No name provided";
        }
        String[] separateNames = name.split(" ");
        String initials = "";
        for (String singleName : separateNames) {
            if (!(singleName.isBlank())) {
                initials = initials + singleName.charAt(0) + ".";
            }
        }
        return initials;
    }
}

