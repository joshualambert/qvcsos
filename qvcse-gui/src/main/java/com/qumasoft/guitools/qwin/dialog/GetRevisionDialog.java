/*   Copyright 2004-2014 Jim Voris
 *
 *   Licensed under the Apache License, Version 2.0 (the "License");
 *   you may not use this file except in compliance with the License.
 *   You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 *   Unless required by applicable law or agreed to in writing, software
 *   distributed under the License is distributed on an "AS IS" BASIS,
 *   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *   See the License for the specific language governing permissions and
 *   limitations under the License.
 */
package com.qumasoft.guitools.qwin.dialog;

import com.qumasoft.guitools.qwin.QWinFrame;
import com.qumasoft.guitools.qwin.operation.OperationGet;
import com.qumasoft.qvcslib.commandargs.GetRevisionCommandArgs;
import com.qumasoft.qvcslib.MergedInfoInterface;
import com.qumasoft.qvcslib.QVCSException;
import com.qumasoft.qvcslib.Utility;
import java.util.Date;
import java.util.List;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;

/**
 * Get revision dialog.
 * @author  Jim Voris
 */
public class GetRevisionDialog extends AbstractQWinCommandDialog {
    private static final long serialVersionUID = 170221000990738086L;

    private final List selectedFiles;
    private final OperationGet operationGet;
    private Date dateTimeValue;
    private final ImageIcon byDateImageIcon;

