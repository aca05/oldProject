public class What {
    public static void main(String[] args) {
        Dok gaf = new Dok();
        gaf.all_data("Собаки ", "666", "Голубой");
        System.out.println(gaf.getall_data());

        Cat cotyara = new Cat();
        cotyara.all_data("selina", "777", "Серой");
        System.out.println(cotyara.getall_data());

        suslic sus = new suslic();
        sus.all_data("sysy", "98", "hhh");
        System.out.println(sus.getall_data());
    }
}