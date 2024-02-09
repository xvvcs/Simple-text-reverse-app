public class StringReverse {
    private String text;

    public StringReverse(String text){
        this.text = text;
    }
    public void setText(String text) {
        this.text = text;
    }
    public String getText() {
        return text;
    }
    
    private String Reverse(){
        
        int length = text.length();
        String reversed = "";

        for (int i = 0; i < text.length(); i++) {
            char temp = text.charAt(length-1);
            length--;
            reversed = reversed+ String.valueOf(temp);
        }
        return reversed;
    }

    public String toString(){
        return Reverse();
    }
}
