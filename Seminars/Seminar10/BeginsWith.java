package Seminars.Seminar10;

public class BeginsWith implements IsGood<String> {

    private String line;

    public BeginsWith(String line) {
        this.line = line;
    }

    @Override
    public boolean isGood(String item) {
        return item.startsWith(line);
    }

}
