public class Printing_Action {

        private int toner_Capacity;
        private int numOfPagesPrinted = 0;
        private boolean duplex;

        public Printing_Action(int toner_Capacity, boolean duplex) {
            this.toner_Capacity = toner_Capacity;
            this.duplex = duplex;
        }
        public void to_fill_Toner(int fill){
            int newTonerLevel = toner_Capacity +fill;
            if(newTonerLevel > 0 && newTonerLevel <= 100){
                toner_Capacity = newTonerLevel;
                System.out.println(" The Toner Level is full now " + fill + " of toner. "
                        + " The filled level is "  +  toner_Capacity);
            }
            else {
                System.out.println(" Please check the Toner correct Fill level " + " the filled up level is "
                        + toner_Capacity);
            }
        }
        public void pagesPrinted(int pages, boolean duplex){
            if(duplex){
                pages = (pages / 2) + (pages % 2);
                numOfPagesPrinted += pages;
                System.out.println("Duplex Mode is on");
            }
            else {
                numOfPagesPrinted += pages;
                System.out.println(" Duplex mode is off");
            }
            System.out.println("The total number of page you printed is "
                    + numOfPagesPrinted);
        }
    }


