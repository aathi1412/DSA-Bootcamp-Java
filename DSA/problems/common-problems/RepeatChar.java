class repeat {
    public static void main(String[] args) {
        String input = "t6hj7ui";              // output: ttttttthjjjjjjjjui
        StringBuilder output = new StringBuilder();
        
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            
            if (Character.isDigit(ch)) {
                int repeatCount = Character.getNumericValue(ch); 
                char previousChar = input.charAt(i - 1); 
                for (int j = 0; j < repeatCount; j++) {
                    output.append(previousChar); 
                }
            } else {
                output.append(ch); 
            }
        }
        
        System.out.println(output.toString());
    }
}
