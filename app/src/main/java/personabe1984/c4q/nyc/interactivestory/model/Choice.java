package personabe1984.c4q.nyc.interactivestory.model;

/**
 * We want to know what was the choice
 */
public class Choice {

    private String mText;  //The string that describe the choice
    private int mNextPage; // The index of the locate where the page.

    public Choice(String text, int nextPage){
        mText = text;
        mNextPage = nextPage;
    }


    public String getText() {
        return mText;
    }

    public void setText(String text) {
        mText = text;
    }

    public int getNextPage() {
        return mNextPage;
    }

    public void setNextPage(int nextPage) {
        mNextPage = nextPage;
    }



}
