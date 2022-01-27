package HomeWork6;

public class main {
    public static void main(String[] args) {
        Employe npc[] = new Employe[6];
        npc[0] = new Employe("миша","кабан","миша@mail",113414,23000,40);
        npc[1] = new Employe("вася","слон","вася@mail",11111,23000,43);
        npc[2] = new Employe("петя","кот","петя@mail",22222,29000,23);
        npc[3] = new Employe("коля","лев","коля@mail",33333,40000,18);
        npc[4] = new Employe("маша","гусь","маша@mail",44444,18000,45);
        npc[5] = new Employe("кузя","олень","кузя@mail",55555,200000,41);

        System.out.println("Сотрудники старше 40 лет");
        for (int i = 0; i < npc.length; i++) {

           if( npc[i].getAge() >= 40 ){

               System.out.println("Имя: "+ npc[i].getName()+", Должность: "      + npc[i].getPost()+
                             ", Email: " + npc[i].geteMail()+", Номер телефона: "+ npc[i].getPhoneNumber()+
                             ", Оклад: " + npc[i].getSalary() +", Возраст: "     + npc[i].getAge()+".");
           }
        }
    }
}
