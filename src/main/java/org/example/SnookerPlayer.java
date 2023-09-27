package org.example;

public class SnookerPlayer
{

    private String name;
    private String nationality;
    private int numOfGames;
    private int numOfGamesWon;
    private double prizeMoney;

    //Constructors:
    public SnookerPlayer()
    {
        this.name = "";
        this.nationality = "";
        this.numOfGames = 0;
        this.numOfGamesWon = 0;
        this.prizeMoney = 0;
    }

    public SnookerPlayer(String name, String nationality, int numOfGames, double prizeMoney)
    {
        this.name = name;
        this.nationality = nationality;
        this.numOfGames = numOfGames;
        this.numOfGamesWon = numOfGamesWon;
        this.prizeMoney = prizeMoney;
    }

    //Getters:
    public String getName()
    {
        return this.name;
    }

    public String getNationality()
    {
        return this.nationality;
    }

    public int getNumOfGames()
    {
        return this.numOfGames;
    }

    public int getNumOfGamesWon()
    {
        return this.numOfGamesWon;
    }

    public double getPrizeMoney()
    {
        return this.prizeMoney;
    }

    //Setters:
    public void setName(String name)
    {
        this.name = name;
    }

    public void setNationality(String nationality)
    {
        this.nationality = nationality;
    }

    public void setNumOfGames(int numOfGames)
    {
        this.numOfGames = numOfGames;
    }

    public void setNumOfGamesWon(int numOfGamesWon)
    {
        this.numOfGames = numOfGamesWon;
    }
    public void setPrizeMoney(double prizeMoney)
    {
        this.prizeMoney = prizeMoney;
    }


    //To String:
    @Override
    public String toString()
    {
        return "SnookerPlayer:\nName: " + name + ";\nNationality: " + nationality +  ";\nNumber of games played: "
                + numOfGames +  ";\nNumber of games won: "
                + numOfGamesWon + ";\nPrize money: " + prizeMoney;
    }

    public void increasePrizeMoney(int increase, double prizeMoney)
    {
        prizeMoney = prizeMoney + increase;
    }

    public void increasePerformance(boolean result)
    {
        if (result)
        {
            numOfGames += 1;
            numOfGamesWon += 1;
        }
        else
        {
            numOfGames += 1;
        }
    }

}
