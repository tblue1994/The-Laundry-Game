/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package randomgamificationthing;

/**
 *
 * @author Trevor
 */
public class Game {
    
    private int progress;
    private int score;
    private final int maxProgress=100;
    private final int minProgress=0;
    private RandomGenerator rand;
    private Event[] events;
    //GameWindow gw;
    
    public Game(int progress,int score) {
        this.score=score;
        this.progress=progress;
        rand = new RandomGenerator();
        events = createEvents();
        
        //playGame();
        
    }
    
    public void incrementProgress(){
        if (progress<maxProgress){
            double randValue = 20 * rand.newRand();
            int index = (int)Math.round(randValue);
            progress += index;
        }
    }
    
    public void decrementProgress(){
        if (progress>minProgress){
            double randValue = 20 * rand.newRand();
            int index = (int)Math.round(randValue);
            if (index<progress){
                progress -= index;
            }else{
                progress=0;
            }
            
            
        }
    }
    

    /**
     * @return the score
     */
    public int getScore() {
        return score;
    }

    /**
     * @param score the score to set
     */
    public void setScore(int score) {
        this.score = score;
    }

    /**
     * @return the progress
     */
    public int getProgress() {
        return progress;
    }

    /**
     * @param progress the progress to set
     */
    public void setProgress(int progress) {
        this.progress = progress;
    }

    private Event[] createEvents() {
        Event[] events = new Event[5];
        events[0]= new Event("Shirts! No, I don't seperate colors. Toss the white shirt in with the colors!");
        events[1]= new Event("Pants! But why is it called a pair if there is only one of them?");
        events[2]= new Event("Hats! My hat game MUST be on point! Add a Hat to the laundry!");
        events[3]= new Event("Socks! Wait... does that one have a hole in it? WASH IT ANYWAY!");
        events[4]= new Event("Underwear! Those have to be very, VERY clean. Toss those in!");
        return events;
    }
    
    public int chooseEvent(){
        double randValue = 4 * rand.newRand();
        int index = (int)Math.round(randValue);
        return index;
    }
    
    /*public void playGame(){
        gw.setDisplayText("Get ready, HERE WE GO!");
        while(progress<100){
            int i = chooseEvent();
            gw.setDisplayText(getEvents()[i].getText());
            String stuff=checkInput(i);
            gw.setDisplayText(stuff);
            gw.setprogress(progress);
        }
        gw.setDisplayText("Good Job! You win!");
       
    }
    
    private String checkInput(int i){
        String text ="";
        while (gw.getSelectedEvent()==-1){
            
        }
        if (gw.getSelectedEvent()==i){
            text="Good Job! NEXT EVENT!";
            incrementProgress();
        }else{
            text="I'm Sorry, that was wrong! NEXT EVENT!";
            decrementProgress();
        }
        return text;
    }*/

    /**
     * @return the events
     */
    public Event[] getEvents() {
        return events;
    }
    
    
    
}
