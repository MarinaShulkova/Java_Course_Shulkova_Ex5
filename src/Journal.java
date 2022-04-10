// Дочерний класс 2
public class Journal extends Publications {
    protected String journal_name;
    String editor;
    Boolean child;
    public Journal (String id2, String journal_name, String editor) {
        this.id = id2;
        this.journal_name = journal_name;
        this.editor = editor;
        this.child = true;
    }

    @Override
    public void number1() {
        String Y_N = "";
        if (child == true) {
            Y_N = "Yes";
        }
        else {
            Y_N = "No";
        }
        System.out.println("ID book = " + id + "\n" + "Name's journal: " + journal_name + "\n" + "Editor: " + editor + "\n" + "For children: " + Y_N);
    }
}
