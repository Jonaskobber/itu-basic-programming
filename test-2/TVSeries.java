public class TVSeries extends Film
{
    protected int seasons;
    
    public TVSeries(String title, int year, int seasons) {
        super(title, year);
        this.seasons = seasons;
    }
    
    @Override
    public void display() {
        String printString = "";
        
        printString += title + "(";
        for(int i = 0; i < seasons; i++) {
            printString += (year + i);
            if(i != seasons - 1) {
                printString += ",";
            }
        }
        printString += ") [" + score() + "]";
        
        System.out.println(printString);
    }
}
