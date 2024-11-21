public class Time5 {
    private final int seconds;

    public Time5(int totalSeconds) {
        this.seconds = normalizeSeconds(totalSeconds);
    }

    public Time5(int hours, int minutes, int seconds) {
        this(hours * 3600 + minutes * 60 + seconds);
    }

    private int normalizeSeconds(int totalSeconds) {
        return totalSeconds % 86400;
    }

    public int getHours() {
        return seconds / 3600;
    }

    public int getMinutes() {
        return (seconds % 3600) / 60;
    }

    public int getSeconds() {
        return seconds % 60;
    }

    @Override
    public String toString() {
        return String.format("%02d:%02d:%02d", getHours(), getMinutes(), getSeconds());
    }
}