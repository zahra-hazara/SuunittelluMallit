package Viikko2.AFactory;

public class CheckboxB extends Checkbox {
    public CheckboxB(String text) {
        super(text);
    }

    @Override
    public void display() {
        String status = isChecked ? "[*]" : "[ ]";
        System.out.println(status + " " + text);
    }
}
