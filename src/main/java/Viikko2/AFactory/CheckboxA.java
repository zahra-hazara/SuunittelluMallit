package Viikko2.AFactory;

public class CheckboxA extends Checkbox {
    public CheckboxA(String text) {
        super(text);
    }

    @Override
    public void display() {
        String status = isChecked ? "[X]" : "[ ]";
        System.out.println(status + " " + text);

    }
}
