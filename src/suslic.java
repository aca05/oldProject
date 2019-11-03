public class suslic {
    private String name;
    private String weight;
    private String color;

    public void east(){}

    public void setName(String names)
    {this.name = names; }

    public String getName() {return this.name;}

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }
    public String getColor() {
        return this.color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    public void all_data(String name, String weight, String color){
        setName(name); setWeight(weight); setColor(color);
    }
    public String getall_data(){
        return "Кличка "+ getName()+"\nВес "+ getWeight()+ "\nЦвет "+ getColor();
    }
}
