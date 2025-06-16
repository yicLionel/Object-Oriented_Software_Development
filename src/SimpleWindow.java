import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class SimpleWindow {
    private static JFrame frame;
    private static JPanel initialPanel;

    public static void main(String[] args) {
        frame = new JFrame("摸鱼专用通道");
        frame.setSize(300, 180);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);

        initialPanel = new JPanel();
        JButton startButton = new JButton("开始摸鱼！");
        startButton.setPreferredSize(new Dimension(280, 100));
        startButton.addActionListener(e -> showFishScreen());
        initialPanel.add(startButton);

        frame.getContentPane().add(initialPanel);
        SwingUtilities.invokeLater(() -> frame.setVisible(true));
    }

    private static void showFishScreen() {
        frame.setVisible(false);

        JFrame fullScreenFrame = new JFrame();
        fullScreenFrame.setUndecorated(true);
        fullScreenFrame.setExtendedState(JFrame.MAXIMIZED_BOTH);
        fullScreenFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        int screenWidth = screenSize.width;
        int screenHeight = screenSize.height;

        // 使用 JLayeredPane 管理图层
        JLayeredPane layeredPane = new JLayeredPane();
        layeredPane.setPreferredSize(screenSize);

        // 背景图层
        ImageIcon originalIcon = new ImageIcon("res/fix-computer-crash-3.png");
        Image scaledImage = originalIcon.getImage().getScaledInstance(screenWidth, screenHeight, Image.SCALE_SMOOTH);
        JLabel background = new JLabel(new ImageIcon(scaledImage));
        background.setBounds(0, 0, screenWidth, screenHeight);
        layeredPane.add(background, Integer.valueOf(0));

        // 进度条
        JProgressBar progressBar = new JProgressBar(0, 100);
        progressBar.setBounds(screenWidth / 2 - 250, screenHeight - 100, 500, 30);
        progressBar.setForeground(Color.GREEN);
        progressBar.setStringPainted(true);
        progressBar.setString("系统修复中，请稍候...");
        layeredPane.add(progressBar, Integer.valueOf(1));

        // 模拟加载动画
        Timer timer = new Timer(80, null);
        timer.addActionListener(new ActionListener() {
            int value = 0;

            public void actionPerformed(ActionEvent e) {
                if (value <= 100) {
                    progressBar.setValue(value++);
                } else {
                    timer.stop();
                }
            }
        });
        timer.start();

        // 点击退出确认
        background.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                int option = JOptionPane.showConfirmDialog(
                        fullScreenFrame,
                        "你要退出摸鱼吗？",
                        "退出提示",
                        JOptionPane.YES_NO_OPTION
                );

                if (option == JOptionPane.YES_OPTION) {
                    fullScreenFrame.dispose();
                    frame.getContentPane().removeAll();
                    frame.getContentPane().add(initialPanel);
                    frame.revalidate();
                    frame.repaint();
                    frame.setVisible(true);
                }
            }
        });

        fullScreenFrame.setContentPane(layeredPane);
        fullScreenFrame.pack();
        fullScreenFrame.setVisible(true);

    }
}