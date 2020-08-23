package cn.xpbootcamp.gildedrose;

public class BackstagePass extends Product {


    public BackstagePass(int sellin, int quality) {
        super(sellin, quality);
    }

    @Override
    public int upDate(int days) {
        int quality = getQuality();
        int sellin = getSellin();
        int doubleMileStone = quality - 10;
        int tripleMileStone = quality - 5;

        if (days> quality)
            return 0;
        else if(tripleMileStone < 0){
            return  sellin+ 3 * days;
        }

        else if(tripleMileStone > 0 && doubleMileStone <0){
            return  sellin + 2 * Math.min(tripleMileStone, days) + 3* Math.max(0, days- tripleMileStone);
        }
        else{
            return sellin - Math.min(doubleMileStone,days) + 2 * Math.min(tripleMileStone, days) + 3* Math.max(0,days- tripleMileStone);
        }

    }
}
