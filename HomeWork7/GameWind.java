package HomeWork7;

import javax.swing.*;
import java.awt.*;

import static javax.swing.ScrollPaneConstants.*;

public class GameWind extends JFrame {
    private int windHeight = 720;
    private int windWidth = 980;
    private int winPosX = 50;
    private int winPosY = 0;
    private GameMap map;
    private JPanel gui;
    private JPanel gameControl;
    private JButton btnStartGame;
    private JButton btnExitGame;

    private JPanel gameInfo;
    private JLabel mapSizeInfo;
    private JLabel countEnemyInfo;
    private JLabel gameRoundInfo;

    private JPanel playerInfo;
    private JLabel playerHealthInfo;
    private JLabel playerStepInfo;

    private JPanel playerAction;
    private  JButton moveUp;
    private  JButton moveDown;
    private  JButton moveLeft;
    private  JButton moveRight;
    private  JButton moveLeftUp;
    private  JButton moveRightUp;
    private  JButton moveLeftDown;
    private  JButton moveRightDown;

    private JPanel gameActionLog;
    private JScrollPane controlForGameLog;
    private JTextArea gameLog;


    GameWind() {
        prepareWind();

        prepareGui();
        add(gui, BorderLayout.EAST);

        map = new GameMap();
        add(map);


        setVisible(true);
    }

    private void prepareGui() {
        gui = new JPanel();
        gui.setLayout(new GridLayout(5, 1));
        prepareGameControls();
        prepareGameInfo();
        preparePlayerInfo();
        preparePlayerAction();
        prepareGameActionLog();
        gui.add(gameControl);
        gui.add(gameInfo);
        gui.add(playerInfo);
        gui.add(playerAction);
        gui.add(gameActionLog);
    }

    private void prepareGameControls() {
        gameControl = new JPanel();
        gameControl.setLayout(new GridLayout(2, 1));
        btnStartGame = new JButton("Start Game.");
        btnExitGame = new JButton("Exit Game.");
        gameControl.add(btnStartGame);
        gameControl.add(btnExitGame);
    }

    private void prepareWind() {
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setSize(windWidth, windHeight);
        setTitle("My GAME");
        setLocation(winPosX, winPosY);
    }

    private void prepareGameInfo() {
        gameInfo = new JPanel();
        gameInfo.setLayout(new GridLayout(4, 1));
        mapSizeInfo=new JLabel("Map size:");
        countEnemyInfo=new JLabel("Enemy count:");
        gameRoundInfo=new JLabel("Round:");
        gameInfo.add(new Label("====Game Info==="));
        gameInfo.add(mapSizeInfo);
        gameInfo.add(countEnemyInfo);
        gameInfo.add(gameRoundInfo);
        gameInfo.setBorder(BorderFactory.createLineBorder(Color.MAGENTA));

    }
    private void preparePlayerInfo(){
        playerInfo = new JPanel();
        playerInfo.setLayout(new GridLayout(3, 1));
        playerHealthInfo=new JLabel("Player health:");
        playerStepInfo=new JLabel("Step player:");
        playerInfo.add(new Label("====Player Info==="));
        playerInfo.add(playerStepInfo);
        playerInfo.add(playerHealthInfo);
        playerInfo.setBorder(BorderFactory.createLineBorder(Color.MAGENTA));

    }
    private void preparePlayerAction() {
        playerAction = new JPanel();
        playerAction.setLayout(new GridLayout(9, 1));
        moveUp=new JButton("Move Up:");
        moveDown=new JButton("Move Down:");
        moveLeft=new JButton("Move Left:");
        moveRight=new JButton("Move Right:");
        moveLeftUp=new JButton("Move LeftUp:");
        moveLeftDown=new JButton("Move LeftDown:");
        moveRightUp=new JButton("Move RightUp:");
        moveRightDown=new JButton("Move RightDown:");
        playerAction.add(new Label("====Player Action==="));
        playerAction.add(moveDown);
        playerAction.add(moveLeft);
        playerAction.add(moveRight);
        playerAction.add(moveUp);
        playerAction.add(moveLeftUp);
        playerAction.add(moveLeftDown);
        playerAction.add(moveRightUp);
        playerAction.add(moveRightDown);
        playerAction.setBorder(BorderFactory.createLineBorder(Color.MAGENTA));


    }
    private void prepareGameActionLog() {
        gameActionLog=new JPanel();
        gameLog=new JTextArea();
        controlForGameLog=new JScrollPane(gameLog);
        gameActionLog.add(new JLabel("===Game Log==="));


    }


}

