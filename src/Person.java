public class Person {
        private String name; //Зазначено модифікатор private тому, що ці дані вважаються конфіденційними для класу, і не хочу, щоб вони були доступні ззовні
        private int age; //Зазначено модифікатор private тому, що ці дані вважаються конфіденційними для класу, і не хочу, щоб вони були доступні ззовні

        public Person(String name, int age) { //Зазначено модифікатор public тому, що  вони призначені для отримання та встановлення значень полів name та age і можуть бути використані з будь-якого місця програми
            this.name = name;
            this.age = age;
        }

        public String getName() { //Зазначено модифікатор public тому, що  вони призначені для отримання та встановлення значень полів name і можуть бути використані з будь-якого місця програми
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getAge() { //Зазначено модифікатор public тому, що  вони призначені для отримання та встановлення значень полів name та age і можуть бути використані з будь-якого місця програми
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }
    }
