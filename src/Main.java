//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        var hours = 640;
        var allEmpl = hours / 8;
        System.out.println("Всего работников в компании - " + allEmpl + " человек.");
        var moreEmpl = allEmpl + 94;
        var newHours = hours / moreEmpl;
        System.out.println("Если в компании работает " + moreEmpl + " человека, то всего " + newHours + " часа работы может быть поделено между сотрудниками");
        }
}