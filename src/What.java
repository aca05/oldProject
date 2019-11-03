public class What {
    public static void main(String[] args) {
        Dok gaf = new Dok();
        gaf.all_data("Собаки Кошка", "666", "Голубой");
        System.out.println(gaf.getall_data());
        Cat cotyara = new Cat();
        cotyara.all_data("Кошки Собака", "777", "Серой");
        System.out.println(gaf.getall_data());
    }
}