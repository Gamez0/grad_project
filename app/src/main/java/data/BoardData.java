package data;

import androidx.annotation.Keep;

@Keep
public class BoardData {
    String title;
    String writer;
    String date;
    String readcomment;

    public BoardData() {
    }

    public BoardData(String title, String writer, String date, String readcomment) {
        this.title = title;
        this.writer = writer;
        this.date = date;
        this.readcomment = readcomment;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getWriter() {
        return writer;
    }

    public void setWriter(String writer) {
        this.writer = writer;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getReadcomment() {
        return readcomment;
    }

    public void setReadcomment(String readcomment) {
        this.readcomment = readcomment;
    }

    @Override
    public String toString() {
        return "BoardData{" +
                "title='" + title + '\'' +
                ", writer='" + writer + '\'' +
                ", date='" + date + '\'' +
                ", readcomment='" + readcomment + '\'' +
                '}';
    }
}
