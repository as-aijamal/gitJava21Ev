public class Lessons {
    private String name;
    private int time;

    public Lessons(String name, int time) {
        this.name = name;
        this.time = time;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }

    @Override
    public String toString() {
        return "lessons{" +
                "name='" + name + '\'' +
                ", time=" + time +
                '}';
    }
}
