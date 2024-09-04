package Viikko2.AFactory;

public abstract class Checkbox {
    protected String text;
    protected boolean isChecked = false;

    public Checkbox(String text) {
        this.text = text;
    }

    public abstract void display();

    public void setText(String newText) {
        this.text = newText;
    }

    public void toggle() {
        if (!this.isChecked) this.isChecked = true;
        else this.isChecked = false;
    }

}
