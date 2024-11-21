public class Time {
    private int seconds;

    public Time(int seconds) {
        this.seconds = seconds % 86400; // 86400 секунд в сутках
    }

    public String toString() {
        int hours = seconds / 3600;
        int minutes = (seconds % 3600) / 60;
        int secs = seconds % 60;

        return String.format("%02d:%02d:%02d", hours, minutes, secs);
    }
}
