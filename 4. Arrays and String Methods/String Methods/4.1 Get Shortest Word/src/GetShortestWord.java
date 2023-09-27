public class GetShortestWord
{
    //code the method getShortestWord that accepts two words and returns the shortest one
    public static String getShortestWord(String palabra1,String palabra2){
        if (palabra1.length() > palabra2.length())
                return palabra2;
        else
                return palabra1;

        //using a conditional we compare two words and we see what word is the shortest.
    }
}