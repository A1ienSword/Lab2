public class Time4 {
    private final int seconds;

    public Time4(int totalSeconds) {
        this.seconds = normalizeSeconds(totalSeconds);
    }

    public Time4(int hours, int minutes, int seconds) {
        this(hours * 3600 + minutes * 60 + seconds);
    }

    private int normalizeSeconds(int totalSeconds) {
        return totalSeconds % 86400;
    }

    @Override
    public String toString() {
        int hours = seconds / 3600;
        int minutes = (seconds % 3600) / 60;
        int secs = seconds % 60;
        return String.format("%02d:%02d:%02d", hours, minutes, secs);
    }
}