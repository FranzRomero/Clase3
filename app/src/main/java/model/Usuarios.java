package model;

import java.util.List;

public class Usuarios {
    private String stringperpage;
    private String Total;
    private String getStringperpage;

    private List<Usuario> data;

    public Usuarios(String stringperpage, String total, String getStringperpage, List<Usuario> data) {
        this.stringperpage = stringperpage;
        Total = total;
        this.getStringperpage = getStringperpage;
        this.data = data;
    }

    public String getStringperpage() {
        return stringperpage;
    }

    public void setStringperpage(String stringperpage) {
        this.stringperpage = stringperpage;
    }

    public String getTotal() {
        return Total;
    }

    public void setTotal(String total) {
        Total = total;
    }

    public String getGetStringperpage() {
        return getStringperpage;
    }

    public void setGetStringperpage(String getStringperpage) {
        this.getStringperpage = getStringperpage;
    }

    public List<Usuario> getData() {
        return data;
    }

    public void setData(List<Usuario> data) {
        this.data = data;
    }
}
