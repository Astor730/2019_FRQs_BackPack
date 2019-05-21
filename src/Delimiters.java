import java.util.ArrayList;

public class Delimiters {
    private String openDel;
    private String closeDel;

    public Delimiters(String open, String close)
    {
        openDel = open;
        closeDel = close;
    }

    public ArrayList<String> getDelimitersList(String[] tokens)
    {
        ArrayList<String> delimiters = new ArrayList<String>();

        for (int i = 0; i < tokens.length; i++){
            if(tokens[i].compareTo(openDel) == 0 || tokens[i].compareTo(closeDel) == 0){
                delimiters.add(tokens[i]);
            }
        }

        return delimiters;
    }

    public boolean isBalanced(ArrayList<String> delimiters){

    }
}
