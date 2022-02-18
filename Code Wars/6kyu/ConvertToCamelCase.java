class ConvertToCamelCase{

  static String toCamelCase(String s){
    String output = "";
    int counter = 0;
    while (counter < s.length()) {
      if (s.charAt(counter) == '-' || s.charAt(counter) == '_') {
        counter++;
        output += Character.toUpperCase(s.charAt(counter));
      }
      else {
        output += s.charAt(counter);
      }
      counter++;
    }
    return output;
  }
}