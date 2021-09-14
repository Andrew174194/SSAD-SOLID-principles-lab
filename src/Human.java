import Lang.*;
import Human.*;
import java.util.List;
import java.util.ArrayList;

public class Human implements IHuman {
    private String name;
    private String nickname;
    private double salary;
    private List<String> hobbies;

    public static void main(String[] args){
        Human human = new Human();

        // usage of language
        ILanguage language = new Lang_Japanese();
        System.out.println(language.sayHello());

        // usage of tax calculator
        TaxManager taxes = new TaxManager();
        human.salary = 1000;
        taxes.salary = human.salary;
        taxes.calculateTax(0.9);
        human.salary = taxes.salary;
        System.out.println(human.salary);

        // usage of nicknames
        NickNameManager nick = new NickNameManager();
        nick.name = "Jojo";
        nick.creatNickName("_ABC");
        human.nickname = nick.nickname;
        System.out.println(human.nickname);

        // usage of hobbies
        HobbyManager hobby = new HobbyManager();
        hobby.hobbies = new ArrayList<String>();
        hobby.addHobby("Sport");
        human.hobbies = hobby.hobbies;
        System.out.println(human.hobbies);

    }
}
