package test;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by Administrator on 27.10.2015.
 */
public class MyTaskCalculation extends JFrame
{
    private int tasks = 0;
    private JLabel countLabel;
    private JButton addTasks;
    private JButton removeTasks;

    public MyTaskCalculation(){
        super("Tasks calculation");
        countLabel = new JLabel("Tasks: " + tasks);
        addTasks = new JButton("Add Task");
        removeTasks = new JButton("Remove Task");

        JPanel buttonPanel = new JPanel(new FlowLayout());
        add(countLabel, BorderLayout.NORTH);

        buttonPanel.add(addTasks);
        buttonPanel.add(removeTasks);

        add(buttonPanel, BorderLayout.SOUTH);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        addTasks.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e){
                tasks += 1;
                updateTaskCounter();
            }
        });

        removeTasks.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e){
                if(tasks > 0)
                {
                    tasks -= 1;
                    updateTaskCounter();
                }
            }
        });

    }

    public void updateTaskCounter(){
        countLabel.setText("Tasks: " + tasks);
    };

    public static void main(String[] args)
    {
        MyTaskCalculation app = new MyTaskCalculation();
        app.setVisible(true);
        app.pack();
    }
}


