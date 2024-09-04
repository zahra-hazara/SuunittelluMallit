package Viikko2.AFactory;

public abstract class Button {
    protected String text;

    public Button(String text) {
        this.text = text;
    }

    public abstract void display();

    public void setText(String newText) {
        this.text = newText;
    }
}
