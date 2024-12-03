package Dictionnaire;

import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;



public class ListSelectionListenerImpl implements ListSelectionListener {
    private final Couleurs example;
    private final JLabel selectedLabel;
    private final JList<String> itemList;

    public ListSelectionListenerImpl(Couleurs example, JLabel selectedLabel, JList<String> itemList) {
        this.example = example;
        this.selectedLabel = selectedLabel;
        this.itemList = itemList;
    }

    @Override
    public void valueChanged(ListSelectionEvent e) {
        if (!e.getValueIsAdjusting()) {
            String selectedKey = itemList.getSelectedValue();
            if (selectedKey != null) {
                String rgbValue = example.couleurs.get(selectedKey);
                selectedLabel.setText("Selection : " + rgbValue);
            }
        }
    }
}
