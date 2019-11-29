public class Exercises {
    private String name;
    private String description;
    private int duration;
    private String position;

    public Exercises(String name, String description, int duration, String position) {
        this.name = name;
        this.description = description;
        this.duration = duration;
        this.position = position;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public void showAll(){
        System.out.println(name + "           " + "Duration: "+duration +"seconds"+ "\n----------------------------------"+ "\n" +"Description: " + description + "\n" + "Position: " +position + "\n");
    }
}
