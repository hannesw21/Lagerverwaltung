package daoservice;

import de.sbs.lagerfxmodel.LagerModelInterface;

public class LagerFXModel implements LagerModelInterface{
    private String body;
    private String title;
    private int id;
    private int userId;

    @Override
    public String getBody() {
        return body;
    }

    @Override
    public int getId() {
        return id;
    }

    @Override
    public String getTitle() {
        return title;
    }

    @Override
    public int getUserId() {
        return userId;
    }
    
}
