public class Bonus{
    private String exerciseEins;
    private String exerciseZwei;
    private String exerciseDrei;
    private int repetitions;
    private int breaktime;
    public Bonus(String exerciseEins,String exerciseZwei, String exerciseDrei, int repetitions, int breaktime) {
        this.repetitions = repetitions;
        this.breaktime = breaktime;
        this.exerciseEins = exerciseEins;
        this.exerciseZwei = exerciseZwei;
        this.exerciseDrei = exerciseDrei;
    }

public void showAll(){
        System.out.println("*********************************************"+"\n"+"Interval workout STARTS"+"\n"+"*****************************************************"+
                "\n"+"=================================================="+"\n"+"Round " + repetitions + ":"+"\n" + exerciseEins + "\n"+ exerciseZwei + "\n" + exerciseDrei + "\n" +
                "=================================================" +"\n" + "DO A BREAK FOR " + breaktime + "\n" + " ===========================================================");
}

}
