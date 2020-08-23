package cn.xpbootcamp.gildedrose;

public class Product {

    private int sellin;
    private int quality;

    public Product(int sellin, int quality){

        this.sellin = sellin;
        this.quality = quality;
    }

    public int getSellin() {
        return sellin;
    }

    public int getQuality() {
        return quality;
    }

    public int upDate(int days){
        int i = Math.min(days, 10);

        int tempSellin = this.sellin- Math.min(days, 10) - 2* Math.max(0,days-10);

        return Math.max(tempSellin, 0);
    }



}
