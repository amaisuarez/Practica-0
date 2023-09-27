public class LettersList
{
    //code the getLetterList method that accepts a word as argument and returns a list of its letters
    public static String[] getLettersList(String word)
    {

        String[] letter = new String[word.length()];
        for(int i = 0; i < word.length(); i++)
        {
            letter[i] = word.substring(i, i+1);
        }
        return letter;
    }
}