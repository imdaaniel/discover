public class ReadParameters {
    public static void main(String[] args) {
        String message = "Hi";
        if (args.length == 0) {
            System.out.println(message);
            return;
        }

        message += " " + String.join(", ", args);

        if (args.length == 1) {
            System.out.println(message);
            return;
        }
        
        String toReplace = ", ";
        String replacement = " and ";

        int indexOfLastComma = message.lastIndexOf(toReplace);
        
        StringBuilder builder = new StringBuilder();
        builder.append(message.substring(0, indexOfLastComma));
        builder.append(replacement);
        builder.append(message.substring(indexOfLastComma + toReplace.length()));
        

        System.out.println(builder);
    }
}