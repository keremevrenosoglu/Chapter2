
/**
 * Write a description of class Grades here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Grades
{
    public static void main() {
        makeTable();
    }
    public static void makeTable() {
        writeHeader();
        populateRows();
        
    }
    public static void writeHeader() {
        System.out.println("---------------------------");
        System.out.println("==    Student Points    ==");
    }
    public static void populateRows() {
        populateOneRow("Joe", 40, 7);
    }
    public static void populateOneRow(String name, int lab, int bonus) {
        System.out.println(name + "\t" + lab + bonus + "\t" + (lab + bonus));
    }
}