    /**
     * Creates new form GetRevisionDialog.
     * @param parent the parent frame.
     * @param files a list of the selected files to get.
     * @param operation the helper to perform the actual get operation.
     */
    public GetRevisionDialog(java.awt.Frame parent, List files, OperationGet operation) {
        super(parent, true);
        this.byDateImageIcon = new ImageIcon("/images/calendarButton_small.png");
        operationGet = operation;
        selectedFiles = files;
        initComponents();
        populateComponents();
        setFont();
        center();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
// <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        revisionToGetLabel = new javax.swing.JLabel();
        revisionToGetComboBox = new javax.swing.JComboBox();
        overwriteWorkfileComboBox = new javax.swing.JComboBox();
        timestampComboBox = new javax.swing.JComboBox();
        byLabelCheckBox = new javax.swing.JCheckBox();
        byLabelComboBox = new javax.swing.JComboBox();
        byDateCheckBox = new javax.swing.JCheckBox();
        byDateTextField = new javax.swing.JTextField();
        byDateButton = new javax.swing.JButton(byDateImageIcon);
        okButton = new javax.swing.JButton();
        cancelButton = new javax.swing.JButton();

        setTitle("Get Revision");
        setName("get dialog"); // NOI18N
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                closeDialog(evt);
            }
        });

        revisionToGetLabel.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        revisionToGetLabel.setText("Revision to get:");
        revisionToGetLabel.setToolTipText("");

        revisionToGetComboBox.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        revisionToGetComboBox.setMaximumRowCount(10);
        revisionToGetComboBox.setToolTipText("Select the revision to get");

        overwriteWorkfileComboBox.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        overwriteWorkfileComboBox.setMaximumRowCount(10);
        overwriteWorkfileComboBox.setToolTipText("");

        timestampComboBox.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        byLabelCheckBox.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        byLabelCheckBox.setMnemonic('l');
        byLabelCheckBox.setText("Get by label");
        byLabelCheckBox.setToolTipText("Enable to retrieve by label instead of by revision");
        byLabelCheckBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                byLabelCheckBoxActionPerformed(evt);
            }
        });

        byLabelComboBox.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        byLabelComboBox.setMaximumRowCount(10);
        byLabelComboBox.setToolTipText("");
        byLabelComboBox.setEnabled(false);

        byDateCheckBox.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        byDateCheckBox.setMnemonic('d');
        byDateCheckBox.setText("Get by date");
        byDateCheckBox.setToolTipText("Enable to retrieve by date  instead of by revision");
        byDateCheckBox.setMargin(new java.awt.Insets(0, 0, 0, 0));
        byDateCheckBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                byDateCheckBoxActionPerformed(evt);
            }
        });

        byDateTextField.setEditable(false);
        byDateTextField.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        byDateTextField.setEnabled(false);

        byDateButton.setIcon(new ImageIcon("images/calendarButton_small.png"));
        byDateButton.setToolTipText("Click to select date/time");
        byDateButton.setAlignmentY(0.0F);
        byDateButton.setBorderPainted(false);
        byDateButton.setContentAreaFilled(false);
        byDateButton.setDefaultCapable(false);
        byDateButton.setDisabledIcon(new ImageIcon("images/calendarButton_small.png"));
        byDateButton.setDisabledSelectedIcon(new ImageIcon("images/calendarButton_small.png"));
        byDateButton.setDoubleBuffered(true);
        byDateButton.setEnabled(false);
        byDateButton.setFocusPainted(false);
        byDateButton.setIconTextGap(0);
        byDateButton.setMargin(new java.awt.Insets(0, 0, 0, 0));
        byDateButton.setPressedIcon(new ImageIcon("images/calendarButton_focus.png"));
        byDateButton.setRolloverIcon(new ImageIcon("images/calendarButton_focus.png"));
        byDateButton.setRolloverSelectedIcon(new ImageIcon("images/calendarButton_focus.png"));
        byDateButton.setSelectedIcon(new ImageIcon("images/calendarButton_focus.png"));
        byDateButton.setVerifyInputWhenFocusTarget(false);
        byDateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                byDateButtonActionPerformed(evt);
            }
        });

        okButton.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        okButton.setText("   OK   ");
        okButton.setMaximumSize(new java.awt.Dimension(80, 25));
        okButton.setMinimumSize(new java.awt.Dimension(80, 25));
        okButton.setPreferredSize(new java.awt.Dimension(80, 25));
        okButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                okButtonActionPerformed(evt);
            }
        });

        cancelButton.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        cancelButton.setText("Cancel");
        cancelButton.setMaximumSize(new java.awt.Dimension(80, 25));
        cancelButton.setMinimumSize(new java.awt.Dimension(80, 25));
        cancelButton.setPreferredSize(new java.awt.Dimension(80, 25));
        cancelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelButtonActionPerformed(evt);
            }
        });

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                .add(layout.createSequentialGroup()
                        .add(10, 10, 10)
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                                .add(revisionToGetLabel, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 320, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                .add(revisionToGetComboBox, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 350, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                .add(overwriteWorkfileComboBox, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 350, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                .add(timestampComboBox, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 350, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                .add(byLabelCheckBox, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 350, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                .add(byLabelComboBox, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 350, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                .add(byDateCheckBox, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 350, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                .add(layout.createSequentialGroup()
                                        .add(byDateTextField, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 324, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                        .add(byDateButton, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 20, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                                .add(layout.createSequentialGroup()
                                        .add(okButton, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 100, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                        .add(148, 148, 148)
                                        .add(cancelButton, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 100, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(12, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                .add(layout.createSequentialGroup()
                        .add(12, 12, 12)
                        .add(revisionToGetLabel)
                        .add(4, 4, 4)
                        .add(revisionToGetComboBox, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .add(3, 3, 3)
                        .add(overwriteWorkfileComboBox, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .add(3, 3, 3)
                        .add(timestampComboBox, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .add(3, 3, 3)
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                                .add(byLabelCheckBox)
                                .add(layout.createSequentialGroup()
                                        .add(20, 20, 20)
                                        .add(byLabelComboBox, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)))
                        .add(3, 3, 3)
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING, false)
                                .add(layout.createSequentialGroup()
                                        .add(byDateCheckBox)
                                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .add(byDateButton, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 20, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                                .add(layout.createSequentialGroup()
                                        .add(20, 20, 20)
                                        .add(byDateTextField, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                                .add(okButton, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                .add(cancelButton, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(30, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void byDateButtonActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_byDateButtonActionPerformed
    {//GEN-HEADEREND:event_byDateButtonActionPerformed
        DateTimeChooserDialog dateTimeChooserDialog;
        if (dateTimeValue == null) {
            dateTimeChooserDialog = new DateTimeChooserDialog(QWinFrame.getQWinFrame());
        } else {
            dateTimeChooserDialog = new DateTimeChooserDialog(QWinFrame.getQWinFrame(), dateTimeValue);
        }

        int x = byDateButton.getX() + byDateButton.getWidth() + 5;
        int y = byDateButton.getY() + byDateButton.getHeight() + 9;
        int dialogX = getX();
        int dialogY = getY();
        dateTimeChooserDialog.setLocation(dialogX + x, dialogY + y);
        dateTimeChooserDialog.setVisible(true);
        if (dateTimeChooserDialog.getIsOK())
        {
            dateTimeValue = dateTimeChooserDialog.getDate();
            byDateTextField.setText(dateTimeValue.toString());
        }
    }//GEN-LAST:event_byDateButtonActionPerformed

    private void byDateCheckBoxActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_byDateCheckBoxActionPerformed
    {//GEN-HEADEREND:event_byDateCheckBoxActionPerformed
        // Add your handling code here:
        Object byDate = byDateCheckBox.getSelectedObjects();
        if (byDate != null) {
            byDateTextField.setEnabled(true);
            byDateButton.setEnabled(true);
            byDateButton.requestFocusInWindow();

            byLabelCheckBox.setEnabled(false);
            revisionToGetComboBox.setEnabled(false);
        } else {
            byLabelCheckBox.setEnabled(true);
            revisionToGetComboBox.setEnabled(true);
            byDateTextField.setEnabled(false);
            byDateButton.setEnabled(false);
        }
    }//GEN-LAST:event_byDateCheckBoxActionPerformed

    private void cancelButtonActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_cancelButtonActionPerformed
    {//GEN-HEADEREND:event_cancelButtonActionPerformed
        closeDialog(null);
    }//GEN-LAST:event_cancelButtonActionPerformed

    private void okButtonActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_okButtonActionPerformed
    {//GEN-HEADEREND:event_okButtonActionPerformed
        try {
            validateUserData();

            closeDialog(null);
            GetRevisionCommandArgs commandArgs = new GetRevisionCommandArgs();
            commandArgs.setRevisionString(getRevisionString());

            commandArgs.setByDateFlag(byDateCheckBox.isSelected());
            commandArgs.setByDateValue(dateTimeValue);

            commandArgs.setByLabelFlag(byLabelCheckBox.isSelected());
            commandArgs.setLabel(getLabelString());

            commandArgs.setTimestampBehavior(getTimestampBehavior());
            setOverwriteAnswer();
            operationGet.completeOperation(selectedFiles, commandArgs);
        } catch (final QVCSException e) {
            // Run the update on the Swing thread.
            Runnable later = new Runnable() {
                @Override
                public void run() {
                    // Let the user know that the password change worked.
                    JOptionPane.showMessageDialog(QWinFrame.getQWinFrame(), e.getLocalizedMessage(), "Invalid Choices", JOptionPane.WARNING_MESSAGE);
                }
            };
            SwingUtilities.invokeLater(later);
        }
    }//GEN-LAST:event_okButtonActionPerformed

    private void byLabelCheckBoxActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_byLabelCheckBoxActionPerformed
    {//GEN-HEADEREND:event_byLabelCheckBoxActionPerformed
        // Add your handling code here:
        Object byLabel = byLabelCheckBox.getSelectedObjects();
        if (byLabel != null) {
            byLabelComboBox.setEnabled(true);
            revisionToGetComboBox.setEnabled(false);
            byLabelComboBox.requestFocusInWindow();
            byDateCheckBox.setEnabled(false);
        } else {
            byLabelComboBox.setEnabled(false);
            revisionToGetComboBox.setEnabled(true);
            byDateCheckBox.setEnabled(true);
        }
    }//GEN-LAST:event_byLabelCheckBoxActionPerformed

    /** Closes the dialog */
    private void closeDialog(java.awt.event.WindowEvent evt)
    {//GEN-FIRST:event_closeDialog
        setVisible(false);
        dispose();
    }//GEN-LAST:event_closeDialog

    @Override
    public void dismissDialog() {
        cancelButtonActionPerformed(null);
    }

    private void populateComponents() {
        if (selectedFiles.size() == 1) {
            revisionToGetComboBox.setModel(new RevisionsComboModel((MergedInfoInterface) selectedFiles.get(0)));
            byLabelComboBox.setModel(new LabelsComboModel((MergedInfoInterface) selectedFiles.get(0)));
        } else if (selectedFiles.size() > 1) {
            revisionToGetComboBox.setModel(new RevisionsComboModel(null));
            byLabelComboBox.setModel(new LabelsComboModel());
        }
        overwriteWorkfileComboBox.setModel(new OverwriteWorkfileComboModel());
        timestampComboBox.setModel(new TimestampComboModel());
    }

    private String getRevisionString() {
        String revisionString = null;
        Object byLabel = byLabelCheckBox.getSelectedObjects();
        Object byDate = byDateCheckBox.getSelectedObjects();

        // Set the revision string only if we're not getting by label or by date.
        if ((byLabel == null) && (byDate == null)) {
            revisionString = (String) revisionToGetComboBox.getModel().getSelectedItem();
        }
        return revisionString;
    }

    private String getLabelString() {
        String labelString = null;
        Object byLabel = byLabelCheckBox.getSelectedObjects();
        if (byLabel != null) {
            labelString = (String) byLabelComboBox.getModel().getSelectedItem();
        }
        return labelString;
    }

    private void setOverwriteAnswer() {
        String answer;
        Object selectedAnswer = overwriteWorkfileComboBox.getSelectedObjects();
        if (selectedAnswer != null) {
            answer = (String) overwriteWorkfileComboBox.getModel().getSelectedItem();
        } else {
            answer = OverwriteWorkfileComboModel.ASK_BEFORE_OVERWRITE;
        }

        // Based on the selection, set the appropriate values on the operation
        // object.
        if (answer.equals(OverwriteWorkfileComboModel.DO_NOT_REPLACE_WORKFILE)) {
            operationGet.setOverwriteAnswerHasBeenCaptured(true);
            operationGet.setOverwriteAnswer(false);
        } else if (answer.equals(OverwriteWorkfileComboModel.REPLACE_WORKFILE)) {
            operationGet.setOverwriteAnswerHasBeenCaptured(true);
            operationGet.setOverwriteAnswer(true);
        }
    }

    private Utility.TimestampBehavior getTimestampBehavior() {
        Utility.TimestampBehavior timeStampBehavior = null;
        Object timeStampString = timestampComboBox.getSelectedObjects();
        if (timeStampString != null) {
            TimestampComboModel model = (TimestampComboModel) timestampComboBox.getModel();
            timeStampBehavior = model.getSelectedTimeStampBehavior();
        }
        return timeStampBehavior;
    }

    private void validateUserData() throws QVCSException {
        if (byLabelCheckBox.isSelected()) {
            if (getLabelString() == null) {
                byLabelComboBox.requestFocusInWindow();
                throw new QVCSException("You must select a label.");
            }
        } else if (byDateCheckBox.isSelected()) {
            if (dateTimeValue == null) {
                throw new QVCSException("You must define a date.");
            }
        }
    }
// Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton byDateButton;
    private javax.swing.JCheckBox byDateCheckBox;
    private javax.swing.JTextField byDateTextField;
    private javax.swing.JCheckBox byLabelCheckBox;
    private javax.swing.JComboBox byLabelComboBox;
    private javax.swing.JButton cancelButton;
    private javax.swing.JButton okButton;
    private javax.swing.JComboBox overwriteWorkfileComboBox;
    private javax.swing.JComboBox revisionToGetComboBox;
    private javax.swing.JLabel revisionToGetLabel;
    private javax.swing.JComboBox timestampComboBox;
// End of variables declaration//GEN-END:variables
}
